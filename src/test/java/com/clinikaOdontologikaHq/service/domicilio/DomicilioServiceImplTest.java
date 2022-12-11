package com.clinikaOdontologikaHq.service.domicilio;
import com.clinikaOdontologikaHq.repository.dto.DomicilioDTO;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DomicilioServiceImplTest {

    Logger logger = Logger.getLogger(DomicilioServiceImplTest.class);
    @Autowired
    IDomicilioService domicilioService;


    @Test
    public void testCrearDomicilio() {

        //1L
        DomicilioDTO domicilioDTO = new DomicilioDTO();
        domicilioDTO.setCalle("rose");
        domicilioDTO.setNumero("12");
        domicilioDTO.setLocalidad("Queens");
        domicilioDTO.setProvincia("New York");

        domicilioService.guardar(domicilioDTO);

        //2L
        DomicilioDTO domicilioDTO1 = new DomicilioDTO();
        domicilioDTO1.setCalle("black");
        domicilioDTO1.setNumero("7");
        domicilioDTO1.setLocalidad("congo");
        domicilioDTO1.setProvincia("Wakanda");
        domicilioService.guardar(domicilioDTO1);

        if(domicilioDTO!=null || domicilioDTO1 !=null) {
            DomicilioDTO domicilioDTOb = domicilioService.buscar(1L);
            assertTrue(domicilioDTOb != null);
            logger.info("Se agregó información de domicilio a la base de datos.");
        } else {
            logger.error("No se pudo agregar la información a la base de datos.");
        }


    }
}