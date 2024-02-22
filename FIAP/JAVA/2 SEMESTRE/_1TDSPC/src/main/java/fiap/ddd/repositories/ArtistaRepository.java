package fiap.ddd.repositories;

import fiap.ddd.entities.Artista;

import java.util.Comparator;
import java.util.List;

public class ArtistaRepository extends _BaseRepositoryImpl<Artista>{
    public List<Artista> BuscarArtistasPorNome(String nome){
        return entities.stream().filter(item -> item.getNome().contains(nome))
                .sorted(Comparator.comparing(Artista::getNome))
                .toList();
    }

    public List<Artista> BuscarArtistasPorNacionalidade(String nacionalidade){
        return entities.stream().filter(item -> item.getNacionalidade().contains(nacionalidade))
                .sorted(Comparator.comparing(Artista::getNome))
                .toList();
    }
}
