/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

/**
 *
 * @author JuanHerrera
 */
public class Equipo_basico {
    private int cantidad;
    private int id;
    private String nombre;
    
    public Equipo_basico(int cantidad, int id, String nombre){
        this.cantidad = cantidad;
        this.id = id;
        this.nombre = nombre;
    }
    public Equipo_basico(){
        
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
