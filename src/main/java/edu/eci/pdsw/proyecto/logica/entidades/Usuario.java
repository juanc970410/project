/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.logica.entidades;

/**
 *
 * @author 2098654
 */
public class Usuario {
      public Usuario(int id,String nombre ,String tipo){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
      }
      
    public Usuario(){
        
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private int id;
    private String nombre ;
    private String tipo;
    
  

}
