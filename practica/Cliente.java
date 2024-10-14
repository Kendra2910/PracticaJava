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
public class Cliente extends Persona {
    
     public Cliente( String nombre,String apellido,String nacionalidad,int edad,String telefono,String direccion){
        super(nombre,apellido,nacionalidad,edad,telefono,direccion);
    }


public void contactarRepresentante() {
        System.out.println("Nombre:"+nombre+"Apellido:"+apellido+" ha contactado a un representante.");
    }

    public void solicitarInformacion() {
        System.out.println("Nombre:"+nombre+"Apellido:"+apellido+" ha solicitado información.");
    }
}
