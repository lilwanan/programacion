/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <Carta> mazo =new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        LinkedList <Carta> mesa =new LinkedList<>();
        LinkedList <Carta> jugador =new LinkedList<>();
        for (int i = 1  ; i < 14; i++) {
            
            mazo.add(new Carta(i,"picas"));
            mazo.add(new Carta(i,"corazones"));
            mazo.add(new Carta(i,"diamantes"));
            mazo.add(new Carta(i,"trebol"));
            
        }
        mazo.get(1).setLetra("A");
      /*
         for (int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i));
            
        }
        */
       
        Collections.shuffle(mazo);
        
        for (int i = 0; i < 2; i++) {
            jugador.add(mazo.pollFirst());
            mesa.add(mazo.pollFirst()); 
        }
       int eleccion=0;
        boolean plantado=false;
        
        do {
            System.out.println("---MESA---");
            System.out.println(mesa);
            System.out.println("--Jugador--");
            System.out.println(jugador);
            System.out.println(" 1Robar Carta,2. Retirada");
            eleccion=sc.nextInt();
           
            switch(eleccion){
             
                case 1:
                    
                    jugador.add(mazo.pollFirst());
                    System.out.println(jugador.getLast());
                  
                    break;
                case 2:
                    plantado=true;
                    break;
            }
             
             System.out.println("tu puntuacion es de:  "+ sumarPuntuacion(jugador));
            
        } while (!plantado&&sumarPuntuacion(jugador)<21);
        
        System.out.println("Turno Crupier");
       System.out.println("Cartas mesa: " +mesa);
            System.out.println(sumarPuntuacion(mesa));
      
        while (sumarPuntuacion(mesa)<16){
            mesa.add(mazo.pollFirst());
            System.out.println("Cartas mesa: " +mesa);
            System.out.println(sumarPuntuacion(mesa));
        }
        if (sumarPuntuacion(mesa)>21) {
            System.out.println("La banca Pierde");
            
        }else if (sumarPuntuacion(jugador)>21){
            System.out.println("La banca gana");
        }
        else if (sumarPuntuacion(mesa)>sumarPuntuacion(jugador)) {
            System.out.println("la Banca gana");
        } else if (sumarPuntuacion(mesa)==sumarPuntuacion(jugador)){
            System.out.println("EMPATE");
        } else{
            System.out.println("La Banca PIERDE");
        } 
            
    }

    private static int sumarPuntuacion(LinkedList<Carta> jugador) {
       int puntuacion=0;
       
        for (int i = 0; i < jugador.size(); i++) {
            puntuacion+=jugador.get(i).getNumero();
            
        }
       return puntuacion;
    }

   

   
    
}
