package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.Cella;
import org.springframework.data.repository.CrudRepository;

public interface CellaRepository extends CrudRepository<Cella, Integer>
{
    Cella findByCella_id(int cella_id);
}
