public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortas(){
        System.out.println("Abrindo " + quantidadePortas + " portas do " + getModelo());
    }
    @Override
    public void acelerar(){
        System.out.println("O carro "+ getModelo() +" esta acelerando");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + quantidadePortas +
                '}';
    }
}
