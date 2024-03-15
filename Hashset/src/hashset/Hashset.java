/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author medac
 */
public class Hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(9);
        System.out.println(numeros);
        numeros.add(9);
        System.out.println(numeros);
*/
        HashSet<String> nombres = new HashSet<>();
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(3);
        conjunto.add(5);
        conjunto.add(7);
        for(int i= 0;i<11;i++){
            if(conjunto.contains(i)){
                System.out.println(i);
            }
        }
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Vicente");
        System.out.println(nombres);
        
        Iterator <String> it = nombres.iterator();
        while(it.hasNext()){ // hay mas bolas en el saco comprueba si hay siguiente elemento
            System.out.println("nombres es: " + it.next());
        }
        String prueba="Pepe";
        System.out.println(nombres.contains(prueba));
        
        
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Juan");
        names.add("Pepe");
        names.add("Elena");
        System.out.println(names);
    }
    
    
}
