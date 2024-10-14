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
public class Empleado extends Persona{
    
  
    public Empleado( String nombre,String apellido,String nacionalidad,int edad,String telefono,String direccion){
        super(nombre,apellido,nacionalidad,edad,telefono,direccion);
    }

    
    
    public void solicitudPermiso() {
        System.out.println("Nombre:"+nombre+"Apellido:"+apellido+"ha solicitado un permiso");
    }

     public void reporteHorasExtra(int horas) {
        System.out.println("Nombre:"+nombre+"Apellido:"+apellido+ " ha reportado " + horas + " horas extra.");
    }
}
