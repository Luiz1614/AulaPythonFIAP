public class Moto extends Veiculo{
    private String tipoMoto;
    public Moto(String marca, String modelo, int ano, String tipoMoto) {
        super(marca, modelo, ano);
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public void empinar(){
        System.out.println("A moto " + getModelo() + " do tipo " + tipoMoto + " está empinando");
    }

    @Override
    public void acelerar(){
        System.out.println("A moto " + getModelo() + " está acelerando");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoMoto='" + tipoMoto + '\'' +
                '}';
    }
}
