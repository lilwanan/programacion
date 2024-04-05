/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unoenclase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class UnoenClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Carta>mazo=new LinkedList<>();
        ArrayList<Carta>j1=new ArrayList<>();
        ArrayList<Carta>j2=new ArrayList<>();
        LinkedList<Carta>tablero=new LinkedList<>();
        crearCarta(mazo);
        Collections.shuffle(mazo);
        
        
        for (int i = 0; i <= 7; i++) {
            j1.add(mazo.pollFirst());
            j2.add(mazo.pollFirst());
        }
        tablero.add(mazo.pollFirst());
        System.out.println(tablero);
        
        
        
        do {
            Collections.sort(j1);
         Collections.sort(j2);
            //Jugador 1
            System.out.println("--------------------------");
                    System.out.println("Jugador 1");
                    System.out.println(j1);
            System.out.println("1-Robar carta, 2 - Jugar carta");
            int opcion = sc.nextInt();
            switch (opcion) {
                
                case 1:
                    j1.add(mazo.pollFirst());
                break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Jugador 1");
                    System.out.println("Que carta quieres usar?");
                    mostrar(j1);
                    int resp = sc.nextInt();
                    if (j1.get(resp).getNombre().equalsIgnoreCase(tablero.getLast().getNombre())||j1.get(resp).getNum()==tablero.getLast().getNum()) {
                        tablero.add(j1.get(resp));
                        j1.remove(resp);
                    }else{
                        System.out.println("No puedes poner esa carta te comes una");
                        j1.add(mazo.pollFirst());
                    }
                break;
                
            }
            switch (opcion) {
               //jugador 2
                case 1:
                    j1.add(mazo.pollFirst());
                break;
                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Jugador 1");
                    System.out.println("Que carta quieres usar?");
                    mostrar(j1);
                    int resp = sc.nextInt();
                    if (j1.get(resp).getNombre().equalsIgnoreCase(tablero.getLast().getNombre())||j1.get(resp).getNum()==tablero.getLast().getNum()) {
                        tablero.add(j1.get(resp));
                        j1.remove(resp);
                    }else{
                        System.out.println("No puedes poner esa carta te comes una");
                        j1.add(mazo.pollFirst());
                    }
                break;
                
            }
        } while (j1.isEmpty()||j2.isEmpty());
        
        Iterator<Carta> it = mazo.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
       
        
        
        
        
        
    }

    private static void crearCarta(LinkedList<Carta>mazo) {
        for (int i = 0; i <=9; i++) {
            mazo.add(new Carta("Rojo",i));
            mazo.add(new Carta("Azul",i));
            mazo.add(new Carta("Amarillo",i));
            mazo.add(new Carta("Verde",i));
        }
     
}   

    private static void mostrar(ArrayList<Carta> j1) {
        for (int i = 0; i < j1.size(); i++) {
            System.out.println(i+"."+j1.indexOf(i));
        }
    }
    
}
