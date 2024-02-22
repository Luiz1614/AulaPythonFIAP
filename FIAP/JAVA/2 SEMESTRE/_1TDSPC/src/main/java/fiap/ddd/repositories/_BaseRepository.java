package fiap.ddd.repositories;

import fiap.ddd.entities._BaseEntity;

import java.util.List;


// Interface genérica é uma interface que pode ser implementada por outras classes
// e que pode ser parametrizada com um tipo de dado
public interface _BaseRepository<T extends _BaseEntity> {
    public void Create(T entity);
    public List<T> ReadAll();
    public void Update(T entity);
    public void Delete(T entity);
    public void DeleteById(int id);
}
