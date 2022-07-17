package com.example.SofkaNaves.services.impl;

import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.repositories.NaveLanzadoraRepository;
import com.example.SofkaNaves.repositories.NaveNoTripuladaRepository;
import com.example.SofkaNaves.repositories.NaveTripuladaRepository;
import com.example.SofkaNaves.services.interfaces.INaveTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NaveTripuladaService implements INaveTripuladaService {

    NaveLanzadoraRepository naveLanzadoraRepository;
    NaveNoTripuladaRepository naveNoTripuladaRepository;
    NaveTripuladaRepository naveTripRepository;

    @Override
    public List<NaveTripulada> findAll() {
        return this.naveTripRepository.findAll();
    }

    @Override
    @Transactional
    public NaveTripulada createNaveTripulada(NaveTripulada aNaveTripulada) {
        return this.naveTripRepository.save(aNaveTripulada);
    }

    @Override
    public NaveTripulada updateNaveTripulada(NaveTripulada aNaveTripulada) {
        NaveTripulada naveTripuladaBD = this.naveTripRepository.findById(aNaveTripulada.getId()).orElseThrow(RuntimeException::new);
        aNaveTripulada = naveTripuladaBD;
        return this.naveTripRepository.save(aNaveTripulada);
    }

    @Override
    public void deleteNaveTripulada(Long aId) {
        NaveTripulada naveTripuladaBD = this.naveTripRepository.findById(aId).orElseThrow(RuntimeException::new);
        this.naveTripRepository.deleteById(naveTripuladaBD.getId());
    }


    @Autowired
    public void setNaveTripRepository(NaveTripuladaRepository naveTripRepository) {
        this.naveTripRepository = naveTripRepository;
    }
    @Autowired
    public void setNaveLanzadoraRepository(NaveLanzadoraRepository naveLanzadoraRepository) {
        this.naveLanzadoraRepository = naveLanzadoraRepository;
    }
    @Autowired
    public void setNaveNoTripuladaRepository(NaveNoTripuladaRepository naveNoTripuladaRepository) {
        this.naveNoTripuladaRepository = naveNoTripuladaRepository;
    }
}
