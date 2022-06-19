package com.argprog.dtobandaescolar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.argprog.dtobandaescolar.model.Alumno;
import com.argprog.dtobandaescolar.service.IAlumnoService;

@RestController
public class AlumnoController {
    
    @Autowired
    private IAlumnoService alumnoInter;

    @PostMapping("/alumnos/save")
    public void saveAlumno(@RequestBody Alumno alumno){
        alumnoInter.saveAlumno(alumno);
    }

    @GetMapping("/alumnos/traer")
    public List<Alumno> getAlumnos(){
        return  alumnoInter.getAlumnos();
    }
}
