package com.argprog.dtobandaescolar.service;

import com.argprog.dtobandaescolar.model.Alumno;
import java.util.List;

public interface IAlumnoService {
    
    public List<Alumno> getAlumnos();

    public Alumno findAlumno(Long idAlumno);

    public void saveAlumno(Alumno alumno);

    public void deleteAlumno(Long idAlumno);
}
