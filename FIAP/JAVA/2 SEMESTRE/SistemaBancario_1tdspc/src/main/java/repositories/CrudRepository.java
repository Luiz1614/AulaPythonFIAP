package repositories;

import java.util.List;

public interface CrudRepository <T>{
    void create(T obj);
    List<T> read();
    void update(T obj);
    void delete(int id);
}
