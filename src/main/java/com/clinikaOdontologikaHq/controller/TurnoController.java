package com.clinikaOdontologikaHq.controller;
import com.clinikaOdontologikaHq.repository.dto.OdontologoDTO;
import com.clinikaOdontologikaHq.repository.dto.TurnoDTO;
import com.clinikaOdontologikaHq.service.odontologo.IOdontologoService;
import com.clinikaOdontologikaHq.service.turno.ITurnoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private static final Logger logger = Logger.getLogger(TurnoController.class);
    @Autowired
    ITurnoService turnoService;

    @PostMapping("/nuevo")
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.guardar(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/buscar{id}")
    public TurnoDTO buscarTurno(@PathVariable Long id){
        return turnoService.buscar(id);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.actualizar(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping("/eliminar{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Long id){
        turnoService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/lista")
    public Collection<TurnoDTO> listaDOdontologos(){
        return turnoService.listadTodos();
    }
}
