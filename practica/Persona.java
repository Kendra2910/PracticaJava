/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author kelvin
 */
public class Persona {
    String nombre;
    String apellido;
    String nacionalidad;
    int edad;
    String telefono;
    String direccion;

    public Persona(String nombre, String apellido, String nacionalidad, int edad, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
     public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
        
    }
    
     public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
