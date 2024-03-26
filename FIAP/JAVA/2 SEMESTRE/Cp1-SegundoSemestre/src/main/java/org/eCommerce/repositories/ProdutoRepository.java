package org.eCommerce.repositories;
import org.eCommerce.entities.Produto;

public class ProdutoRepository extends _BaseRepositoryImpl<Produto>{
    public ProdutoRepository() {
        super(Produto.class);
    }

}
