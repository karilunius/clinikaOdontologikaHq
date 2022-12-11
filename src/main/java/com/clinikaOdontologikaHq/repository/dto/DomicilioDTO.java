package com.clinikaOdontologikaHq.repository.dto;
import com.clinikaOdontologikaHq.model.entities.Paciente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class DomicilioDTO {

    //ATRIBUTOS
    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;


}
