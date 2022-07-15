package com.example.SofkaNaves.services;

import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.repositories.NaveLanzadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NaveLanzadoraService {

        @Autowired
        NaveLanzadoraRepository naveLanzadoraRepository;

        public NaveLanzadora addNave(NaveLanzadora Nave){
            return naveLanzadoraRepository.save(Nave);
        }

        public ArrayList<NaveLanzadora> getNaves(){
            return (ArrayList<NaveLanzadora>)naveLanzadoraRepository.findAll();
        }
}
