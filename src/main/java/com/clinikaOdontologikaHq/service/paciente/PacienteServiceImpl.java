package com.clinikaOdontologikaHq.service.paciente;
import com.clinikaOdontologikaHq.repository.dto.PacienteDTO;
import com.clinikaOdontologikaHq.model.entities.Paciente;
import com.clinikaOdontologikaHq.repository.irepo.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteServiceImpl implements IPacienteService{


    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void guardar(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public PacienteDTO buscar(Long id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO = null;
        if (paciente.isPresent())
            pacienteDTO = mapper.convertValue(paciente,PacienteDTO.class);
        return pacienteDTO;
    }

    @Override
    public void eliminar(Long id) {
         pacienteRepository.deleteById(id);
    }

    @Override
    public void actualizar(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public Set<PacienteDTO> listadTodos() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();

        for (Paciente paciente: pacientes
             ) {
            pacientesDTO.add(mapper.convertValue(paciente,PacienteDTO.class));
        }
        return pacientesDTO;
    }
}
