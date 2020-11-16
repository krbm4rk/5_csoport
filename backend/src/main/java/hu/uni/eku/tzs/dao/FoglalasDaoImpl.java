package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Foglalas;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class GuestDaoImpl implements FoglalasDao {

    private final GuestRepository repository;

    @Override
    public void create(Foglalas foglalas) {
        repository.save(GuestEntityModelConverter.model2entity(foglalas));
    }

    @Override
    public Collection<Foglalas> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> FoglalasEntityModelConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(int cella_Id, Foglalas updated) {
        hu.uni.eku.tzs.dao.entity.Foglalas temp = repository.findByCella_Id(cella_Id);
        temp.setGuest_id(updated.getGuest_id());
        repository.save(temp);
    }

    @Override
    public void delete(int guest_id) {
        hu.uni.eku.afpc1.dao.entity.Guest temp = repository.findByGuest_id(guest_id);
        if(temp != null)
            repository.delete(temp);
    }

    private static class FoglalasEntityModelConverter{

        private static Foglalas entity2model(hu.uni.eku.tzs.dao.entity.Foglalas entity){
            return new Foglalas(entity.getCella_id(), entity.getArrivalDateTime());
        }

        private static hu.uni.eku.afpc1.dao.entity.Guest model2entity(Guest model){
            return hu.uni.eku.afpc1.dao.entity.Guest.builder()
                    .guest_id(model.getGuest_id())
                    .arrivalDateTime(model.getArrivalDateTime())
                    .build();
        }

    }
}