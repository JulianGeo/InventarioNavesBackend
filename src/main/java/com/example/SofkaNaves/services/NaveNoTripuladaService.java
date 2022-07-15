package com.example.SofkaNaves.services;

import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.repositories.NaveNoTripuladaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NaveNoTripuladaService {

    @Autowired
    NaveNoTripuladaRepository naveNoTripRepository;

    public NaveNoTripulada addNave(NaveNoTripulada Nave){
        return naveNoTripRepository.save(Nave);
    }

    public ArrayList<NaveNoTripulada> getNaves(){
        return (ArrayList<NaveNoTripulada>)naveNoTripRepository.findAll();
    }

}
