/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(numeros.size());
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        System.out.println(numeros);
        System.out.println(numeros.size());
        numeros.add(1,4);
        System.out.println(numeros);
        System.out.println(numeros.get(0));
        
        ArrayList <String> nombres = new ArrayList <> ();
        nombres.add("Juan");
        nombres.add("Pepe");
        nombres.add("Elena");
        nombres.remove(1);
        System.out.println(nombres);
        for(String str:nombres){
            System.out.println(str);
        }
        
        String texto;
        texto=sc.next();
        ArrayList <Character> char1 = new ArrayList<>();
        for(int i =0;i<texto.length();i++) {
            char1.add(texto.charAt(i));
            System.out.println(char1);
        }
    }
    
}
