package com.example.SofkaNaves.services;

import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.repositories.NaveTripuladaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NaveTripuladaService {
    @Autowired
    NaveTripuladaRepository naveTripRepository;

    public NaveTripulada addNave(NaveTripulada Nave){
        return naveTripRepository.save(Nave);
    }

    public ArrayList<NaveTripulada> getNaves(){
        return (ArrayList<NaveTripulada>)naveTripRepository.findAll();
    }

}
