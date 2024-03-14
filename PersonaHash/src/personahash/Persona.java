/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personahash;

import java.util.Objects;

/**
 *
 * @author medac
 */
public class Persona {
    String nombre;
    String dni;
    int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    @Override
    
    public String toString(){
        return this.nombre + this.dni + this.edad;
    }

    @Override
    public int hashCode() {
       /* int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.dni);
        hash = 11 * hash + this.edad;
        return hash;
        
*/
       int a = (int)(Math.random()*10);
       return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // mira si es el mismo objeto
            return true;
        }
        if (obj == null) { //si el objeto a comparar es null
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

}
