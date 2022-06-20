package com.argprog.dtobandaescolar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.argprog.dtobandaescolar.model.Instrumento;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long>{

    // @Query("SELECT t FROM instrumento t WHERE t.nombre = ?1")
    Instrumento findInstrumentoByNombre(String nombre); 
}
