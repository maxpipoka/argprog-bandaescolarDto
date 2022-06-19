package com.argprog.dtobandaescolar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.argprog.dtobandaescolar.model.Instrumento;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long>{

    
}
