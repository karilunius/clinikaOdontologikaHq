package com.clinikaOdontologikaHq.service.odontologo;
import com.clinikaOdontologikaHq.repository.dto.OdontologoDTO;
import com.clinikaOdontologikaHq.repository.irepo.IOdontologoRepository;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class OdontologoServiceImplTest {

    Logger logger = Logger.getLogger(OdontologoServiceImplTest.class);
    @Autowired
    IOdontologoService odontologoService;


    @Test
    public void testCrearOdontologo() {

        //1L
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setMatricula("777spider1234");
        odontologoDTO.setNombre("Peter");
        odontologoDTO.setApellido("Parker");
        odontologoService.guardar(odontologoDTO);

        //2L
        OdontologoDTO odontologoDTO1 = new OdontologoDTO();
        odontologoDTO1.setMatricula("777king1234");
        odontologoDTO1.setNombre("T'");
        odontologoDTO1.setApellido("Challa");
        odontologoService.guardar(odontologoDTO1);

        if(odontologoDTO!=null || odontologoDTO1 !=null) {
            OdontologoDTO odontologoDTOb = odontologoService.buscar(1L);
            assertTrue(odontologoDTOb != null);
            logger.info("Se agregó información de odontólogos a la base de datos.");
        } else {
            logger.error("No se pudo agregar la información a la base de datos.");
        }


    }
}