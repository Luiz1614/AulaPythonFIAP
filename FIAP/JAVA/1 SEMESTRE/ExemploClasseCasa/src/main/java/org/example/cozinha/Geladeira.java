package org.example.cozinha;

//1. Geladeira = Classe Herdeira
//2. Eletromestico = Classe herdada
//3. para usar herança só precisa usar a palvra chave extends
// na iniciação da classe
public class Geladeira extends Eletrodomestico {
    private int numeroDePortas;
    private boolean temDispenseDeGelo;
    private int volume;
    private int temperaturaMinima;
    private int temperaturaPadrao;

    public Geladeira(){}

    public Geladeira(int numeroDePortas, boolean temDispenseDeGelo, int volume, int temperaturaMinima, int temperaturaPadrao) {
        this.numeroDePortas = numeroDePortas;
        this.temDispenseDeGelo = temDispenseDeGelo;
        this.volume = volume;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaPadrao = temperaturaPadrao;
    }

    public Geladeira(String marca, int volts, String nome, String descricao, int numeroDePortas, boolean temDispenseDeGelo, int volume, int temperaturaMinima, int temperaturaPadrao) {
        super(marca, volts, nome, descricao);
        this.numeroDePortas = numeroDePortas;
        this.temDispenseDeGelo = temDispenseDeGelo;
        this.volume = volume;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaPadrao = temperaturaPadrao;
    }

    public Geladeira(String marca, int volts, String nome, String descricao, Double altura, Double largura, Double comprimento, Double peso, String cor, int numeroDePortas, boolean temDispenseDeGelo, int volume, int temperaturaMinima, int temperaturaPadrao) {
        super(marca, volts, nome, descricao, altura, largura, comprimento, peso, cor);
        this.numeroDePortas = numeroDePortas;
        this.temDispenseDeGelo = temDispenseDeGelo;
        this.volume = volume;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaPadrao = temperaturaPadrao;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isTemDispenseDeGelo() {
        return temDispenseDeGelo;
    }

    public void setTemDispenseDeGelo(boolean temDispenseDeGelo) {
        this.temDispenseDeGelo = temDispenseDeGelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaPadrao() {
        return temperaturaPadrao;
    }

    public void setTemperaturaPadrao(int temperaturaPadrao) {
        this.temperaturaPadrao = temperaturaPadrao;
    }

    //Polimorfismo = usar a função de uma classe pai na
    // classe filho
    @Override
    public void Ligar()
    {
        super.Ligar();
        Resfriar();
    }

    private void Resfriar()
    {
        System.out.println("Temperatura caindo");
    }

    @Override
    public String toString() {
        return "Geladeira{" +
                "numeroDePortas=" + numeroDePortas +
                ", temDispenseDeGelo=" + temDispenseDeGelo +
                ", volume=" + volume +
                ", temperaturaMinima=" + temperaturaMinima +
                ", temperaturaPadrao=" + temperaturaPadrao +
                "} " + super.toString();
    }
}
