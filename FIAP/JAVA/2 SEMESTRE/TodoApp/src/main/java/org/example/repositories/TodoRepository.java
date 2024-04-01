package org.example.repositories;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entities.Todo;
import org.example.entities.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository extends _BaseRepositoryImpl<Todo> {
    public Todo findByTitle(String title){
        return entidades.stream()
                .filter(e -> e.getTitle().contains(title))
                .findFirst()
                .orElse(null);
    }

    public List<Todo> findAllByTitle(String title){
        return entidades.stream()
                .filter(e -> e.getTitle().contains(title))
                .toList();
    }

    public List<Todo> findAllDone(){
        return entidades.stream().filter(Todo::isDone).toList();
    }

    public void exportToTxt(){
        try{
            var file = new File("exports/", "todo_" + LocalDateTime.now() + ".txt");
            var fileWriter = new FileWriter(file);
            for (var todo : entidades)
                fileWriter.write(todo.toString() + "\n");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void exportToJson(boolean isDone)  {
        var json = isDone ? new Gson().toJson(findAllDone()) : new Gson().toJson(entidades);

        var file = new File("exports/","todo_"+ LocalDateTime.now() + ".json");
        //TODO: Verificar se há espaço suficiente
        //logInfo("Espaço livre: " + file.getFreeSpace() + " bytes");
        //if(file.getUsableSpace() > 1000) {
            try {
                var fileWriter = new FileWriter(file);
                fileWriter.write(json);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        //}
        //else
            //logWarn("Espaço insuficiente");
    }


}
