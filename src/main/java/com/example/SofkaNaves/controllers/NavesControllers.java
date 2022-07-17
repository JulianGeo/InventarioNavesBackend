package com.example.SofkaNaves.controllers;

import com.example.SofkaNaves.dto.NaveDTO;
import com.example.SofkaNaves.mappers.NavesMapper;
import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import com.example.SofkaNaves.services.interfaces.INaveLanzadoraService;
import com.example.SofkaNaves.services.interfaces.INaveNoTripuladaService;
import com.example.SofkaNaves.services.interfaces.INaveTripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class NavesControllers {

    INaveLanzadoraService iNaveLanzadoraService;
    INaveNoTripuladaService iNaveNoTripuladaService;
    INaveTripuladaService iNaveTripuladaService;

    private NaveLanzadora crearNaveLanzadora(NaveDTO aNaveDTO) {
        NaveLanzadora aNaveLanzadora  = this.iNaveLanzadoraService.createNaveLanzadora(NavesMapper.INSTANCE.toNaveLanzadora(aNaveDTO));
        if(aNaveLanzadora != null){
            return aNaveLanzadora;
        }
        return new NaveLanzadora();
    }

    private NaveNoTripulada crearNaveNoTripulada(NaveDTO aNaveDTO) {
        NaveNoTripulada aNaveNoTripulada  = this.iNaveNoTripuladaService.createNaveNoTripulada(NavesMapper.INSTANCE.toNaveNoTripulada(aNaveDTO));
        if(aNaveNoTripulada != null){
            return aNaveNoTripulada;
        }
        return new NaveNoTripulada();
    }

    private NaveTripulada crearNavesTripulada(NaveDTO aNaveDTO) {
        NaveTripulada aNaveTripulada  = this.iNaveTripuladaService.createNaveTripulada(NavesMapper.INSTANCE.toNaveTripulada(aNaveDTO));
        if(aNaveTripulada != null){
            return aNaveTripulada;
        }
        return new NaveTripulada();
    }

    @PostMapping(value="/addnave")
    public ResponseEntity<?> addNave(@RequestBody NaveDTO aNaveDTO) {

        if(aNaveDTO.getTipoNave() != null){
            switch (aNaveDTO.getTipoNave()){
                case 1: return new ResponseEntity<>(crearNavesTripulada(aNaveDTO),HttpStatus.CREATED);
                case 2: return new ResponseEntity<>(crearNaveNoTripulada(aNaveDTO),HttpStatus.CREATED);
                case 3: return new ResponseEntity<>(crearNaveLanzadora(aNaveDTO),HttpStatus.CREATED);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/allNavesTripuladas")
    public ResponseEntity<List<NaveDTO>> findAllNavesTripuladas() {
        List<NaveTripulada> naveTripuladaList = this.iNaveTripuladaService.findAll();
        if (naveTripuladaList == null || naveTripuladaList.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(naveTripuladaList.stream()
                .map(NavesMapper.INSTANCE::toNaveDTO).collect(Collectors.toList()), HttpStatus.OK);
    }

    @GetMapping("/allNaves")
    public ResponseEntity<List<NaveDTO>> findAll() {

        List<NaveDTO> naveLanzadoraList = this.iNaveLanzadoraService.findAll()
                .stream().map(NavesMapper.INSTANCE::toNaveDTO).collect(Collectors.toList());

        List<NaveDTO> naveNoTripuladaList = this.iNaveNoTripuladaService.findAll()
                .stream().map(NavesMapper.INSTANCE::toNaveDTO).collect(Collectors.toList());

        List<NaveDTO> naveTripuladaList = this.iNaveTripuladaService.findAll()
                .stream().map(NavesMapper.INSTANCE::toNaveDTO).collect(Collectors.toList());

        naveTripuladaList.addAll(naveLanzadoraList);
        naveTripuladaList.addAll(naveNoTripuladaList);

        if (naveTripuladaList == null || naveTripuladaList.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(naveTripuladaList, HttpStatus.OK);
    }

    @Autowired
    public void setiNaveLanzadoraService(INaveLanzadoraService iNaveLanzadoraService) {
        this.iNaveLanzadoraService = iNaveLanzadoraService;
    }
    @Autowired
    public void setiNaveNoTripuladaService(INaveNoTripuladaService iNaveNoTripuladaService) {
        this.iNaveNoTripuladaService = iNaveNoTripuladaService;
    }
    @Autowired
    public void setiNaveTripuladaService(INaveTripuladaService iNaveTripuladaService) {
        this.iNaveTripuladaService = iNaveTripuladaService;
    }
}
