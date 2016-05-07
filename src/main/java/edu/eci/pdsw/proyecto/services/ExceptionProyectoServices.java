/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.proyecto.services;

/**
 *
 * @author 2098654
 */
public class  ExceptionProyectoServices  extends Exception{
    public ExceptionProyectoServices (){
        
    }
    public ExceptionProyectoServices (String message){
        super(message);
    }
    
    public ExceptionProyectoServices (String message ,Throwable cause) {
        super (message, cause);
    }
    public ExceptionProyectoServices (Throwable cause){
        super(cause);
        
    }
    
}
