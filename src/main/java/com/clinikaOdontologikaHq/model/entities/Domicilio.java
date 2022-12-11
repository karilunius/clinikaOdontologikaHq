package com.clinikaOdontologikaHq.model.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="domicilio")
@Getter
@Setter
@RequiredArgsConstructor
public class Domicilio {

    //ATRIBUTOS
    @Id
    @SequenceGenerator(name = "domicilio_sequence", sequenceName = "domicilio_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "domicilio_sequence")
    //@GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

    //relacion a paciente

    //@OneToMany(mappedBy = "domicilio", fetch = FetchType.LAZY )
    //@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@JoinColumn(name="paciente_id", nullable = false)
    //@JsonIgnore

    //private Set<Paciente> pacienteSet = new HashSet<>();


}
