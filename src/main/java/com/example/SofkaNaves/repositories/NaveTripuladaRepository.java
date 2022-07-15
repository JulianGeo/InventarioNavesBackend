package com.example.SofkaNaves.repositories;

import com.example.SofkaNaves.models.NaveTripulada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface NaveTripuladaRepository extends CrudRepository <NaveTripulada, Integer> {
}
