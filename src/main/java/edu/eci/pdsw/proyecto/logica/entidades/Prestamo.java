/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author 2098654
 */
public class Prestamo {
    // Atributos
    private Date fechaPrestamo ;
    private Date fechaDevolucion ;
    private Usuario usuario;
    private int placaEquipo;
    private Usuario id_reviso;

    public int getPlacaEquipo() {
        return placaEquipo;
    }

    public void setPlacaEquipo(int placaEquipo) {
        this.placaEquipo = placaEquipo;
    }

    public Usuario getId_reviso() {
        return id_reviso;
    }

    public void setId_reviso(Usuario id_reviso) {
        this.id_reviso = id_reviso;
    }
    private String detalle;
    private int id;
    private Date fechaEstimada;

    // Constructor
    public Prestamo(Usuario usuario, Date fechaPrestamo, Date fechaEstimada) {
        this.usuario=usuario;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEstimada = fechaEstimada;
    }

    
    
    // GET'S y SET'S
            

    public Prestamo(){
        
    }

    public Date getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.usuario = Usuario;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    

    
}
