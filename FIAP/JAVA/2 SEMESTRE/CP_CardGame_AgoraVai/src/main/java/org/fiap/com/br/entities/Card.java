package org.fiap.com.br.entities;

import java.util.StringJoiner;

public class Card {
    private String cod_carta;
    private String nome;
    private int velocidade;
    private int cilindradas;
    private double zeroCem;
    private int potencia;
    private double comprimento;
    private int peso;
    private boolean isSuperTrunfo;

    public Card() {
    }

    public Card(String cod_carta, String nome, int velocidade, int cilindradas, double zeroCem, int potencia, double comprimento, int peso, boolean isSuperTrunfo) {
        this.cod_carta = cod_carta;
        this.nome = nome;
        this.velocidade = velocidade;
        this.cilindradas = cilindradas;
        this.zeroCem = zeroCem;
        this.potencia = potencia;
        this.comprimento = comprimento;
        this.peso = peso;
        this.isSuperTrunfo = isSuperTrunfo;
    }

    public String getCod_carta() {
        return cod_carta;
    }

    public void setCod_carta(String cod_carta) {
        this.cod_carta = cod_carta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public double getZeroCem() {
        return zeroCem;
    }

    public void setZeroCem(double zeroCem) {
        this.zeroCem = zeroCem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isSuperTrunfo() {
        return isSuperTrunfo;
    }

    public void setSuperTrunfo(boolean superTrunfo) {
        isSuperTrunfo = superTrunfo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "\r\n" + Card.class.getSimpleName() + "[", "]")
                .add("Codigo: " + cod_carta)
                .add("Nome: " + nome)
                .add("Velocidade: " + velocidade)
                .add("Cilindradas: " + cilindradas)
                .add("Zero a Cem: " + zeroCem)
                .add("Potencia: " + potencia)
                .add("Comprimento: " + comprimento)
                .add("Peso: " + peso)
                .add("Super Trunfo: " + isSuperTrunfo)
                .toString();
    }
}
