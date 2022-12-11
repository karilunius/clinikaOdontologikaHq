package com.clinikaOdontologikaHq.service.turno;
import com.clinikaOdontologikaHq.repository.dto.TurnoDTO;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TurnoServiceImplTest {
    Logger logger = Logger.getLogger(TurnoServiceImplTest.class);

    @Autowired
    ITurnoService turnoService;

    @Test
    public void testCrearTurno() {


        //1L
        TurnoDTO turnoDTO = new TurnoDTO();
        turnoDTO.setFechaConsulta("2022-12-01");
        turnoDTO.setHoraConsulta("03:00:00");
        turnoService.guardar(turnoDTO);

        //2L
        TurnoDTO turnoDTO1 = new TurnoDTO();
        turnoDTO1.setFechaConsulta("2022-12-02");
        turnoDTO1.setHoraConsulta("03:00:00");
        turnoService.guardar(turnoDTO1);

        if(turnoDTO!=null || turnoDTO1!=null) {
            TurnoDTO turnoDTOb = turnoService.buscar(1L);
            assertTrue(turnoDTOb!=null);
            logger.info("Se agregó información de turno a la base de datos.");
        } else {
            logger.error("No se pudo agregar la información a la base de datos.");
        }
    }


}