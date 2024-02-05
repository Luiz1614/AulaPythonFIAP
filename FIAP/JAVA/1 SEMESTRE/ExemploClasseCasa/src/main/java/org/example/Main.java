package org.example;

import org.example.cozinha.Eletrodomestico;
import org.example.cozinha.Geladeira;
import org.example.sala.Movel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var fogao = new Eletrodomestico(
                "Eletrolux",
                220,
                "Fogao Eletrico",
                "6 Bocas, Forno Embutido",
                null,
                null,
                null,
                null,
                null
        );

        //=====Instanciação=====
        var geladeira = new Eletrodomestico(
                "Brastemp",
                220,
                "FrostBra",
                "Frost Free - Freezer embaixo, 10L, 2 Portas"
        );

        fogao.Ligar();
        geladeira.Ligar();

        fogao.Desligar();

        //====Chamar/Invocar - função/Metodo======
        var novoEletrodomestico1 = CadastrarEletrodomestico();
        //var novoEletrodomestico2 =CadastrarEletrodomestico();
        //var novoEletrodomestico3 =CadastrarEletrodomestico();

        //var area1 = novoEletrodomestico1.CalcularArea();
        System.out.println(novoEletrodomestico1.getNome());

        //====Nova geladeira, mas pela classe=====
        var geladeira2 = new Geladeira();
        geladeira2.setMarca("Consul");
        geladeira2.setVolts(220);
        geladeira2.setNome("Consult GelaTudo");
        geladeira2.setDescricao("2 Portas, 14L, Reservatorio de agua, Dispenser de gelo");
        geladeira2.setNumeroDePortas(2);
        geladeira2.setVolume(14);
        geladeira2.setTemDispenseDeGelo(true);
        geladeira2.setTemperaturaPadrao(5);
        geladeira2.setTemperaturaMinima(2);
        geladeira2.Ligar();

        var mesa = new Movel();
        mesa.setMaterial("Bambu");
    }

    //====Metodo====
    public static Eletrodomestico CadastrarEletrodomestico()
    {
        var scanner = new Scanner(System.in);
        var novoEletromestico = new Eletrodomestico();

        System.out.println("Por favor digite a marca do eletrdomestico");
        novoEletromestico.setMarca(scanner.nextLine());

        System.out.println("Agora, digite a nome do eletrodmestico");
        novoEletromestico.setNome(scanner.nextLine());

        System.out.println("Agora, digite a descrição do eletrodmestico");
        novoEletromestico.setDescricao(scanner.nextLine());

        System.out.println("Agora, digite a voltagem do eletrodmestico");
        novoEletromestico.setVolts(scanner.nextInt());

        System.out.println(
                "Cadastro concluido: " + novoEletromestico.toString()
        );

        return novoEletromestico;
    }
}