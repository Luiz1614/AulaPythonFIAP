package org.example.sala;

public class Movel {
    private double altura;
    private double largura;
    private double comprimento;
    private String material;
    private String marca;
    private String nome;

    //======construtor vazio=====
    public Movel(){}

    //=====construtor completo====
    public Movel(double altura, double largura, double comprimento, String material, String marca, String nome) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.material = material;
        this.marca = marca;
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
