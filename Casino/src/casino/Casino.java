/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casino;
import cluedo.Personax;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al casino");
        Ludopata ludopata1 = new Ludopata("Juanan");
        Ludopata ludopata2 = new Ludopata("Paco");
        //Personax p1 = new Personax("Mayordomo", "Hall de Entrada");
        System.out.println("Empieza la rule");
        System.out.println("Fichas jugador1: " + ludopata1.getFichas() + " " + "Fichas jugador 2: " + ludopata2.getFichas());
        System.out.println("Introduce Modalidad, 1. Seleccionar Numero ; 2. Seleccionar Color");
        int apuesta = sc.nextInt();
        int numero_apost1,numero_apost2;
        boolean salir=false;
        boolean ronda=false;
        do{
        switch(apuesta){  // aqui vamos a elegir modalidad
            case 1:
                System.out.println("Selecciona un numero y apuesta tu cantidad");
                System.out.println("Selecciona numero del 1 al 9");
                numero_apost1=sc.nextInt();
                
                ludopata1.apostar(ludopata1);
                System.out.println("Selecciona numero del 1 al 9");
                numero_apost2=sc.nextInt();
                ludopata2.apostar(ludopata2);
                System.out.println("Fichas restantes J1: " + ludopata1.getFichas() + " " + "Fichas restantes J2: " + ludopata2.getFichas());
                System.out.println("Vuelve a introducir modalidad");
                apuesta=sc.nextInt();
                break;
                
            case 2:
                System.out.println("Selecciona color J1");
                ludopata1.elegirColor(ludopata1);
                System.out.println("Selecciona color J2");
                ludopata2.elegirColor(ludopata2);
                System.out.println("Vuelve a introducir modalidad");
                apuesta=sc.nextInt();
                break;
               
            case 3: // caso para printear numero y color
                int numeroRule, colorRule;
                System.out.println("La bola da unas cuantas vueltas y sale el numero...");
                numeroRule = (int) (Math.random()*10);
                colorRule = (int) (Math.random()*4);
                System.out.println("La bola da unas cuantas vueltas y sale el numero..." + numeroRule + " " + colorRule);
                System.out.println("Fichas restantes J1: " + ludopata1.getFichas() + " " + "Fichas restantes J2: " + ludopata2.getFichas());
                if (ludopata1.getFichas()==0 || ludopata2.getFichas()==0){
                    System.out.println("Te has quedado sin fichas");
                    salir=true;
        }
        }
        
        
        
        
        
        
        } while(salir==false); 
    }
    
}
