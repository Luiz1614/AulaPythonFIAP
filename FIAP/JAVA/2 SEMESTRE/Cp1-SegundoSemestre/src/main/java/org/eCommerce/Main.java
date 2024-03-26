package org.eCommerce;

import com.google.gson.Gson;
import org.eCommerce.entities.Cliente;
import org.eCommerce.entities.ItemVenda;
import org.eCommerce.entities.Produto;
import org.eCommerce.entities.Venda;
import org.eCommerce.repositories.ClienteRepository;
import org.eCommerce.repositories.ItemVendaRepository;
import org.eCommerce.repositories.ProdutoRepository;
import org.eCommerce.repositories.VendaRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        List<ItemVenda> itensVenda = new ArrayList<>();
        List<Venda> vendas = new ArrayList<>();

        ClienteRepository clienteRepository = new ClienteRepository();
        ProdutoRepository produtoRepository = new ProdutoRepository();
        ItemVendaRepository itemVendaRepository = new ItemVendaRepository();
        VendaRepository vendaRepository = new VendaRepository();

        clientes.add(new Cliente(1, "Ricardo", "Rua 1", "Ricardo@gmail.com", new ArrayList<>()));
        clientes.add(new Cliente(2, "Julia", "Rua 2", "Julia@gmail.com", new ArrayList<>()));

        produtos.add(new Produto(1, "Produto 1", "Produto1", 100, 10));
        produtos.add(new Produto(2, "Produto 2", "Produto2", 200, 20));
        produtos.add(new Produto(3, "Produto 3", "Produto3", 300, 30));

        itensVenda.add(new ItemVenda(1, 5, produtos.get(0)));
        itensVenda.add(new ItemVenda(2, 10, produtos.get(1)));
        itensVenda.add(new ItemVenda(3, 15, produtos.get(2)));
        vendas.add(new Venda(1, clientes.get(0), new ArrayList<>(
                List.of(
                        itensVenda.get(0),
                        itensVenda.get(1)
                )
        )));
        vendas.add(new Venda(2, clientes.get(1), new ArrayList<>(
                List.of(
                        itensVenda.get(1),
                        itensVenda.get(2)
                )
        )));
        vendas.add(new Venda(3, clientes.get(0), new ArrayList<>(
                List.of(
                        itensVenda.get(0),
                        itensVenda.get(2)
                )
        )));

        clienteRepository.serializeToJson(clientes, "Clientes.json");
        System.out.println(clienteRepository.desserializeFromJson());

    }
}
