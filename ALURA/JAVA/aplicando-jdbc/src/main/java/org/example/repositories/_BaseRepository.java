package org.example.repositories;

import java.util.List;

public interface _BaseRepository <T> {
        void create(T obj);
        List<T> read();
        void update(T obj);
        void delete(int id);
}
