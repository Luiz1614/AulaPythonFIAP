package org.fiap.com.br.repositories;

import org.fiap.com.br.connection.OracleDbConfiguration;
import org.fiap.com.br.entities.Colecao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColecaoRepository {
    public static final String TB_NAME = "CP_COLECAO";

    OracleDbConfiguration oracleDbConfiguration = new OracleDbConfiguration();

    public void create(Colecao colecao) {
        try (var conn = oracleDbConfiguration.getConnection()) {
            var stmt = conn.prepareStatement("INSERT INTO " + TB_NAME + " (NOME) VALUES (?)");
            stmt.setString(1, colecao.getNome());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Colecao> read(){
        List<Colecao> colecoes = new ArrayList<>();
        try (var conn = oracleDbConfiguration.getConnection()) {
            var stmt = conn.prepareStatement("SELECT * FROM " + TB_NAME + " JOIN CP_CARD ON " + TB_NAME + ".COD_COLECAO = CP_CARD.COD_COLECAO ORDER BY " + TB_NAME + ".COD_COLECAO");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Colecao colecao = new Colecao();
                colecao.setCod_colecao(rs.getInt("COD_COLECAO"));
                colecao.setNome(rs.getString("NOME"));
                colecoes.add(colecao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return colecoes;
    }

    public void update(Colecao colecao) {
        try (var conn = oracleDbConfiguration.getConnection()) {
            var stmt = conn.prepareStatement("UPDATE " + TB_NAME + " SET NOME = ? WHERE COD_COLECAO = ?");
            stmt.setString(1, colecao.getNome());
            stmt.setInt(2, colecao.getCod_colecao());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
