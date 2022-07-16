package com.example.SofkaNaves.controllers;


import com.example.SofkaNaves.models.Nave;
import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.services.NaveLanzadoraService;
import com.example.SofkaNaves.services.NaveNoTripuladaService;
import com.example.SofkaNaves.services.NaveTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class NavesControllers {


    NaveLanzadoraService naveLanzadoraService;
    NaveNoTripuladaService naveNoTripuladaService;
    NaveTripuladaService naveTripuladaService;

    /*@RequestMapping(value="/addnave/{id}")
    @PostMapping()
    public Nave addNave(@RequestBody Nave nave, @PathVariable("id") int tipoNave){

        switch (tipoNave){
            case 1:
                return naveLanzadoraService.addNave((NaveLanzadora)nave);
                break;

            case 2:
                return naveLanzadoraService.addNave((NaveNoTripulada)nave);
                break;
        }


    }*/


    @PostMapping(value="/addnave/")
    public ResponseEntity<?> addNave(@RequestBody Nave nave) {

        if(nave.getTipoNave() != null){
            switch (nave.getTipoNave()){
                case 1: return new ResponseEntity<>(naveLanzadoraService.addNave((NaveLanzadora) nave),HttpStatus.CREATED);
/*            case 2: return Optional.ofNullable(naveTripuladaService.addNave((NaveTripulada) nave));
            case 3: return Optional.ofNullable(naveNoTripuladaService.addNave((NaveNoTripulada) nave));*/
            }
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


    @PostMapping("/addnave")
    public Nave add_Nave(@RequestBody Nave nave) {
        return nave;
    }


    @GetMapping(path="/getnaves")
    public ArrayList<NaveTripulada> getNaves(){
        return naveTripuladaService.getNaves();
    }

    @Autowired
    public void setNaveLanzadoraService(NaveLanzadoraService naveLanzadoraService) {
        this.naveLanzadoraService = naveLanzadoraService;
    }
    @Autowired
    public void setNaveNoTripuladaService(NaveNoTripuladaService naveNoTripuladaService) {
        this.naveNoTripuladaService = naveNoTripuladaService;
    }
    @Autowired
    public void setNaveTripuladaService(NaveTripuladaService naveTripuladaService) {
        this.naveTripuladaService = naveTripuladaService;
    }
}
