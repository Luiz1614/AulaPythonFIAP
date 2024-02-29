package org.example;

import org.example.entities.ToDo;
import org.example.repositories.ToDoRepository;

public class Main {
    public static void main(String[] args) {

        var todoRepo = new ToDoRepository();

        var novaTarefa = new ToDo(1, "Varrer a casa", "A casa está suja depois da que veio visitas", false);
        var novaTarefa2 = new ToDo(2, "Encerar o chão", "O chão ta sujo e escorregadio", false);


        todoRepo.create(novaTarefa);
        todoRepo.create(novaTarefa2);
        System.out.println(todoRepo.read());

        novaTarefa2.setDone(true);
        todoRepo.update(novaTarefa2);
        System.out.println(todoRepo.read());
    }
}