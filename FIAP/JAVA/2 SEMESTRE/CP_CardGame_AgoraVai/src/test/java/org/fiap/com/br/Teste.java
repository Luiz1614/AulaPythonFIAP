package org.fiap.com.br;
import org.fiap.com.br.entities.Card;
import org.fiap.com.br.repositories.CardRepository;

public class Teste {
    public static void main(String[] args) {
        CardRepository cardRepository = new CardRepository();
        var card = new Card("A1", "Fusca", 100, 1000, 10.0, 100, 100.0, 1000, false);
        cardRepository.create(card);
        var card2 = new Card("A2", "Saveiro", 100, 1000, 10.0, 100, 100.0, 1000, false);
        cardRepository.create(card2);
        var card3 = new Card("A3", "Jetta", 100, 1000, 10.0, 100, 100.0, 1000, false);
        cardRepository.create(card3);
        cardRepository.delete("A3");
        System.out.println(cardRepository.read());

    }




}
