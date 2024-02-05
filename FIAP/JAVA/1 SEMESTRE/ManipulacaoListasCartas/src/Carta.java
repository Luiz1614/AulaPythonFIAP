public class Carta implements {
    private String nome;
    private String tipo;
    private String raridade;
    private double preco;

    public Carta(){};

    public Carta(String nome, String tipo, String raridade, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.raridade = raridade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raridade='" + raridade + '\'' +
                ", preco=" + preco +
                '}';
    }
}
