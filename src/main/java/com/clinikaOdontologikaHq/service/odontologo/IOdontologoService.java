package com.clinikaOdontologikaHq.service.odontologo;
import com.clinikaOdontologikaHq.repository.dto.OdontologoDTO;
import org.springframework.stereotype.Service;
import java.util.Set;


public interface IOdontologoService {

    void guardar(OdontologoDTO odontologoDTO);
    OdontologoDTO buscar(Long id);
    void eliminar(Long id);
    void actualizar(OdontologoDTO odontologoDTO);
    Set<OdontologoDTO> listadTodos();

}
