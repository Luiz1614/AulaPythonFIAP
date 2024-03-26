package org.eCommerce.repositories;
import org.eCommerce.entities._BaseEntity;
import java.util.ArrayList;
import java.util.List;

public abstract class _BaseRepositoryImpl<T extends _BaseEntity> implements _BaseRepository<T>{

    List<T> entidades  = new ArrayList<T>();

    public _BaseRepositoryImpl(Class<T> tClass) {
    }

    @Override
    public void create(T obj) {
        entidades.add(obj);
    }

    @Override
    public List<T> read() {
        return entidades;
    }

    @Override
    public void update(T obj) {
        for (int i = 0; i < entidades.size(); i++) {
            if (entidades.get(i).getId() == obj.getId()) {
                entidades.set(i, obj);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        entidades.remove(id);
    }

}



