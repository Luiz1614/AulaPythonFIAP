package org.example;

import org.example.repositories.RepositoryOracle;
import org.example.service.Produto;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var produto = new Produto(1, "Celular", 10.0, 10);
        var produto2 = new Produto(2, "Notebook", 20.0, 20);
        var produto3 = new Produto();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar um produto");
            System.out.println("0. Sair");
            System.out.print("\r\nDigite a opção desejada: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    produto3.adicionarProduto();
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
