package com.clinikaOdontologikaHq.service.turno;
import com.clinikaOdontologikaHq.repository.dto.TurnoDTO;
import com.clinikaOdontologikaHq.model.entities.Turno;
import com.clinikaOdontologikaHq.repository.irepo.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TurnoServiceImpl implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void guardar(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public TurnoDTO buscar(Long id) {
        Optional<Turno> turno = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if (turno.isPresent())
            turnoDTO = mapper.convertValue(turno,TurnoDTO.class);
        return turnoDTO;
    }

    @Override
    public void eliminar(Long id) {
           turnoRepository.deleteById(id);
    }

    @Override
    public void actualizar(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public Set<TurnoDTO> listadTodos() {
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDTO> turnosDTO = new HashSet<>();

        for (Turno turno: turnos)
        {
            turnosDTO.add(mapper.convertValue(turno,TurnoDTO.class));
        }
        return turnosDTO;
    }
}
