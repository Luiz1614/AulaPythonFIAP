package org.example.database;

import org.example.service.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;
    }

    public ProdutoDao() {
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Set<Produto> read() {
        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM TESTE_PRODUTO";
        try {
            connection = OracleConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt(1));
                produto.setNome(resultSet.getString(2));
                produto.setQuantidade(resultSet.getInt(3));
                produto.setPreco(resultSet.getDouble(4));

                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
