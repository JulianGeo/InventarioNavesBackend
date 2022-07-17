package com.example.SofkaNaves.services.interfaces;

import com.example.SofkaNaves.models.NaveTripulada;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INaveTripuladaService {

    List<NaveTripulada> findAll();

    NaveTripulada createNaveTripulada(NaveTripulada aNaveTripulada);

    NaveTripulada updateNaveTripulada(NaveTripulada aNaveTripulada);

    void deleteNaveTripulada(Long aId);

}
