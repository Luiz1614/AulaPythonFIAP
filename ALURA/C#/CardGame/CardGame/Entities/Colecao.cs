namespace CardGame.Entities;

public class Colecao
{
    public int Cod_colecao { get; set; }
    public string Nome { get; set; }
    public List<Carta> Cartas { get; set; }


    public Colecao() { }
    public Colecao(int cod_colecao, string nome, List<Carta> cartas)
    {
        Cod_colecao=cod_colecao;
        Nome=nome;
        Cartas=cartas;
    }
}
