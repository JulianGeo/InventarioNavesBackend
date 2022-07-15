package com.example.SofkaNaves.controllers;


import com.example.SofkaNaves.models.Nave;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.services.NaveLanzadoraService;
import com.example.SofkaNaves.services.NaveNoTripuladaService;
import com.example.SofkaNaves.services.NaveTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class NavesControllers {

    @Autowired
    NaveLanzadoraService naveLanzadoraService;
    @Autowired
    NaveNoTripuladaService naveNoTripuladaService;
    @Autowired
    NaveTripuladaService naveTripuladaService;

    @RequestMapping(value="/addnave")
    @PostMapping()
    public NaveTripulada addNave(@RequestBody NaveTripulada nave){
        return naveTripuladaService.addNave(nave);
    }

    @GetMapping(path="/getnaves")
    public ArrayList<NaveTripulada> getNaves(){
        return naveTripuladaService.getNaves();
    }



}
