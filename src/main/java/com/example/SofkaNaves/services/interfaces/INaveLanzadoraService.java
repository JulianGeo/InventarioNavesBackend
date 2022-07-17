package com.example.SofkaNaves.services.interfaces;

import com.example.SofkaNaves.models.NaveLanzadora;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface INaveLanzadoraService {

    List<NaveLanzadora> findAll();

    NaveLanzadora createNaveLanzadora(NaveLanzadora aNaveLanzadora);

}
