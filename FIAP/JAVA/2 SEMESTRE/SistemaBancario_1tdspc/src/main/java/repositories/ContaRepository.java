package repositories;

import models.Conta;
import models.ContaCorrente;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaRepository <T extends Conta> implements CrudRepository<Conta> {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    public static final String USER = "RM553542";
    public static final String PASSWORD = "290405";

    @Override
    public void create(Conta obj) {
        try {
            var conn = DriverManager.getConnection(URL, USER, PASSWORD);
            var st = conn.prepareStatement("INSERT INTO TB_CONTA (NUMERO_CONTA, SALDO) VALUES (?, ?)");
            st.setString(1, obj.getNumero());
            st.setFloat(2, obj.getSaldo());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Conta> read() {
        var contas = new ArrayList<Conta>();

        try {
            var connection = DriverManager.getConnection(URL, USER, PASSWORD);
            var st = conn.prepareStatement("SELECT * FROM TB_CONTA");
            var resultSet = st.executeQuery();

            while(resultSet.next()){
                var conta = new ContaCorrente();
                conta.setId(resultSet.getInt("ID"));
                conta.setNumero(resultSet.getString("NUMERO_CONTA"));
                conta.setSaldo(resultSet.getFloat("SALDO"));
                contas.add(conta);
            }
            return contas;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(Conta obj) {

    }

    @Override
    public void delete(int id) {

    }
}
