package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Foglalas;

import java.util.Collection;

public interface FoglalasDao {

    void create(Foglalas foglalas);

    Collection<Foglalas> readAll();

    void update(int guest_id, Guest updated);

    void delete(int guest_id);
}