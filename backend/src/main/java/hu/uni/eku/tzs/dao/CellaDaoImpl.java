package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Cella;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class CellaDaoImpl implements CellaDao
{

    private final CellaRepository repository;

    @Override
    public void create(Cella cella) {
        repository.save(CellaEntityModelConverter.model2entity(cella));
    }

    @Override
    public Collection<Cella> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> CellaEntityModelConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(int cella_id, Cella updated) {
        hu.uni.eku.tzs.dao.entity.Cella temp = repository.findByCella_id(cella_id);
        temp.setCella_id(updated.getCella_id());
        repository.save(temp);
    }

    @Override
    public void delete(Cella cella) {
        hu.uni.eku.tzs.dao.entity.Cella temp = repository.findByCella_id(cella_id);
        if(temp != null)
            repository.delete(temp);
    }

    private static class CellaEntityModelConverter {

        private static Cella entity2model(hu.uni.eku.tzs.dao.entity.Cella entity){
            return new Cella(
                    entity.getCella_id(),
                    entity.isAllapot(),
                    entity.getErkezes(),
                    entity.getErkezes(),
                    entity.getVezeteknev(),
                    entity.getKeresztnev(),
                    entity.isAram(),
                    entity.getTipus()
            );
        }

        private static hu.uni.eku.tzs.dao.entity.Cella model2entity(Cella model){
            return hu.uni.eku.tzs.dao.entity.Cella.builder()
                    .cella_id(model.getCella_id())
                    .allapot(model.isAllapot())
                    .erkezes(model.getErkezes())
                    .tavozas(model.getTavozas())
                    .vezeteknev(model.getVezeteknev())
                    .keresztnev(model.getKeresztnev())
                    .aram(model.getAram())
                    .tipus(model.getTipus())
                    .build();
        }

    }
}
