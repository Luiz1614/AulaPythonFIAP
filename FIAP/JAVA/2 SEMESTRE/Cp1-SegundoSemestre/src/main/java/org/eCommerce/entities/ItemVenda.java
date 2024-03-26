package org.eCommerce.entities;

import java.util.StringJoiner;

public class ItemVenda extends _BaseEntity{
    private Produto produto;
    private int quantidade;

    public ItemVenda(int id, int quantidade, Produto produto) {
        super(id);
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemVenda(){}

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ItemVenda.class.getSimpleName() + "[", "]")
                .add("produto=" + produto)
                .add("quantidade=" + quantidade)
                .toString();
    }
}
