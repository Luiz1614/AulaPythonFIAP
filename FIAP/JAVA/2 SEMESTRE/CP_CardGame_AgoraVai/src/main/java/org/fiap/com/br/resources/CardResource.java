package org.fiap.com.br.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.fiap.com.br.entities.Card;
import org.fiap.com.br.repositories.CardRepository;

import java.util.List;

@Path("card")
public class CardResource {

    private CardRepository cardRepository = new CardRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Card> Read() {
        return cardRepository.read();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Create(Card card) {
        cardRepository.create(card);
        return Response.status(Response.Status.CREATED).entity(card).build();
    }

    @PUT
    @Path("{cod_carta}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Update(@PathParam("cod_carta") String cod_carta, Card card) {
        cardRepository.update(cod_carta, card);
        return Response.status(Response.Status.NO_CONTENT).build();
    }


    @DELETE
    @Path("{cod_carta}")
    public Response Delete(@PathParam("cod_carta") String cod_carta) {
        cardRepository.delete(cod_carta);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
