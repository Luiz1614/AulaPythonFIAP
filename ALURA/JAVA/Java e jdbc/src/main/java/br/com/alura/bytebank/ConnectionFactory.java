package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    public static final String USER = "RM553542";
    public static final String PASSWORD = "290405";


    public Connection recuperaConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
