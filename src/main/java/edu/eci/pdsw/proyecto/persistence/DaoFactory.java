/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.persistence;

import edu.eci.pdsw.proyecto.persistence.DaoMybatis.DaoFactoryMybatis;
import java.util.Properties;
import javax.persistence.PersistenceException;

/**
 *
 * @author JuanHerrera
 */
public abstract class DaoFactory {
    
    private static volatile DaoFactory instance = null;
    
    public static DaoFactory getInstance(Properties appProperties){
        instance = new DaoFactoryMybatis(appProperties);
        return instance;
    }
    
    public abstract void beginSession() throws PersistenceException;

    public abstract DaoEquipo getDaoEquipo();
    
    public abstract DaoRegistrarPrestamo getDaoRegistrarPrestamo();


    public abstract void commitTransaction() throws PersistenceException;

    public abstract void rollbackTransaction() throws PersistenceException;

    public abstract void endSession() throws PersistenceException;
}
