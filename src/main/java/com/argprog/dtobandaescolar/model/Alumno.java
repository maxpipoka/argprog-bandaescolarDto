package com.argprog.dtobandaescolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idAlumno;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String curso;

    public Alumno() {
    }

    public Alumno(Long idAlumno, String nombre, String apellido, String curso) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    
}
