package ru.korostelev.DZSem4.repository.db;

import java.util.Collection;

public interface Repository <T, Tid>{

    T add(T t);

    Collection<T> getAll();

    T getById(Tid id);

    void delete(Tid id);

}
