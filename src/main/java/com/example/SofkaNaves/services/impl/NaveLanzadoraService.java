package com.example.SofkaNaves.services.impl;

import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.repositories.NaveLanzadoraRepository;
import com.example.SofkaNaves.services.interfaces.INaveLanzadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NaveLanzadoraService implements INaveLanzadoraService {

    NaveLanzadoraRepository naveLanzadoraRepository;

    @Override
    public List<NaveLanzadora> findAll() {
        return this.naveLanzadoraRepository.findAll();
    }

    @Override
    @Transactional
    public NaveLanzadora createNaveLanzadora(NaveLanzadora aNaveLanzadora) {
        return this.naveLanzadoraRepository.save(aNaveLanzadora);
    }

    @Autowired
    public void setNaveLanzadoraRepository(NaveLanzadoraRepository naveLanzadoraRepository) {
        this.naveLanzadoraRepository = naveLanzadoraRepository;
    }

}
