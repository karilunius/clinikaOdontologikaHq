package com.clinikaOdontologikaHq.repository.irepo;
import com.clinikaOdontologikaHq.model.entities.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo,Long> {

}
