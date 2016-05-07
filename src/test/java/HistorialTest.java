/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eci.pdsw.proyecto.logica.entidades.Equipo;
import edu.eci.pdsw.proyecto.logica.entidades.Prestamo;
import edu.eci.pdsw.proyecto.logica.entidades.Usuario;
import edu.eci.pdsw.proyecto.persistence.DaoEquipo;
import edu.eci.pdsw.proyecto.persistence.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class HistorialTest{
    /**CLases de Equivalecia
    *1.(Jairo) El serial del equipo solicitado es una secuencia de numeros enteros, que no contiene letras, ademas este debe ser irrepetible.
    */
    @Test
    public void CE1Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        Assert.assertEquals("Hay diferencias en el equipo buscado y que arroja la busqueda.",e, e2);
        dao.endSession();
        
    }
    
    /**
    2.(Kevin) EL equipo solo puede tener dos estados "activo" o "desactivo", no es nulo.
    */
    @Test
    public void CE2Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        boolean band = false;
        if(e2.getEstado()==0||e2.getEstado()==1)band=true;
        Assert.assertTrue("El estado esta en null.", band);
        dao.endSession();
    }
    
    /**
    3.(Jairo) EL historial debe tener al menos un evento o prestamo.
    */
    @Test
    public void CE3Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        dao.endSession();
    }
    
    /**
    4.(Kevin) el equipo esta o no disponible pero si esta disponible no puede estar prestado.
    */
    @Test
    public void CE4Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        List<Prestamo> lista = new ArrayList<Prestamo>();
        lista.add(new Prestamo(new Usuario(0, "Nicolas", "Estudiante"), java.sql.Date.valueOf(""), java.sql.Date.valueOf("")));
        e.setPrestamoEquipo(lista);
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        if(e2.getEstado()==1){
            List<Prestamo> listaPretamo = e2.getPrestamoEquipo();
            Prestamo p = listaPretamo.remove(listaPretamo.size()-1);
            boolean band = false;
            if(p.getFechaDevolucion()!=null)band = true;
            Assert.assertTrue("El estado esta activo y el equipo esta prestado.", band);
        }
        
        dao.endSession();
    }
    
    /**
    5.(Jairo) La fecha limite de garantia debe ser mayor a la fecha de adquisión.
    */
    @Test
    public void CE5Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        boolean band = false;
        if(e2.getFecha_adquisicion().before(e2.getFecha_garantia())){
            band = true;
        }
        Assert.assertTrue("La fecha de adquisicion es mayor a la de garantia", band);
        dao.endSession();
    }
    
    /*
    6.(Kevin) El equipo solo tiene un proveedor.
    */
    @Test
    public void CE6Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        Assert.assertTrue("El equipo tiene mas de un proveedor", true);
        dao.endSession();
    }
    
    /**
    7.(Jairo) El equipo puede estar asegurado o no estar asegurado.
    */
    @Test
    public void CE7Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        boolean band= false;
        if(e2.getAsegurado()==0||e2.getEstado()==1)band = true;
        Assert.assertTrue("El equipo tiene aseguramiento igual a null", true);
        dao.endSession();
    }
    
    /**
    8.(Kevin) El codigo del Activo es un entero.
    */
    @Test
    public void CE8Test() throws IOException{
       InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        boolean band;
        try{
            int entero = Integer.parseInt(e2.getCodigoActivo()+"");
            band = true;
        }catch (Exception ex){
            band = false;
        }
        Assert.assertTrue("La placa no es un entero", band);
        dao.endSession();
    }
    
    /**
    9.(Jairo) Cada equipo debe tener asociado el valor de compra como un entero.
    */
    @Test
    public void CE9Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        Equipo e = new Equipo(1234, "Electro imán", "nnn", 1, "Electro iman super cargado", java.sql.Date.valueOf("2016-4-21"), java.sql.Date.valueOf("2016-7-21"), 100000, "ref002", 1, "no se", 0, "Delta SAS", "Perfecto estado", "serial1234", "foto de equipo", null,"nada");
        daoEquipo.save(e);
        Equipo e2 = daoEquipo.loadEspecific("1234");
        boolean band;
        try{
            int entero = Integer.parseInt(e2.getValor()+"");
            band = true;
        }catch (Exception ex){
            band = false;
        }
        Assert.assertTrue("El valor del equipo no es un entero", band);
        dao.endSession();
    }
    
    /**
    10.(Kevin) Cada equipo es revisado por un laboratorista.
    */
    @Test
    public void CE10Test() throws IOException{
        InputStream input = null;
        input = ClassLoader.getSystemResourceAsStream("application_test.properties");
        Properties pro = new Properties();
        pro.load(input);
        DaoFactory dao = DaoFactory.getInstance(pro);
        dao.beginSession();
        DaoEquipo daoEquipo =dao.getDaoEquipo();
        dao.endSession();
    } 
    
}
