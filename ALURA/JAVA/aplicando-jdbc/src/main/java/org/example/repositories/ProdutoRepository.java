package org.example.repositories;

import org.example.database.OracleConnection;
import org.example.service.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProdutoRepository {

    private Connection connection;

    public ProdutoRepository(Connection connection) {
        this.connection = connection;
    }

    public ProdutoRepository() {
    }

    public void create(Produto produto) {
        String sql = "INSERT INTO TESTE_PRODUTO(NOME, QUANTIDADE, PRECO) VALUES(?,?,?)";
        try {
            connection = OracleConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getQuantidade());
            statement.setDouble(3, produto.getPreco());
            statement.executeUpdate();

            connection.close();
            statement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> read() {
        PreparedStatement statement;
        ResultSet resultSet;
        List<Produto> produtos = new ArrayList<>();

        String sql = "SELECT * FROM TESTE_PRODUTO ORDER BY COD_PRODUTO";
        try {
            connection = OracleConnection.getConnection();
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt(1));
                produto.setNome(resultSet.getString(2));
                produto.setQuantidade(resultSet.getInt(3));
                produto.setPreco(resultSet.getDouble(4));

                produtos.add(produto);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void update(int id, float valor){
        PreparedStatement statement;
        String sql = "UPDATE TESTE_PRODUTO SET PRECO = ? WHERE COD_PRODUTO = ?";
        try{
            connection = OracleConnection.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setFloat(1, valor);
            statement.setInt(2, id);

            statement.execute();

            connection.close();
            statement.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void delete (Integer id){
        PreparedStatement statement;
        String sql = "DELETE TESTE_PRODUTO WHERE COD_PRODUTO = ?";
        try{
            connection = OracleConnection.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            statement.execute();
            connection.close();
            statement.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
