/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas Moreno
 */


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RegistrarDevolucionTest {
    
    /**
     * Devolucion de varios o un equipo que estos equipos le pertenecen a un usuario.
     * Tipo de prueba: positiva.
     */
    @Test
    public void devolucionVariosEquiposUnUsuario(){
        
    }
    
    /**
     * Devolucion de varios equipos que pertenecen a varios usuarios.
     * Tipo de prueba: positiva.
     */
    @Test
    public void devolucionVariosEquiposVariosUsuarios(){
    
    }
    
    /**
     * Devolucion sin ningun equipo.
     * Tipo de prueba: positiva.
     */
    @Test
    public void devolucionSinEquipos(){
    
    }
    
    /**
     * Devolucion que no le pertenecen a ningun usuario.
     * tipo de prueba: negativa.
     */
    @Test
    public void devolucionVariosEquiposUsuarioNoValido(){
        
    }
    
    /**
     * Devolucion de equipos que no se encuentran en la base de datos.
     * tipo de prueba: negativa.
     */
    @Test
    public void devolucionEquiposNoValidos(){
        
    }
    
}
