/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_custom_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class EVA3_9_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        try {
            Persona perso= new Persona("jesus", "meza", -8);
        } catch (DatoIncorrectoCheckEx ex) {
            Logger.getLogger(EVA3_9_CUSTOM_EXCEPTIONS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "---";
        this.apellido = "-----";
        this.edad=0;
    }
    

    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckEx {
        if(edad<0)
            throw new DatoIncorrectoCheckEx();
        this.edad = edad;
    }
    
    
}
class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {//UNCHECKED
        super("Dato incorrecto!! El valor no puede ser negativo");
    }
    
}
class DatoIncorrectoCheckEx extends Exception{

    public DatoIncorrectoCheckEx() {
        super("Dato incorrecto!! El valor no puede ser negativo");
    }
    
}