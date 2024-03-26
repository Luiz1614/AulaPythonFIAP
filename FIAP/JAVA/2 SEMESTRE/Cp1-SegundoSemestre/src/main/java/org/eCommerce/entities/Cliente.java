package org.eCommerce.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Cliente extends _BaseEntity {
    private String nome;
    private String endereco;
    private String email;
    private List<Venda> historicoCompras = new ArrayList<>();

    public Cliente(int id, String nome, String endereco, String email, List<Venda> historicoCompras) {
        super(id);
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.historicoCompras = historicoCompras;
    }

    public Cliente(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Venda> historicoCompras) {
        this.historicoCompras = historicoCompras;
    }

    public void adicionarCompra(Venda venda){
        historicoCompras.add(venda);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cliente.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("endereco='" + endereco + "'")
                .add("email='" + email + "'")
                .add("historicoCompras=" + historicoCompras)
                .toString();
    }
}
