package fiap.tds.resources;

import fiap.tds.entities.Produto;
import fiap.tds.entities.dtos.SearchProdutoDto;
import fiap.tds.repositories.ProdutoRepository;
import fiap.tds.services.ProdutoService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("produto")
public class ProdutoResource {

    public ProdutoRepository produtoRepository;
    public ProdutoService produtoService;

    public ProdutoResource(){
        produtoRepository = new ProdutoRepository();
        produtoService = new ProdutoService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(
            @QueryParam("orderby") String orderBy,
            @QueryParam("direction") String direction,
            @QueryParam("limit") int limit,
            @QueryParam("offset") int offset,
            @QueryParam("nome") String nome,
            @QueryParam("preco") double preco
    ){
       return Response.ok(produtoService.getAll(nome, preco,
               orderBy,direction, limit, offset)).build();
    }

    @GET
    @Path("categoria/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllByCategoria(@PathParam("id") int idCategoria){
        return Response.ok(produtoRepository.getAllByCategoria(idCategoria)).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id){
        var produto = produtoRepository.get(id);
        return produto.isPresent() ?
                Response.ok(produto.get()).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Produto produto){
        try{
            produtoService.create(produto);
            return Response.status(Response.Status.CREATED).build();
        }
        catch(IllegalArgumentException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Produto produto){
        try{
            produtoService.update(id, produto);
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        catch(IllegalArgumentException e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") int id){

    }
}
