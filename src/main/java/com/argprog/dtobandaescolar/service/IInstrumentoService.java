package com.argprog.dtobandaescolar.service;

import com.argprog.dtobandaescolar.model.Instrumento;
import java.util.List;

public interface IInstrumentoService {
    
    public List<Instrumento> getInstrumentos();

    public Instrumento findInstrumento(Long idInstrumento);

    public void saveInstrumento(Instrumento instrumento);

    public void deleteInstrumento(Long idInstrumento);
}
