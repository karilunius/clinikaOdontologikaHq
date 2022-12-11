package com.clinikaOdontologikaHq.service.paciente;
import com.clinikaOdontologikaHq.model.entities.Domicilio;
import com.clinikaOdontologikaHq.repository.dto.DomicilioDTO;
import com.clinikaOdontologikaHq.repository.dto.PacienteDTO;
import com.clinikaOdontologikaHq.util.Util;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.Instant;
import java.util.Date;
import java.util.function.BooleanSupplier;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class PacienteServiceImplTest {

    Logger logger = Logger.getLogger(PacienteServiceImplTest.class);

    @Autowired
    IPacienteService pacienteService;

    @Test
    public void testCrearPaciente() {
        //Date date = Date.from(Instant.now());
        //Date date = new Date();


        //1L
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setDni("4440001234");
        pacienteDTO.setNombre("Mary");
        pacienteDTO.setApellido("Jane");
        pacienteDTO.setEmail("maryjane@gmail.com");
        pacienteDTO.setFechaIngreso("2022-12-01");
        pacienteService.guardar(pacienteDTO);

        //2L
        PacienteDTO pacienteDTO1 = new PacienteDTO();
        pacienteDTO1.setDni("44445601234");
        pacienteDTO1.setNombre("Nakia");
        pacienteDTO1.setApellido("Nyong'o");
        pacienteDTO1.setEmail("naki@gmail.com");
        pacienteDTO1.setFechaIngreso("2022-12-01");
        pacienteService.guardar(pacienteDTO1);

        if(pacienteDTO!=null || pacienteDTO1!=null) {
            PacienteDTO pacienteDTOb = pacienteService.buscar(1L);
            assertTrue(pacienteDTOb!=null);
            logger.info("Se agregó información de pacientes a la base de datos.");
        } else {
            logger.error("No se pudo agregar la información a la base de datos.");
        }
    }

}