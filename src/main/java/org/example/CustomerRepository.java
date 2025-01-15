package org.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements Repository<Charakter> {
    private final List<Charakter> charaktere = new ArrayList<>();

    @Override
    public void add(Charakter charakter) {
        charaktere.add(charakter);
    }

    @Override
    public void remove(Charakter charakter) {
        charaktere.remove(charakter);
    }

    @Override
    public List<Charakter> getAll() {
        return charaktere;
    }
}

