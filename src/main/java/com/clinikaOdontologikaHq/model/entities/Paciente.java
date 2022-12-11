package com.clinikaOdontologikaHq.model.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pacientes")
@Getter
@Setter
@JsonIgnoreProperties({ "turnoSet" , "domicilio" })
public class Paciente {

    //ATRIBUTOS
    @Id
    @SequenceGenerator(name = "paciente_sequence", sequenceName = "paciente_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_sequence")
    //@GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String fechaIngreso;

    //relacion a domicilio

    //@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id", referencedColumnName = "id")
    //@PrimaryKeyJoinColumn(name = "domicilio_id" ,referencedColumnName = "id" ,nullable = true)
    private Domicilio domicilio;


    //relacion a turnos
    @OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY)
    //@JoinColumn(name="turno_id", nullable = false)
    private Set<Turno> turnoSet = new HashSet<>();

}
