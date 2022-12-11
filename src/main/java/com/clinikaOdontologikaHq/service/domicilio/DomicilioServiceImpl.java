package com.clinikaOdontologikaHq.service.domicilio;
import com.clinikaOdontologikaHq.repository.dto.DomicilioDTO;
import com.clinikaOdontologikaHq.model.entities.Domicilio;
import com.clinikaOdontologikaHq.repository.irepo.IDomicilioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioServiceImpl implements IDomicilioService{

    @Autowired
    private IDomicilioRepository domicilioRepository;


    @Autowired
    ObjectMapper mapper;

    @Override
    public void guardar(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO,Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public DomicilioDTO buscar(Long id) {
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        DomicilioDTO domicilioDTO = null;
        if (domicilio.isPresent())
            domicilioDTO = mapper.convertValue(domicilio, DomicilioDTO.class);
        return domicilioDTO;
    }

    @Override
    public void eliminar(Long id) {
        domicilioRepository.deleteById(id);
    }

    @Override
    public void actualizar(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO,Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public Set<DomicilioDTO> listadTodos() {
         List<Domicilio> domicilios = domicilioRepository.findAll();
         Set<DomicilioDTO> domiciliosDTO = new HashSet<>();

        for (Domicilio domicilio: domicilios
             ) {
            domiciliosDTO.add(mapper.convertValue(domicilio,DomicilioDTO.class));
        }
        return domiciliosDTO;
    }



}
