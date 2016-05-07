/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.services;

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.persistence.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import javax.persistence.PersistenceException;

/**
 *
 * @author nicolas
 */

public class ServicesFacade{
    private static ServicesFacade instance=null;
    
    private final Properties properties=new Properties();
    
    private final DaoFactory dc=null;
    
    private ServicesFacade(String propFileName) throws IOException{        
	InputStream input = null;
        input = this.getClass().getClassLoader().getResourceAsStream(propFileName);        
        properties.load(input);
        
    }
    
    public static ServicesFacade getInstance(String propertiesFileName) throws RuntimeException{
        if (instance==null){
            try {
                instance=new ServicesFacade(propertiesFileName);
            } catch (IOException ex) {
                throw new RuntimeException("Error on application configuration:",ex);
            }
        }        
        return instance;
    }
    
    
    public void registrarEquipo(Equipo eq)throws PersistenceException{
       DaoFactory daoFac = DaoFactory.getInstance(properties);
       try{
           daoFac.beginSession();  
       }catch(PersistenceException ex){
           throw new PersistenceException("No inicio la conexion", ex);
       }
              
        daoFac.getDaoEquipo().save(eq);
        
        daoFac.endSession();               
    }
   
    
    public boolean consultarModelo(String modelo){
        DaoFactory daoFac = DaoFactory.getInstance(properties);
        daoFac.beginSession();
        daoFac.getDaoEquipo().loadEspecific(modelo);
        
        daoFac.endSession();
        return false;
    }

    public void aumentarInventario(String modelo,int cant){
        DaoFactory daoFac = DaoFactory.getInstance(properties);
        daoFac.beginSession();
        daoFac.getDaoEquipo();
        
        daoFac.endSession();
    }

    public List<Equipo> listaEquipos(){
        DaoFactory daoFac = DaoFactory.getInstance(properties);
        List listaEquipos = null;
        daoFac.beginSession();
        listaEquipos = daoFac.getDaoEquipo().loadAll();
        daoFac.endSession();
        return listaEquipos;
    }
}
