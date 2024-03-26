package org.eCommerce.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.eCommerce.entities.Cliente;
import org.eCommerce.utils.LocalDateTimeAdapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ClienteRepository extends _BaseRepositoryImpl<Cliente>{
    public ClienteRepository() {
        super(Cliente.class);
    }

    public void serializeToJson(List<Cliente> lista, String fileName) {
        try {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                    .create();

            FileWriter writer = new FileWriter("JsonFiles/" + fileName);
            gson.toJson(lista, writer);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public List<Cliente> desserializeFromJson(){
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()).setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        try(var jsonReader = new JsonReader(new FileReader("JsonFiles/clientes.json"))){
            Type clienteListType = new TypeToken<ArrayList<Cliente>>() {}.getType();
            ArrayList<Cliente> listaCliente = gson.fromJson(jsonReader, clienteListType);
            return listaCliente;

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

}
