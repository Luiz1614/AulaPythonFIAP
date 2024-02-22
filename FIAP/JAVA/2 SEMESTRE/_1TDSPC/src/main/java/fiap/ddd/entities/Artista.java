package fiap.ddd.entities;

import java.util.StringJoiner;

public class Artista extends _BaseEntity{
    private String Nome;
    private String Nacionalidade;
    private String Genero;
    private String Biografia;

    public Artista(){}

    public Artista(int id, String nome, String nacionalidade, String genero, String biografia) {
        super(id);
        Nome = nome;
        Nacionalidade = nacionalidade;
        Genero = genero;
        Biografia = biografia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String biografia) {
        Biografia = biografia;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Artista.class.getSimpleName() + "[", "]")
                .add("Nome='" + Nome + "'")
                .add("Nacionalidade='" + Nacionalidade + "'")
                .add("Genero='" + Genero + "'")
                .add("Biografia='" + Biografia + "'")
                .add("id=" + id)
                .toString();
    }
}
