package fiap.ddd.entities;

import java.util.StringJoiner;

public class Album extends _BaseEntity{
    private String nome;
    private int anoLancamento;
    private Artista artista;

    public Album(){}

    public Album(int id, String nome, int anoLancamento, Artista artista) {
        super(id);
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Album.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("anoLancamento=" + anoLancamento)
                .add("artista=" + artista)
                .add("id=" + id)
                .toString();
    }
}
