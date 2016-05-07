/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

import java.sql.Date;

/**
 *
 * @author JuanHerrera
 */
public class Prestamo_basico {
    
    private int id;
    private int EquipoBasicoId;
    private int usuarioId;
    private int devuelto;

    public int getDevuelto() {
        return devuelto;
    }

    public void setDevuelto(int devuelto) {
        this.devuelto = devuelto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoBasicoId() {
        return EquipoBasicoId;
    }

    public void setEquipoBasicoId(int EquipoBasicoId) {
        this.EquipoBasicoId = EquipoBasicoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    private String observaciones;
    private int cantidad;
    
    
    public Prestamo_basico(){
        
    }
}
