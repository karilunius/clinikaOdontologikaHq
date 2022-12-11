package com.clinikaOdontologikaHq.repository.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class OdontologoDTO {

    //TRANSPORTAR INFO DE 1 CAPA A OTRA
    //ATRIBUTOS
    private Long id;
    private String matricula;
    private String nombre;
    private String apellido;


}
