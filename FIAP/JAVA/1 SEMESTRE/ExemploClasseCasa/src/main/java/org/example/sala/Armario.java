package org.example.sala;

public class Armario extends Movel{
    private int numeroDePortas;
    private int numeroDeGavetas;

    public Armario(int numeroDePortas, int numeroDeGavetas) {
        this.numeroDePortas = numeroDePortas;
        this.numeroDeGavetas = numeroDeGavetas;
    }

    public Armario(double altura, double largura, double comprimento, String material, String marca, String nome, int numeroDePortas, int numeroDeGavetas) {
        super(altura, largura, comprimento, material, marca, nome);
        this.numeroDePortas = numeroDePortas;
        this.numeroDeGavetas = numeroDeGavetas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDeGavetas() {
        return numeroDeGavetas;
    }

    public void setNumeroDeGavetas(int numeroDeGavetas) {
        this.numeroDeGavetas = numeroDeGavetas;
    }
}
