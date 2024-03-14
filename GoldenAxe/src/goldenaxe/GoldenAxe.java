/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goldenaxe;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class GoldenAxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numPart;
        System.out.println("Elige un numero de participantes del 1 al 5");
        Scanner sc = new Scanner(System.in);
        numPart = sc.nextInt();
        int personaje;
        int VidaCthulhu = 20+numPart*2;
        Cthulhu villano = new Cthulhu(VidaCthulhu);
        Jugador [] jugadores = new Jugador[numPart];
        for (int i =0;i<numPart;i++){
            System.out.println("Elige Personaje 1.Guerrero 2.Enano 3.Amazona");
            personaje=sc.nextInt();
            switch(personaje){
                case 1:
                    
                    jugadores[i]=new Guerrero();
                    break;
                case 2:
                    jugadores[i]=new Enano();
                    break;
                case 3:
                    jugadores[i]=new Amazona();
            }
        }
        do {
            
            
            
            
        } while(villano.isEstaVivo()==true);
        
    }
    
}
