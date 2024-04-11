package fiap.tds.services;

import fiap.tds.entities.Produto;
import fiap.tds.entities.dtos.SearchProdutoDto;
import fiap.tds.repositories.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(){
        produtoRepository = new ProdutoRepository();
    }

    public SearchProdutoDto getAll(String nome, double preco,
                                   String orderBy, String direction, int limit, int offset){
        var produtos = produtoRepository.getAll(nome, preco, orderBy, direction, limit, offset);
        var totalItems = produtoRepository.count(nome, preco);
        return new SearchProdutoDto(nome,preco, orderBy, direction, limit, offset, totalItems, produtos);
    }

    public void create(Produto produto){
        var validation = produto.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            produtoRepository.create(produto);
    }

    public void update(int id, Produto produto){
        var validation = produto.validate();

        if(validation.containsKey(false))
            throw new IllegalArgumentException(validation.get(false).toString());
        else
            produtoRepository.update(id, produto);
    }
}
