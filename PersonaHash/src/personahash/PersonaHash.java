/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personahash;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author medac
 */
public class PersonaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet <Persona> personas = new HashSet <>();
        personas.add(new Persona("pepe","777",18));
        personas.add(new Persona("Alex","111",0));
        Persona p1 = new Persona("Elena","77",30);
        Persona p2 = new Persona("Alex", "111",0);
        personas.add(p1);
        System.out.println(personas);
        personas.add(p2);
        System.out.println(personas);
        System.out.println(personas.contains(p1));
        
        TreeSet<Persona> personass = new TreeSet <>();
    }
    
}
