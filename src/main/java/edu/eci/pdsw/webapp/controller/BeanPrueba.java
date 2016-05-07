/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webapp.controller;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author jairogonzalez
 */
@SessionScoped
@ManagedBean(name="BeanPruebas")
public class BeanPrueba implements Serializable {
    private Equipo equipoSeleccionado;
    private Prestamo prestamoDeEquipo;
    private List<Equipo> listaDeEquipos;
    private List<Prestamo> listaDePrestamos ;
    private ArrayList<String> ejemplo = new ArrayList<>();
    
    private Equipo getEquipoSeleccionado(){
        return equipoSeleccionado;
    }
    public List<Equipo> getListaDeEquipos(){
        return listaDeEquipos;
    }
    public ArrayList<String> getHistorialPorEquipo(){ 
       ejemplo.add("Ejemplo");
       ejemplo.add("Hola");
       return ejemplo;
       //return listaDePrestamos;
    }
    
    public void setHistorialPorEquipo(ArrayList<String> a){ 
       this.ejemplo = a;
       //return listaDePrestamos;
    }
    
}