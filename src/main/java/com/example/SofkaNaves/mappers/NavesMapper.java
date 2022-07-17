package com.example.SofkaNaves.mappers;

import com.example.SofkaNaves.dto.NaveDTO;
import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface NavesMapper {

    NavesMapper INSTANCE = Mappers.getMapper(NavesMapper.class);

    //  DTO's to Entitys

    /**
     * Convierte NaveDTO to Naves
     **/

    @Mapping(target = "id", source = "id")
    @Mapping(target = "tipoNave", source = "tipoNave")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "peso", source = "peso")
    @Mapping(target = "altura", source = "altura")
    @Mapping(target = "combustible", source = "combustible")
    @Mapping(target = "mision", source = "mision")
    @Mapping(target = "carga", source = "carga")
    @Mapping(target = "empuje", source = "empuje")
    @Mapping(target = "potencia", source = "potencia")
    @Mapping(target = "reuttilizable", source = "reuttilizable")
    NaveLanzadora toNaveLanzadora(NaveDTO aNaveDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "tipoNave", source = "tipoNave")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "peso", source = "peso")
    @Mapping(target = "altura", source = "altura")
    @Mapping(target = "combustible", source = "combustible")
    @Mapping(target = "mision", source = "mision")
    @Mapping(target = "destino", source = "destino")
    @Mapping(target = "paraInvestigacion", source = "paraInvestigacion")
    NaveNoTripulada toNaveNoTripulada(NaveDTO aNaveDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "tipoNave", source = "tipoNave")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "peso", source = "peso")
    @Mapping(target = "altura", source = "altura")
    @Mapping(target = "combustible", source = "combustible")
    @Mapping(target = "mision", source = "mision")
    @Mapping(target = "capacidad", source = "capacidad")
    @Mapping(target = "duracionMouth", source = "duracionMouth")
    @Mapping(target = "duracionYear", source = "duracionYear")
    NaveTripulada toNaveTripulada(NaveDTO aNaveDTO);


    // Entitys to DTO's

    @InheritInverseConfiguration
    NaveDTO toNaveDTO(NaveLanzadora aNaveLanzadora);

    @InheritInverseConfiguration
    NaveDTO toNaveDTO(NaveNoTripulada aNaveNoTripulada);

    @InheritInverseConfiguration
    NaveDTO toNaveDTO(NaveTripulada aNaveTripulada);
}

