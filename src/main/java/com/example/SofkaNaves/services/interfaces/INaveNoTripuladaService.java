package com.example.SofkaNaves.services.interfaces;

import com.example.SofkaNaves.models.NaveNoTripulada;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INaveNoTripuladaService {

    List<NaveNoTripulada> findAll();

    NaveNoTripulada createNaveNoTripulada(NaveNoTripulada aNaveNoTripulada);
}
