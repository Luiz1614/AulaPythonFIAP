package org.example;

import org.example.database.OracleConnection;
import org.example.database.ProdutoDao;
import org.example.service.Produto;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var novoProduto = new Produto();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\r\nEscolha uma opção:");
            System.out.println("1. Adicionar um produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar um produto");
            System.out.println("4. Deletar um produto");
            System.out.println("0. Sair");
            System.out.print("\r\nDigite a opção desejada: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    novoProduto.adicionarProduto();
                    break;
                case "2":
                    novoProduto.listarProdutos();
                    break;
                case "0":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;




            }
        }
    }
}
