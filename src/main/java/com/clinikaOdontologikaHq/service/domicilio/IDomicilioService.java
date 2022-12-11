package com.clinikaOdontologikaHq.service.domicilio;
import com.clinikaOdontologikaHq.repository.dto.DomicilioDTO;
import java.util.Set;


public interface IDomicilioService{


    void guardar(DomicilioDTO domicilioDTO);
    DomicilioDTO buscar(Long id);
    void eliminar(Long id);
    void actualizar(DomicilioDTO domicilioDTO);
    Set<DomicilioDTO> listadTodos();
}



//realizado previo con dao
/*public interface IDomicilioService {

    public Domicilio guardarDomicilio(Domicilio domicilio);

    public Domicilio buscarDomicilio(Long id);

    public Long eliminarDomicilio(Long id);

    public List<Domicilio> listarDomicilios();

    public Domicilio actualizarDomicilio(Domicilio domicilio);

    public Set<DomicilioDTO> listadTodos();


}*/
