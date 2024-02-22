package fiap.ddd.entities;

import java.util.StringJoiner;

public class Musica extends _BaseEntity{
    public String nome;
    public int duracao;
    public Album album;

    public Musica(){}

    public Musica(int id, String nome, int duracao, Album album) {
        super(id);
        this.nome = nome;
        this.duracao = duracao;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Musica.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("duracao=" + duracao)
                .add("album=" + album)
                .add("id=" + id)
                .toString();
    }
}
