package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.Cella;
import hu.uni.eku.tzs.service.exceptions.CellaAlreadyExistsException;

import java.util.Collection;

public interface CellaService
{
    void record(Cella cella) throws CellaAlreadyExistsException;

    Collection<Cella> readAll();
}
