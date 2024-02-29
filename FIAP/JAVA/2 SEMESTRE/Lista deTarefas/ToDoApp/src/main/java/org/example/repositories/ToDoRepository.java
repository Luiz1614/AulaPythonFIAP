package org.example.repositories;

import org.example.entities.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {
    private List<ToDo> listaDeTarefas = new ArrayList<>();

    public void create(ToDo toDo){
        listaDeTarefas.add(toDo);
    }

    public List<ToDo> read(){
        return listaDeTarefas;
    }

    public void update(ToDo toDo){
        for (ToDo tarefa : listaDeTarefas){
            if (tarefa.getTitle().equals(toDo.getTitle())){
                tarefa.setDescription(toDo.getDescription());
                tarefa.setDone(toDo.isDone());
            }
        }
    }

    public void delete(String title){
        for(ToDo tarefa : listaDeTarefas){
            if (tarefa.getTitle().equals(title)){
                listaDeTarefas.remove(tarefa);
                break;
            }
        }
    }
}
