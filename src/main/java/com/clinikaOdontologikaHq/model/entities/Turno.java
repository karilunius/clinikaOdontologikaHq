package com.clinikaOdontologikaHq.model.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name="turnos")
@Getter
@Setter
@JsonIgnoreProperties({ "paciente","odontologo" })
public class Turno {

    //ATRIBUTOS
    @Id
    @SequenceGenerator(name = "turnos_sequence", sequenceName = "turnos_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turnos_sequence")
    //@GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String fechaConsulta;
    private String horaConsulta;

    //relacion a pacientes
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;


    //relacion a odontologos
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "odontologo_id",referencedColumnName = "id")
    private Odontologo odontologo;

}
