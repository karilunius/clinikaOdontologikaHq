package com.clinikaOdontologikaHq.repository.irepo;
import com.clinikaOdontologikaHq.model.entities.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno,Long> {
}
