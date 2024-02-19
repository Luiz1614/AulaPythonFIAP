def comprar_produto(produto = "Produto desconhecido", quantidade = 1):
    return f'\nCompra[ ' \
           f'\nProduto: {produto}' \
           f'\nQuantidade: {quantidade}' \
           f'\n]'

print(comprar_produto())
