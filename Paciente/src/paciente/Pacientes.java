/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciente;

/**
 *
 * @author medac
 */
public class Pacientes implements Comparable <Pacientes> {
    private int id;
    private static int cont=0;
    private String nombre;
    private int edad;
    
    Pacientes (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        id=cont++;
    }

    @Override
    public int compareTo(Pacientes p) {
        return(edad-p.edad);
        
    }
    
}
