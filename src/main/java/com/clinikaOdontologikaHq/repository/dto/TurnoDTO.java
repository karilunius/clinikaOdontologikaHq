package com.clinikaOdontologikaHq.repository.dto;
import com.clinikaOdontologikaHq.model.entities.Odontologo;
import com.clinikaOdontologikaHq.model.entities.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
public class TurnoDTO {

    //ATRIBUTOS
    private Long id;
    private String fechaConsulta;
    private String horaConsulta;


}
