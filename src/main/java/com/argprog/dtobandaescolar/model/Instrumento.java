package com.argprog.dtobandaescolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrumento {
    
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long idInstrumento;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String material;
}
