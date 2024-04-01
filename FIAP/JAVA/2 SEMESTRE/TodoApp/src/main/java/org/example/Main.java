package org.example;

import org.example.entities.Todo;
import org.example.repositories.TodoRepository;

public class Main {
    public static void main(String[] args) {
        var todoRepo = new TodoRepository();
        var novaTarefa = new Todo(1,"Varrer a casa",
                "a casa tá suja depois que os sobrinhos " +
                        "vieram, que droga",
                false);
        var novaTarefa2 = new Todo(2,"Encerar o chão",
                "o chão tá sujo e tá escorregadio",
                false);
        todoRepo.create(novaTarefa);
        todoRepo.create(novaTarefa2);
        System.out.println(todoRepo.read());
        novaTarefa.setDone(true);
        todoRepo.update(novaTarefa);
        System.out.println(todoRepo.read());
        todoRepo.exportToJson(true);
        todoRepo.delete(1);
        System.out.println(todoRepo.read());

    }
}