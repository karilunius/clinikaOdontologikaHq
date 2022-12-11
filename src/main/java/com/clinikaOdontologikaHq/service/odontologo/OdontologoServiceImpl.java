package com.clinikaOdontologikaHq.service.odontologo;
import com.clinikaOdontologikaHq.repository.dto.OdontologoDTO;
import com.clinikaOdontologikaHq.model.entities.Odontologo;
import com.clinikaOdontologikaHq.repository.irepo.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoServiceImpl implements IOdontologoService{


    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void guardar(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public OdontologoDTO buscar(Long id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        //no esta mandando error cuando no esta x id , dice ok =
        if(odontologo.isPresent())
            odontologoDTO = mapper.convertValue(odontologo,OdontologoDTO.class);
        return odontologoDTO;
    }

    @Override
    public void eliminar(Long id) {
          odontologoRepository.deleteById(id);
    }

    @Override
    public void actualizar(OdontologoDTO odontologoDTO) {
        Optional<Odontologo> idbuscar = odontologoRepository.findById(odontologoDTO.getId());
        if(idbuscar.isPresent()) {
            Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
            odontologoRepository.save(odontologo);
        }
    }

    @Override
    public Set<OdontologoDTO> listadTodos() {
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();

        for(Odontologo odontologo : odontologos)
        {
            odontologosDTO.add(mapper.convertValue(odontologo,OdontologoDTO.class));
        }
        return odontologosDTO;
    }



}
