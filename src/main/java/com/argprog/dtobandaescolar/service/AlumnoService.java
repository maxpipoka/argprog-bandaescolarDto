package com.argprog.dtobandaescolar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argprog.dtobandaescolar.model.Alumno;
import com.argprog.dtobandaescolar.repository.AlumnoRepository;

@Service
public class AlumnoService implements IAlumnoService {
    
    @Autowired
    private AlumnoRepository alumnoRepo;

    @Override
    public List<Alumno> getAlumnos(){
        return alumnoRepo.findAll();
    }

    @Override
    public Alumno findAlumno(Long idAlumno){
        Alumno findedAlumno = alumnoRepo.findById(idAlumno).orElse(null);
        return findedAlumno;
    }

    @Override
    public void saveAlumno(Alumno alumno){
        alumnoRepo.save(alumno);
    }

    @Override
    public void deleteAlumno(Long idAlumno){
        alumnoRepo.deleteById(idAlumno);
    }
}
