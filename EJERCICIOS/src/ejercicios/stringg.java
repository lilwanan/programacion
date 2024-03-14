/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class stringg {
    
    public static void main(String[] args) {
        /*
        String texto1 = "hola";
        String texto2 = "Que tal";
        String texto3 = texto1 + texto2;
        String texto4 = "holas";
        
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto1.equals(texto4)); // compara si son iguales
        System.out.println(texto3.length()); // tamaño del string
        System.out.println(texto1.indexOf('h')); // posicion h
        System.out.println(texto3.indexOf('a'));
        System.out.println(texto2.charAt(2)); // te muestra la posicion que quieras del string
        System.out.println(texto1.substring(0,2)); // te hace un substring entre las posiciones que pongas
        System.out.println(texto1.toUpperCase()); // mayus
        System.out.println(texto3.equalsIgnoreCase(texto4)); // para ignorar mayusculas y minusculas
        System.out.println(texto1.compareTo(texto4));
        System.out.println(String texto1.valueOf(5));
        System.out.println(texto1.replace('o', 'a'));

        
        //el usuario introduce 2 palabras y decir cual es mas grande
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        boolean comparar;
        palabra1 = sc.nextLine();
        palabra2 = sc.nextLine();
        comparar=palabra1.equals(palabra2);
        if(comparar==false){
            
            if(palabra1.length()< palabra2.length()){
                System.out.println("Palabra dos mayor");
            } else {
                System.out.println("Palabra 1 mayor");
            }
        } else {
            System.out.println("Son iguales");
        }
        
        
 */       
        //el primer jugador introduce una palabra y guarda la primera y ultima posicion de esa palabra y el jugador tiene q adivinar
        Scanner sc = new Scanner (System.in);
        String palabra1;
        System.out.println("Introduce una palabra");
        palabra1 = sc.nextLine();
        String palabra2=null;
        System.out.println("La longitud de la palabra es: " + palabra1.length());
        System.out.println("La letra inicial es: " + palabra1.charAt(0));
        System.out.println("La letra final es: " + palabra1.charAt(palabra1.length()-1));
        while(!palabra1.equals(palabra2)){
            System.out.println("Introduce una palabra");
            palabra2= sc.nextLine();
        }
        
        
        
        
     }

        
}
