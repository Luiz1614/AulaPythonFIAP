package fiap.ddd;

import fiap.ddd.entities.Album;
import fiap.ddd.entities.Artista;
import fiap.ddd.repositories.AlbumRespository;
import fiap.ddd.repositories.ArtistaRepository;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        var artistarepo = new ArtistaRepository();
        var albumrepo = new AlbumRespository();

        var artista = new Artista(1, "Iron Maiden", "Inglaterra","Heavy Metal",
                "O Iron Maindn é uma banda de heavy metal");
        var album = new Album(1, "The Number of the Beast", 1982, artista);

        artistarepo.Create(artista);
        artistarepo.ReadAll().forEach(System.out::println);

        albumrepo.Create(album);
        albumrepo.ReadAll().forEach(System.out::println);

        //criar um arquivo txt no unix file system
        // no windows, o sistema de arquivos é diferente, ex: C:/user/documents/teste.txt
        // no mac ou no linux, o sistema operacional ele utiliza o sistema de arquivos unix,
        // então o caminho do arquivo é /tmp/teste.txt

        File file = new File("/Users/leonardo.romao/documents/teste.txt");

        if(!file.exists()) {
            try {
                file.createNewFile();
                //escrever no arquivo
                //try with resources
                try(var writer = new FileWriter(file)){
                    writer.write("Teste de escrita no arquivo\r\n");
                    writer.write(LocalDateTime.now().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}