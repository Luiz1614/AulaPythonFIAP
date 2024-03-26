package org.eCommerce.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Venda extends _BaseEntity{
    private transient Cliente cliente;
    private List<ItemVenda> itemVenda = new ArrayList<>();
    private LocalDateTime data;
    private double valorTotal;

    public Venda(int id, Cliente cliente, List<ItemVenda> itemVenda) {
        super(id);
        this.cliente = cliente;
        this.itemVenda = itemVenda;
        this.data = LocalDateTime.now();
        this.valorTotal = calcularTotal(itemVenda);
        this.adicionarVendaCliente(this.cliente);
    }

    public Venda(){}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(List<ItemVenda> itemVenda) {
        this.itemVenda = itemVenda;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularTotal(List<ItemVenda> itemVenda){
        for (ItemVenda item : itemVenda ){
            valorTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void adicionarVendaCliente(Cliente cliente){
        cliente.getHistoricoCompras().add(this);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Venda.class.getSimpleName() + "[", "]")
                .add("cliente=" + cliente)
                .add("itemVenda=" + itemVenda)
                .add("data=" + data)
                .add("valorTotal=" + valorTotal)
                .toString();
    }
}
