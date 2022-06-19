package com.argprog.dtobandaescolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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

    public Instrumento() {
    }

    public Instrumento(Long idInstrumento, String nombre, String tipo, String material) {
        this.idInstrumento = idInstrumento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
    }

    public Long getIdInstrumento() {
        return idInstrumento;
    }

    public void setIdInstrumento(Long idInstrumento) {
        this.idInstrumento = idInstrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
}
