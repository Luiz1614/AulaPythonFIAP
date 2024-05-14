namespace CardGame.Entities;

public class Carta
{
    public string Cod_carta {  get; set; }
    public string Nome { get; set; }
    public int Velocidade { get; set; }
    public int Peso { get; set; }
    public int Cilindradas { get; set; }
    public int Cod_colecao { get; set; }


    public Carta() { }

    public Carta(string cod_carta, string nome, int velocidade, int peso, int cilindradas, int cod_colecao)
    {
        Cod_carta=cod_carta;
        Nome=nome;
        Velocidade=velocidade;
        Peso=peso;
        Cilindradas=cilindradas;
        Cod_colecao=cod_colecao;
    }

    
}
