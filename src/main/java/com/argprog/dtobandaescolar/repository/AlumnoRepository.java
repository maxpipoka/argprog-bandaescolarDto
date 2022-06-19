package com.argprog.dtobandaescolar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.argprog.dtobandaescolar.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
    
}
