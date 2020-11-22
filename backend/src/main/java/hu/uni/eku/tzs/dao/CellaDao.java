package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Cella;

import java.util.Collection;

public interface CellaDao {

    void create(Cella cella);

    Collection<Cella> readAll();

    void update(Cella original, Cella updated);

    void delete(Cella cella);
}
