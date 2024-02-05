package org.example.cozinha;

//=====Classe======
public class Eletrodomestico {

    //=====Atributos ========
    private String marca;
    private int volts;
    private String nome;
    private String descricao;
    private Double altura;
    private Double largura;
    private Double comprimento;
    private Double peso;
    private String cor;

    public Eletrodomestico(){}

    public Eletrodomestico(String marca, int volts, String nome, String descricao) {
        this.marca = marca;
        this.volts = volts;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Eletrodomestico(String marca, int volts, String nome, String descricao, Double altura, Double largura, Double comprimento, Double peso, String cor) {
        this.marca = marca;
        this.volts = volts;
        this.nome = nome;
        this.descricao = descricao;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //======Metodo/Função=====
    public void Ligar() {
        System.out.println(nome + ": Ligando");
    }

    public void Desligar() {
        System.out.println(nome + ": Desligando");
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "marca='" + marca + '\'' +
                ", volts=" + volts +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", peso=" + peso +
                '}';
    }

    public double CalcularArea()
    {
        return altura * largura * comprimento;
    }
}