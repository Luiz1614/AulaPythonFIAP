package org.example.service;

import org.example.database.OracleConnection;
import org.example.repositories.ProdutoRepository;

import java.sql.SQLException;
import java.util.*;

public class Produto extends _BaseEntity{
      private String nome;
      private double preco;
      private int quantidade;


    public Produto(int id, String nome, double preco, int quantidade) {
        super(id);
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        try {
            var connection = OracleConnection.getConnection();
            var produtoDao = new ProdutoRepository();
            produtoDao.create(produto);
            System.out.println("Produto adicionado com sucesso!");

            connection.close();
        }
        catch (SQLException e) {
            System.out.println("Erro ao adicionar o produto.");
            e.printStackTrace();
        }
    }

    public void listarProdutos(){
        try{
            var connection = OracleConnection.getConnection();
            var produtoDao = new ProdutoRepository();
            List<Produto> produtos = produtoDao.read();

            for (Produto produto: produtos){
                System.out.println(produto);
            }
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void alterarValorProduto(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do produto que deseja alterar: ");
        int id = scanner.nextInt();

        System.out.print("Digite o novo valor do produto: ");
        float valor = scanner.nextFloat();

        try{
            var connection = OracleConnection.getConnection();
            var produtoDao = new ProdutoRepository(connection);
            produtoDao.update(id, valor);

            System.out.println("Valor do produto alterado com sucesso!");
        }
        catch (SQLException e){
            System.out.println("Erro ao atualizar o valor do produto.");
            e.printStackTrace();
        }
    }

    public void deletarProduto(){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o ID da conta que deseja excluir: ");
        Integer id  = scanner.nextInt();

        try{
            var connection = OracleConnection.getConnection();
            var produtoRepository = new ProdutoRepository();
            produtoRepository.delete(id);

            System.out.println("Conta deletada com sucesso!");
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Produto.class.getSimpleName() + "[", "]")
                .add("ID: " + super.getId())
                .add("Nome: " + nome)
                .add("Valor Unitário: " + preco)
                .add("Quantidade em Estoque: " + quantidade)
                .toString();
    }
}
