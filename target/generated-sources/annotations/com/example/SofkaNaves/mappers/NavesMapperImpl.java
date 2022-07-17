package com.example.SofkaNaves.mappers;

import com.example.SofkaNaves.dto.NaveDTO;
import com.example.SofkaNaves.models.NaveLanzadora;
import com.example.SofkaNaves.models.NaveNoTripulada;
import com.example.SofkaNaves.models.NaveTripulada;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-16T15:12:13-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_333 (Oracle Corporation)"
)
public class NavesMapperImpl implements NavesMapper {

    @Override
    public NaveLanzadora toNaveLanzadora(NaveDTO aNaveDTO) {
        if ( aNaveDTO == null ) {
            return null;
        }

        NaveLanzadora naveLanzadora = new NaveLanzadora();

        naveLanzadora.setId( aNaveDTO.getId() );
        naveLanzadora.setTipoNave( aNaveDTO.getTipoNave() );
        naveLanzadora.setNombre( aNaveDTO.getNombre() );
        naveLanzadora.setPeso( aNaveDTO.getPeso() );
        naveLanzadora.setAltura( aNaveDTO.getAltura() );
        naveLanzadora.setCombustible( aNaveDTO.getCombustible() );
        naveLanzadora.setMision( aNaveDTO.getMision() );
        naveLanzadora.setCarga( aNaveDTO.getCarga() );
        naveLanzadora.setEmpuje( aNaveDTO.getEmpuje() );
        naveLanzadora.setPotencia( aNaveDTO.getPotencia() );
        naveLanzadora.setReuttilizable( aNaveDTO.getReuttilizable() );

        return naveLanzadora;
    }

    @Override
    public NaveNoTripulada toNaveNoTripulada(NaveDTO aNaveDTO) {
        if ( aNaveDTO == null ) {
            return null;
        }

        NaveNoTripulada naveNoTripulada = new NaveNoTripulada();

        naveNoTripulada.setId( aNaveDTO.getId() );
        naveNoTripulada.setTipoNave( aNaveDTO.getTipoNave() );
        naveNoTripulada.setNombre( aNaveDTO.getNombre() );
        naveNoTripulada.setPeso( aNaveDTO.getPeso() );
        naveNoTripulada.setAltura( aNaveDTO.getAltura() );
        naveNoTripulada.setCombustible( aNaveDTO.getCombustible() );
        naveNoTripulada.setMision( aNaveDTO.getMision() );
        naveNoTripulada.setDestino( aNaveDTO.getDestino() );
        naveNoTripulada.setParaInvestigacion( aNaveDTO.getParaInvestigacion() );

        return naveNoTripulada;
    }

    @Override
    public NaveTripulada toNaveTripulada(NaveDTO aNaveDTO) {
        if ( aNaveDTO == null ) {
            return null;
        }

        NaveTripulada naveTripulada = new NaveTripulada();

        naveTripulada.setId( aNaveDTO.getId() );
        naveTripulada.setTipoNave( aNaveDTO.getTipoNave() );
        naveTripulada.setNombre( aNaveDTO.getNombre() );
        naveTripulada.setPeso( aNaveDTO.getPeso() );
        naveTripulada.setAltura( aNaveDTO.getAltura() );
        naveTripulada.setCombustible( aNaveDTO.getCombustible() );
        naveTripulada.setMision( aNaveDTO.getMision() );
        naveTripulada.setCapacidad( aNaveDTO.getCapacidad() );
        naveTripulada.setDuracionMouth( aNaveDTO.getDuracionMouth() );
        naveTripulada.setDuracionYear( aNaveDTO.getDuracionYear() );

        return naveTripulada;
    }

    @Override
    public NaveDTO toNaveDTO(NaveLanzadora aNaveLanzadora) {
        if ( aNaveLanzadora == null ) {
            return null;
        }

        NaveDTO naveDTO = new NaveDTO();

        naveDTO.setId( aNaveLanzadora.getId() );
        naveDTO.setTipoNave( aNaveLanzadora.getTipoNave() );
        naveDTO.setNombre( aNaveLanzadora.getNombre() );
        naveDTO.setPeso( aNaveLanzadora.getPeso() );
        naveDTO.setAltura( aNaveLanzadora.getAltura() );
        naveDTO.setCombustible( aNaveLanzadora.getCombustible() );
        naveDTO.setMision( aNaveLanzadora.getMision() );
        naveDTO.setCarga( aNaveLanzadora.getCarga() );
        naveDTO.setEmpuje( aNaveLanzadora.getEmpuje() );
        naveDTO.setPotencia( aNaveLanzadora.getPotencia() );
        naveDTO.setReuttilizable( aNaveLanzadora.getReuttilizable() );

        return naveDTO;
    }

    @Override
    public NaveDTO toNaveDTO(NaveNoTripulada aNaveNoTripulada) {
        if ( aNaveNoTripulada == null ) {
            return null;
        }

        NaveDTO naveDTO = new NaveDTO();

        naveDTO.setId( aNaveNoTripulada.getId() );
        naveDTO.setTipoNave( aNaveNoTripulada.getTipoNave() );
        naveDTO.setNombre( aNaveNoTripulada.getNombre() );
        naveDTO.setPeso( aNaveNoTripulada.getPeso() );
        naveDTO.setAltura( aNaveNoTripulada.getAltura() );
        naveDTO.setCombustible( aNaveNoTripulada.getCombustible() );
        naveDTO.setMision( aNaveNoTripulada.getMision() );
        naveDTO.setDestino( aNaveNoTripulada.getDestino() );
        naveDTO.setParaInvestigacion( aNaveNoTripulada.getParaInvestigacion() );

        return naveDTO;
    }

    @Override
    public NaveDTO toNaveDTO(NaveTripulada aNaveTripulada) {
        if ( aNaveTripulada == null ) {
            return null;
        }

        NaveDTO naveDTO = new NaveDTO();

        naveDTO.setId( aNaveTripulada.getId() );
        naveDTO.setTipoNave( aNaveTripulada.getTipoNave() );
        naveDTO.setNombre( aNaveTripulada.getNombre() );
        naveDTO.setPeso( aNaveTripulada.getPeso() );
        naveDTO.setAltura( aNaveTripulada.getAltura() );
        naveDTO.setCombustible( aNaveTripulada.getCombustible() );
        naveDTO.setMision( aNaveTripulada.getMision() );
        naveDTO.setCapacidad( aNaveTripulada.getCapacidad() );
        naveDTO.setDuracionMouth( aNaveTripulada.getDuracionMouth() );
        naveDTO.setDuracionYear( aNaveTripulada.getDuracionYear() );

        return naveDTO;
    }
}
