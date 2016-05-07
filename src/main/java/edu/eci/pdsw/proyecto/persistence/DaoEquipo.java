/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author JuanHerrera
 */
public interface DaoEquipo {
    
    
    /**
     * Busca un equipo en espesifico dado una placa del equipo solicitado.
     * @param placa Placa con la cual se va a buscar el equipo en la base de datos.
     * @return Equipo que se esta buscando con la placa.
     */
    public Equipo loadEspecific(String placa);
    
    /**
     * Consulta todos los equipos de un modelo especifico
     * @param modelo Modelo de los equipos que se van a buscar.
     * @return Lista de los equipos que cumplen con el parametro de busqueda.
     */
    public List<Equipo> loadByModel(String modelo);
    
    /**
     * Consulta todos los equipos en la base de datos.
     * @return lista con los equipos de la base de datos.
     */
    public List<Equipo> loadAll();
    
    /**
     * Guarda un equipo en la base de datos.
     * @param e Equipo que se va a guardar.
     */
    public void save(Equipo e);
    
    /**
     * Consulta al usuario que tiene ese equipo
     * @param placa
     * @return Usuario que tiene el equipo
     */
    public Usuario usuarioDeEquipo(int placa);
    
    public void devolucionEquipo(int id_Usuario);
    
}
