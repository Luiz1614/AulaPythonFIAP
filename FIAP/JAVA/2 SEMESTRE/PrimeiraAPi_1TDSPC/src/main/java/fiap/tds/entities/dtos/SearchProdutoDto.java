package fiap.tds.entities.dtos;

import fiap.tds.entities.Produto;

import java.util.List;

public record SearchProdutoDto(String nome, double preco, String orderBy,
                               String direction, int limit, int offset, int totalItems, List<Produto> produtos){

}
