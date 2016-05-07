/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo_basico;
import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import edu.eci.pdsw.proyecto.services.ServicesFacade;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.Date;
import java.util.*;

/**
 *
 * @author Kevin S. Sanchez
 */

@ManagedBean(name = "BeanPrestamo")
@SessionScoped
public class BeanPrestamo {
    //Atributos 
   private Date fechaPrestamo;
   private Date fechaDevolucion;
   private Usuario usuario;
   private List<Equipo_basico> objetos;
   private String detalle;
   private int id;
   private Date fechaEstimada;
   private Prestamo p;
   private ServicesFacade sf;
   
   //Constructor
   public BeanPrestamo(){
       this.sf = ServicesFacade.getInstance("aplicationconfig.properties");
   }
   
   // Metodos
   
   // OPERACIONES
   public void añadirPrestamo(){
       p = new Prestamo(usuario, fechaPrestamo, fechaEstimada);
   }
   
   public void añadirCarritoPrestamos(){
       for (Iterator<Equipo_basico> iterator = objetos.iterator(); iterator.hasNext();) {
           Equipo_basico next = iterator.next();
            //p.añadirEquipo(next);
           //p.añadirEquipo(next);
       }
   }
   
    
    // GET's
    /**
     * Metodo que devuelve los detalles de un prestamo
     * @return El detalle de un prestamo
     */
    public String getDetalle() {
        return detalle;
    } 
    
    /**
     * Metodo que devuelve la fecha de devolucion de los objeto(s) de un prestamo
     * @return La fecha de devolucion de los objeto(s) de un prestamo
     */
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    /**
     * Metodo que devuelve la fecha estimada de los objeto(s) de un prestamo
     * @return La fecha de devolucion de los objeto(s) de un prestamo
     */
    public Date getFechaEstimada() {
        return fechaEstimada;
    }
    
    /**
     * Metodo que devuelve la fecha de prestamo.
     * @return La fecha de prestamo.
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    /**
     * Metodo que devuelve el identificador unico de un prestamo.
     * @return El identificador unico de un prestamo
     */
    public int getId() {
        return id;
    }
    
    /**
     * Metodo que devuelve una lista de objetos de un prestamo
     * @return La lista de los objetos prestados
     */
    public List<Equipo_basico> getObjetos() {
        return objetos;
    }
    
    /**
     * Metodo que devuelve el usuario que solicito un prestamo
     * @return El usuario que solicito un prestamo
     */
    public Usuario getUsuario() {
        return usuario;
    }
    
    // SET's
    /**
     * Metodo que modifica los detalles de un prestamo
     * @param detalle El detalle de un prestamo
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    /**
      * Metodo que modifica la fecha de devolucion de los objeto(s) de un prestamo
     * @param fechaDevolucion La fecha de devolucion de los objeto(s) de un prestamo
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    /**
     * Metodo que modifica la fecha estimada de los objeto(s) de un prestamo
     * @param fechaEstimada La fecha de devolucion de los objeto(s) de un prestamo
     */
    public void setFechaEstimada(Date fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }
    
    /**
     * Metodo que modifica la fecha de prestamo.
     * @param fechaPrestamo La fecha de prestamo.
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    /**
     * Metodo que modifica el identificador unico de un prestamo.
     * @param id  El identificador unico de un prestamo
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metodo que modifica una lista de objetos de un prestamo
     * @param objetos La lista de los objetos prestados
     */
    public void setObjetos(List<Equipo_basico> objetos) {
        this.objetos = objetos;
    }
    
    /**
     * Metodo que modifica el usuario que solicita un prestamo
     * @param usuario El usuario que solicito un prestamo
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
   
}
