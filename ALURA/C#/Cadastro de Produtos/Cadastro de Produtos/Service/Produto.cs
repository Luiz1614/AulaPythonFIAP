namespace Cadastro_de_Produtos.Service;

public class Produto
{
    private string nome;
    private int quantidade;
    private double preco;

    public Produto(string nome, int quantidade, double preco)
    {
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
    }

    public Produto(){}
}
