package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.Cella;
import hu.uni.eku.tzs.model.Cella;
import hu.uni.eku.tzs.service.exceptions.CellaAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@RequiredArgsConstructor
@Service
public class CellaServiceImpl implements CellaService {

    private final CellaDao dao;

    @Override
    public void record(Cella cella) throws CellaAlreadyExistsException {
        final boolean isAlreadyRecorded = dao.readAll()
                .stream()
                .anyMatch( c ->
                        c.getCella_id() == cella.getCella_id()
                                &&
                                c.getErkezes() == cella.getErkezes());
        if(isAlreadyRecorded){
            log.info("Cella {} is already recorded!", cella);
            throw new CellaAlreadyExistsException(String.format("Cella (%s) already exists!", cella.toString()));

        }
        dao.create(cella);
    }

    @Override
    public Collection<Cella> readAll() {
        return dao.readAll();
    }
}
