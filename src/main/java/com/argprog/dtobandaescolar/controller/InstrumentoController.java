package com.argprog.dtobandaescolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.dtobandaescolar.model.Instrumento;
import com.argprog.dtobandaescolar.service.IInstrumentoService;

@RestController
public class InstrumentoController {
    
    @Autowired
    private IInstrumentoService interInstru;

    @PostMapping("/instrumentos/save")
    public void saveInstrumento(@RequestBody Instrumento instrumento){
        interInstru.saveInstrumento(instrumento);
    }

    @GetMapping("/instrumentos/traer")
    public List<Instrumento> getInstrumentos(){
        return interInstru.getInstrumentos();
    }
}
