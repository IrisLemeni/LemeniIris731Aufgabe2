package org.example;

import java.util.List;

public interface Repository<T> {
    void add(T item);
    void remove(T item);
    List<T> getAll();

}

