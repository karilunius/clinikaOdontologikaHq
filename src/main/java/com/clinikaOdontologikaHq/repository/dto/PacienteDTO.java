package com.clinikaOdontologikaHq.repository.dto;
import com.clinikaOdontologikaHq.util.Util;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter

public class PacienteDTO {

    //ATRIBUTOS
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String fechaIngreso;

}
