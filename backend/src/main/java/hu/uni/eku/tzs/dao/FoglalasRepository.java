package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.Foglalas;
import org.springframework.data.repository.CrudRepository;

public interface FoglalasRepository extends CrudRepository<Foglalas, Integer> {
    Foglalas findByCella_Id(int cella_Id);
}