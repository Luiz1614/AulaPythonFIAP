package org.example.sala;

public class Sofa extends Movel {
    private boolean retratil;
    private int numeroDeAssentos;

    public Sofa(){}

    public Sofa(boolean retratil, int numeroDeAssentos) {
        this.retratil = retratil;
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public Sofa(double altura, double largura, double comprimento, String material, String marca, String nome, boolean retratil, int numeroDeAssentos) {
        super(altura, largura, comprimento, material, marca, nome);
        this.retratil = retratil;
        this.numeroDeAssentos = numeroDeAssentos;
    }

    public boolean isRetratil() {
        return retratil;
    }

    public void setRetratil(boolean retratil) {
        this.retratil = retratil;
    }

    public int getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public void setNumeroDeAssentos(int numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }
}
