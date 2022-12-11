package com.clinikaOdontologikaHq.controller;
import com.clinikaOdontologikaHq.repository.dto.DomicilioDTO;
import com.clinikaOdontologikaHq.service.domicilio.IDomicilioService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {
    private static final Logger logger = Logger.getLogger(DomicilioController.class);
    @Autowired
    IDomicilioService domicilioService;

    @PostMapping("/nuevo")
    public ResponseEntity<?> crearDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        ResponseEntity<String> responsenuevo = null;
        domicilioService.guardar(domicilioDTO);
        logger.info(responsenuevo = ResponseEntity.status(HttpStatus.OK).body("Guardado"));
        return responsenuevo;
    }

    @GetMapping("/buscar{id}")
    public DomicilioDTO buscarDomicilio(@PathVariable Long id){
        return domicilioService.buscar(id);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        domicilioService.actualizar(domicilioDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping("/eliminar{id}")
    public ResponseEntity<?> eliminarDomicilio(@PathVariable Long id){
        domicilioService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/lista")
    public Collection<DomicilioDTO> listaDDomicilios(){
        return domicilioService.listadTodos();
    }



}
