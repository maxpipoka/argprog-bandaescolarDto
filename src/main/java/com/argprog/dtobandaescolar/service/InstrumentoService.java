package com.argprog.dtobandaescolar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argprog.dtobandaescolar.model.Instrumento;
import com.argprog.dtobandaescolar.repository.InstrumentoRepository;

@Service
public class InstrumentoService implements IInstrumentoService{

    @Autowired
    private InstrumentoRepository instruRepo;

    @Override
    public List<Instrumento> getInstrumentos(){
        return instruRepo.findAll();
    }

    @Override
    public Instrumento findInstrumento(Long idInstrumento){
        Instrumento findedInstrumento = instruRepo.findById(idInstrumento).orElse(null);
        return findedInstrumento;
    }

    @Override
    public void saveInstrumento(Instrumento instrumento){
        instruRepo.save(instrumento);
    }
    
    @Override
    public void deleteInstrumento(Long idInstrumento){
        instruRepo.deleteById(idInstrumento);
    }

    @Override
    public Instrumento findInstrumentoByNombre(String nombre){
        Instrumento findedInstrumento= instruRepo.findInstrumentoByNombre(nombre);
        return findedInstrumento; 
    }
}
