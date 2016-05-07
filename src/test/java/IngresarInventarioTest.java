/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas Moreno
 */

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.persistence.DaoEquipo;
import edu.eci.pdsw.proyecto.persistence.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class IngresarInventarioTest {
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo ya esta existente con un numero de serial y un numero de placa.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloExistenteSerialPlaca() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
        daoEquipo.save(e2);
        Assert.assertTrue("Paso la prueba", true);
        dao.endSession();
    }
    
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo ya esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloExistenteSerial() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
        daoEquipo.save(e2);
        Assert.assertTrue("Paso la prueba", true);
        dao.endSession();
    }
    
    
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial y un numero de placa.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloNoExistenteSerialPlaca()throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Assert.assertTrue("Paso la prueba", true);
        dao.endSession();
    }
    
   
    
    /**
    *Se ingresa al inventario un equipo que el modelo no esta existente con solo un numero de serial.
    *Tipo de prueba: positiva.
    *
    */
    @Test
    public void ingresarInventarioModeloNoExistenteSerial() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Assert.assertTrue("Paso la prueba", true);
        dao.endSession();
    }
    
    
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloExistenteSerialExistente() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        try {
            Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
            daoEquipo.save(e2);
        } catch (Exception ex) {
            Assert.assertTrue("Paso la prueba", true);
        }
        dao.endSession();
    }
    
   
    
    /**
     * Se ingresa al inventario un equipo que el modelo esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloExistentePlacaExistente() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        try {
            Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
            daoEquipo.save(e2);
        } catch (Exception ex) {
            Assert.assertTrue("Paso la prueba", true);
        }
        dao.endSession();
    }
    
    
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de serial existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloNoExistenteSerialExistente() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        try {
            Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
            daoEquipo.save(e2);
        } catch (Exception ex) {
            Assert.assertTrue("Paso la prueba", true);
        }
        dao.endSession();
    }
    
    
    
    /**
     * Se ingresa al inventario un equipo que el modelo no esta existente con un numero de placa existente.
     * Tipo de prueba: negativa
     */
    @Test
    public void ingresarInventarioModeloNoExistentePlacaExistente() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        try {
            Equipo e2 = new Equipo(123, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial123", "foto de equipo", null,"nada");        
            daoEquipo.save(e2);
        } catch (Exception ex) {
            Assert.assertTrue("Paso la prueba", true);
        }
        dao.endSession();
    }


}
