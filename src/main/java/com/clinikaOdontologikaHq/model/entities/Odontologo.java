package com.clinikaOdontologikaHq.model.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Odontologos")
@Getter
@Setter
@RequiredArgsConstructor
@JsonIgnoreProperties({ "turnoSet" })
public class Odontologo {

    //ATRIBUTOS
    @Id
    @SequenceGenerator(name = "odontologo_sequence", sequenceName = "odontologo_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "odontologo_sequence")
    //@GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String matricula;
    private String nombre;
    private String apellido;

    //relacion a turnos

    @OneToMany(mappedBy = "odontologo", fetch = FetchType.LAZY )
    //@JoinColumn(name="turno_id", nullable = false)

    private Set<Turno> turnoSet = new HashSet<>();


}
