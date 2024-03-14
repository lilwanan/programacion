/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anillos;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Anillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Orco orco = new Orco();
        Jugador [] jugadores = {aragorn,legolas,gimli};
        Carta [] mazo = new Carta[10];
        for(int i=0;i<mazo.length;i++){
            int ataque=(int) (Math.random()*10);
            int vida=(int) (Math.random()*10);
            mazo[i]=new Carta(ataque,vida);
        }
        do{
           for (int i=0;i<jugadores.length;i++){
               int random=(int)(Math.random()*10);
               System.out.println(jugadores[i].getNombre());
               jugadores[i].robarCarta(mazo[random]);
               jugadores[i].verCartas();
               System.out.println("Que hacemos: 1. Usar Carta 2. Atacar");
               int respuesta=sc.nextInt();
               switch(respuesta){
                   case 1: //usar carta
                       System.out.println("Que carta quieres jugar");
                       int cartaUsada=sc.nextInt();
                       jugadores[i].usarCarta(cartaUsada);
                       break;
                   case 2:
                       orco.setVida(orco.getVida() - jugadores[i].getAtaque());
                       break;
               }
               
               int rond=(int)(Math.random()*3);
               jugadores[rond].setVida(jugadores[rond].getVida()- orco.getAtaque());
           } 
        } while(orco.getVida()>0);
    }
    
}
