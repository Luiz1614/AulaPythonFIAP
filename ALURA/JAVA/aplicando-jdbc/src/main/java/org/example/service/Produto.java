package org.example.service;

import org.example.repositories.RepositoryOracle;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Produto  extends _BaseEntity{
      private String nome;
      private double preco;
      private int quantidade;


    public Produto(int id, String nome, double preco, int quantidade) {
        super(id);
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto(){
        super(0);
    }

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

        System.out.println("Digite o ID do produto:");
        int id = scanner.nextInt();

        System.out.println("Digite o nome do produto:");
        scanner.nextLine(); // Consumir a quebra de linha restante
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(id, nome, preco, quantidade);

        try {
            var connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM553542", "290405");
            var repositoryOracle = new RepositoryOracle(connection);
            repositoryOracle.Create(produto);
            System.out.println("Produto adicionado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar o produto.");
            e.printStackTrace();
        }
    }

    public void removerProduto(){
        var scanner = new Scanner(System.in);
        System.out.println("Digite o ID do produto que deseja remover:");
        int idDigitado = scanner.nextInt();
        if (idDigitado == this.getId()){
            try {
                var connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM553542", "290405");
                var repositoryOracle = new RepositoryOracle(connection);
                repositoryOracle.Delete(this);
                System.out.println("Produto removido com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao remover o produto.");
                e.printStackTrace();
            }
        } else {
            System.out.println("ID do produto não encontrado.");
        }
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Produto.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("preco=" + preco)
                .add("quantidade=" + quantidade)
                .toString();
    }
}
