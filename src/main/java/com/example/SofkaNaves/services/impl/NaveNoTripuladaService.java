package com.example.SofkaNaves.services.impl;

import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.repositories.NaveNoTripuladaRepository;
import com.example.SofkaNaves.services.interfaces.INaveNoTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NaveNoTripuladaService implements INaveNoTripuladaService {

    NaveNoTripuladaRepository naveNoTripRepository;

    @Override
    public List<NaveNoTripulada> findAll() {
        return this.naveNoTripRepository.findAll();
    }

    @Override
    @Transactional
    public NaveNoTripulada createNaveNoTripulada(NaveNoTripulada aNaveNoTripulada) {
        return this.naveNoTripRepository.save(aNaveNoTripulada);
    }

    @Autowired
    public void setNaveNoTripRepository(NaveNoTripuladaRepository naveNoTripRepository) {
        this.naveNoTripRepository = naveNoTripRepository;
    }
}
