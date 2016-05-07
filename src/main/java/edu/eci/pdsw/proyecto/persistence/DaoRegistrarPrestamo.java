/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import java.util.List;

/**
 *
 * @author 2098654
 */
public interface DaoRegistrarPrestamo {
    
    /**
     * Carga un prestamo especifico dado un identificador.
     * @param id identificador con el cual se va a referenciar el prestamo.
     * @return prestamo que se esta buscando con el identifacor.
     */
    public Prestamo loadEspecific(int id);
   
        /**
     * Carga todos los prestamos que se tienen registrados.
     * @return todos los prestamos que se tienen registrados.
     */
    public List<Prestamo> loadAll();
    
            /**
     * Guarda un prestamo en la base de datos
     * @param p El prestamo que se va a guardar en la base de datos.
     */
    public void save(Prestamo p);
    
                /**
     * Elimina un prestamo de la base de datos.
     * @param id un identificador del prestamo que va a eliminar de la base datos.
     */
    public void delete(int id);
    
    
    
    
    
    
    
    
}
