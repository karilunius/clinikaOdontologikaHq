package com.clinikaOdontologikaHq.controller;
import com.clinikaOdontologikaHq.GlobalExceptionHandler;
import com.clinikaOdontologikaHq.repository.dto.OdontologoDTO;
import com.clinikaOdontologikaHq.service.odontologo.IOdontologoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private static final Logger logger = Logger.getLogger(OdontologoController.class);
    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/nuevo")
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO){
            ResponseEntity<String> responsenuevo = null;
            odontologoService.guardar(odontologoDTO);
            logger.info(responsenuevo = ResponseEntity.status(HttpStatus.OK).body("Guardado"));
            return responsenuevo;

    }

    @GetMapping("/buscar{id}")
    public OdontologoDTO buscarOdontologo(@PathVariable Long id){
        ResponseEntity<String> responsenuevo = null;
        logger.info(responsenuevo = ResponseEntity.status(HttpStatus.OK).body("Encontrado con exito"));
        return odontologoService.buscar(id);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        ResponseEntity<String> responseactualizar = null;
        odontologoService.actualizar(odontologoDTO);
        logger.info(responseactualizar = ResponseEntity.status(HttpStatus.OK).body("Actualizado"));
        return responseactualizar;

    }


    @DeleteMapping("/eliminar{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        ResponseEntity<String> responseeliminar = null;
        odontologoService.eliminar(id);
        logger.info(responseeliminar = ResponseEntity.status(HttpStatus.OK).body("Eliminado"));
        return responseeliminar;
    }


    @GetMapping("/lista")
    public Collection<OdontologoDTO> listaDOdontologos(){
        logger.info("Lista de odontologos activa");
        return odontologoService.listadTodos();
    }

}
