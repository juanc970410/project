/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import edu.eci.pdsw.proyecto.services.ServicesFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jairogonzalez
 */
@SessionScoped
@ManagedBean(name="HistoricoPrestamosBean")
public class BeanHistorico implements Serializable {
    // Atributos
    private Equipo equipoSeleccionado;
    private List<Equipo> listaDeEquipos = new ArrayList<Equipo>();
    private List<Prestamo> listaDePrestamos = new ArrayList<Prestamo>();
    private String busqueda = "";
    private ServicesFacade ps;
    
    // Constructor
    public BeanHistorico(){
        this.ps = ServicesFacade.getInstance("applicationconfig.properties");
        //this.listaDeEquipos = ps.listaEquipos();
    }
    
    // Metodos
    /**
    *Devuelve el equipo seleccionado en la vista
    *@return Equipo seleccionado
    */
    
    public Equipo getEquipoSeleccionado(){
        return equipoSeleccionado;
    }
    /**
    *Modifica el equipo que ha sido seleccionado
    *@param equipo Equipo seleccionado en la vista
    */
    public void setEquipoSeleccionado(Equipo equipo){
        this.equipoSeleccionado = equipo;
    }
    /**
    *Devuelve la lista de equipos que hay en el laboratorio
    *@return Lista de equipos 
    */
    public List<Equipo> getListaDeEquipos(){
        return listaDeEquipos;
    }
    /**
    *Depende del equipo seleccionado por el laboratista, devuelve una lista con
    *el historial de prestamos del equipo.
     *
    *@return Lista de prestamos del equipo seleccionado
    */
    public List<Prestamo> getHistorialPorEquipo(){ 
        for (int i =0;i<=equipoSeleccionado.getEquipoPrestamo().size();i++){
            listaDePrestamos.add( equipoSeleccionado.getEquipoPrestamo().get(i));
        }
        return listaDePrestamos;
       //return listaDePrestamos;
    }
    /**
    *Modifica el historial de prestamos del equipo seleccionado.
    *@param a Lista de prestamos modificada
    */
    public void setHistorialPorEquipo(ArrayList<Prestamo> a){ 
       this.listaDePrestamos = a;
       //return listaDePrestamos;
    }
    
    /**
     * Retorna la palabra insertada en el buscador de equipos
     * @return palabra a buscar en la lista de equipos
     */
    public String getBuscar(){
        return this.busqueda;
    }
    
    /**
     * Modifica la palabra insertada en el buscador de equipos
     * @param b palabra a buscar en la lista de equipos
     */
    public void setBuscar(String b){
        this.busqueda = b;
    }
    
    /**
     * 
     */
    public void busqueda(){
        
    }
    
    
}
