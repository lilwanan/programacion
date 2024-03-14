/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

/**
 *
 * @author medac
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Darthvader d = new Darthvader();
        Leia l = new Leia();
        Luke luk = new Luke();
        Kyloren ky = new Kyloren();
        d.hablar();
        l.hablar();
        luk.hablar();
        ky.hablar();
    }
    
}
