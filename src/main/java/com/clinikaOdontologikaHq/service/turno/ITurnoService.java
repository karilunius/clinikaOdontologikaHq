package com.clinikaOdontologikaHq.service.turno;
import com.clinikaOdontologikaHq.repository.dto.TurnoDTO;

import java.util.Set;

public interface ITurnoService {

    void guardar(TurnoDTO turnoDTO);
    TurnoDTO buscar(Long id);
    void eliminar(Long id);
    void actualizar(TurnoDTO turnoDTO);
    Set<TurnoDTO> listadTodos();

}
