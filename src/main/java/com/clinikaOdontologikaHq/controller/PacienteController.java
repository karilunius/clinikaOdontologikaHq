package com.clinikaOdontologikaHq.controller;
import com.clinikaOdontologikaHq.repository.dto.PacienteDTO;
import com.clinikaOdontologikaHq.service.paciente.IPacienteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private static final Logger logger = Logger.getLogger(PacienteController.class);
    @Autowired
    IPacienteService pacienteService;

    @PostMapping("/nuevo")
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        ResponseEntity<String> responsenuevo = null;
        pacienteService.guardar(pacienteDTO);
        logger.info(responsenuevo = ResponseEntity.status(HttpStatus.OK).body("Guardado"));
        return responsenuevo;
    }

    @GetMapping("/buscar{id}")
    public PacienteDTO buscarPaciente(@PathVariable Long id){
        ResponseEntity<String> response = null;
        logger.info(response = ResponseEntity.status(HttpStatus.OK).body("Encontrado con exito"));
        return pacienteService.buscar(id);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarPaciente(@RequestBody PacienteDTO pacienteDTO){
        ResponseEntity<String> response = null;
        pacienteService.actualizar(pacienteDTO);
        logger.info(response = ResponseEntity.status(HttpStatus.OK).body("Actualizado"));
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping("/eliminar{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Long id){
        ResponseEntity<String> response = null;
        pacienteService.eliminar(id);
        logger.info(response = ResponseEntity.status(HttpStatus.OK).body("Eliminado"));
        return response;
    }


    @GetMapping("/lista")
    public Collection<PacienteDTO> listaDPacientes(){
        logger.info("Lista de pacientes activa");
        return pacienteService.listadTodos();
    }
}
