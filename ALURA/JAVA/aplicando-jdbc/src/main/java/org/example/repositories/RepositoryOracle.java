package org.example.repositories;

import org.example.service.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepositoryOracle {

    private final String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
    private final String user = "RM553542";
    private final String password = "290405";

    public RepositoryOracle(Connection connection) {
    }

    public void Create(Produto produto) {
        try{
            var connection = DriverManager.getConnection(url, user, password);
            var statement = connection.prepareStatement("INSERT INTO AL_PRODUTO(ID, NOME, PRECO, QUANTIDADE)" + "VALUES (?,?,?,?)");

            statement.setInt(1,produto.getId());
            statement.setString(2,produto.getNome());
            statement.setDouble(3, produto.getPreco());
            statement.setInt(4, produto.getQuantidade());

            var result = statement.executeUpdate();
            System.out.println("Linhas Afetadas: " + result);
            statement.close();
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(){

    }



}
