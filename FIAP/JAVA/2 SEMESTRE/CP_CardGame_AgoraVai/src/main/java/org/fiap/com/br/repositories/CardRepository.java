package org.fiap.com.br.repositories;

import org.fiap.com.br.connection.OracleDbConfiguration;
import org.fiap.com.br.entities.Card;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CardRepository {
    public static final String TB_NAME = "CP_CARD";

    OracleDbConfiguration oracleDbConfiguration = new OracleDbConfiguration();

    public CardRepository() {
        Initialize();
    }

    public void Initialize() {
        try {
            // Cria um ScriptRunner, que irá executar o seu script SQL
            try (var conn = oracleDbConfiguration.getConnection()) {
                try(var stmt = conn.prepareStatement("DECLARE\n" +
                        "    v_count NUMBER;\n" +
                        "BEGIN\n" +
                        "    SELECT COUNT(*)\n" +
                        "    INTO v_count\n" +
                        "    FROM USER_TABLES\n" +
                        "    WHERE TABLE_NAME = 'CP_CARD';\n" +
                        "\n" +
                        "    IF v_count = 1 THEN\n" +
                        "        EXECUTE IMMEDIATE 'DROP TABLE cp_card CASCADE CONSTRAINTS';\n" +
                        "    END IF;\n" +
                        "END;")) {
                    stmt.execute();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = new String(Files.readAllBytes(Paths.get("SQL/script.sql")), Charset.forName("ISO-8859-1"));

            // Divide a string SQL em vários comandos
            String[] sqlCommands = sql.split(";");

            // Executa cada comando SQL individualmente
            try (var conn = oracleDbConfiguration.getConnection(); var stmt = conn.createStatement()) {
                for (String command : sqlCommands) {
                    if (!command.trim().isEmpty()) {
                        stmt.executeUpdate(command);
                    }
                }
                System.out.println("Banco de dados resetado!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void create(Card card){
        try(var conn = oracleDbConfiguration.getConnection()){
            var stmt = conn.prepareStatement("INSERT INTO " + TB_NAME + " (COD_CARTA, NOME, VELOCIDADE, CILINDRADAS, ZEROCEM, POTENCIA, COMPRIMENTO, PESO, IS_SUPERTRUNFO) VALUES (?,?,?,?,?,?,?,?,?)");
            {
                stmt.setString(1, card.getCod_carta());
                stmt.setString(2, card.getNome());
                stmt.setInt(3, card.getVelocidade());
                stmt.setInt(4, card.getCilindradas());
                stmt.setDouble(5, card.getZeroCem());
                stmt.setInt(6, card.getPotencia());
                stmt.setDouble(7, card.getComprimento());
                stmt.setInt(8, card.getPeso());
                stmt.setString(9, card.isSuperTrunfo() ? "1" : "0");

                stmt.executeUpdate();
                conn.close();
                stmt.close();
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Card> read() {
        List<Card> cards = new ArrayList<>();
        try (var conn = oracleDbConfiguration.getConnection()) {
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Card card = new Card();
                card.setCod_carta(rs.getString("COD_CARTA"));
                card.setNome(rs.getString("NOME"));
                card.setVelocidade(rs.getInt("VELOCIDADE"));
                card.setCilindradas(rs.getInt("CILINDRADAS"));
                card.setZeroCem(rs.getDouble("ZEROCEM"));
                card.setPotencia(rs.getInt("POTENCIA"));
                card.setComprimento(rs.getDouble("COMPRIMENTO"));
                card.setPeso(rs.getInt("PESO"));
                card.setSuperTrunfo(rs.getString("IS_SUPERTRUNFO").equals("1"));
                cards.add(card);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cards;
    }

    public void delete(String cod_carta) {
        try (var conn = oracleDbConfiguration.getConnection()) {
            var stmt = conn.prepareStatement("DELETE FROM " + TB_NAME + " WHERE COD_CARTA = ?");
            stmt.setString(1, cod_carta);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
