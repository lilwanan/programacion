/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author medac
 */
public class Darthvader {
    boolean lado_oscuro;
    int habilidad_pilotar;
    int habilidad_espadalaser;
    int poderdelafuerza;
    int habilidad_convencer;
    
    public Darthvader(){
        lado_oscuro=true;
        habilidad_pilotar=5;
        habilidad_espadalaser=4;
        poderdelafuerza=5;
        habilidad_convencer=4;
    }
    public void hablar(){
        System.out.println("Hola, yo soy tu padre");
    }
    
}
