package com.clinikaOdontologikaHq.service.paciente;
import com.clinikaOdontologikaHq.repository.dto.PacienteDTO;
import java.util.Set;

public interface IPacienteService {

    void guardar(PacienteDTO pacienteDTO);
    PacienteDTO buscar(Long id);
    void eliminar(Long id);
    void actualizar(PacienteDTO pacienteDTO);
    Set<PacienteDTO> listadTodos();
}
