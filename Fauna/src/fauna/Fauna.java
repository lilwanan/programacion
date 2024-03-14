/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fauna;

/**
 *
 * @author medac
 */
public class Fauna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro p = new Perro();
        p.comer();
        p.dormir();
        Gato g = new Gato();
        g.comer();
        g.dormir();
        Animal[] array = {p,g};
    }
    
}
