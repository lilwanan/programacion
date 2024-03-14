/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Empieza el juego");
        Coche coche = new Coche();
        Moto moto = new Moto();
        Camion camion = new Camion();
        Vehiculo [] vehiculo = {coche,moto,camion};
        Vehiculo [][] pista = new Vehiculo[3][10];
        Carta [] baraja = new Carta[20];
        String [] objetivo = {"Camión primero y Moto segundo", "Camión segundo y coche primero","Camión tercero y moto primero"};
        boolean fin=false;
        
        
        pista[0][0]=camion;
        pista[1][0]=moto;
        pista[2][0]=coche;
        mostrar(pista);

        
        int rand;
        for(int i =0;i<objetivo.length ;i++){
            
        rand = (int) (Math.random()*3);
        if(objetivo[rand]!=null){
        System.out.println("El objetivo del coche es: " + objetivo[rand]);
        objetivo[rand]=null;
        } else {
            i--;
        }
        }

        for(int i =0;i<baraja.length;i++){
            
        }
        
        do{
            for(int i =0;i<vehiculo.length;i++){
                System.out.println(vehiculo[i].getNombre() + " Coge carta ");
                System.out.println("Quien quieres que avance: 1.camion 2.moto 3.coche");
                System.out.println("Quieres que retroceda 4.Camion 5.moto 6.coche");
                int eleccion;
                eleccion=sc.nextInt();
                switch(eleccion){
                    case 1:
                        camion.setPosx(camion.getPosx()+2);
                        pista[0][camion.getPosx()]=camion;
                        pista[0][camion.getPosx()-2]=null;
                        break;
                    case 2:
                        moto.setPosx(moto.getPosx()+ 4);
                        pista[0][moto.getPosx()]=moto;
                        pista[0][moto.getPosx()-4]=null;
                        break;
                    case 3:
                        coche.setPosx(coche.getPosx()+3);
                        pista[0][coche.getPosx()]=coche;
                        pista[0][coche.getPosx()-3]=null;
                        break;
                        
                    case 4:
                        camion.setPosx(camion.getPosx()-2);
                        pista[0][camion.getPosx()]=camion;
                        pista[0][camion.getPosx()+2]=null;
                        break;
                    case 5:
                        moto.setPosx(moto.getPosx()-4);
                        pista[0][moto.getPosx()]=moto;
                        pista[0][moto.getPosx()+4]=null;
                        break;
                    case 6:
                        coche.setPosx(coche.getPosx()-3);
                        pista[0][coche.getPosx()]=coche;
                        pista[0][coche.getPosx()+3]=null;
                        break;
                }
            }
        
           mostrar(pista);
           if(moto.getPosx()==9 && camion.getPosx()==9 && coche.getPosx()==9){
               fin=true;
           }
        } while (fin==false);
                
               
 
    }

    private static void mostrar(Vehiculo[][] pista) {
          for(int i=0;i<pista.length;i++){
                for(int j=0;j<pista[i].length;j++){
                    if(pista[i][j]!=null){
                    System.out.print(pista[i][j].getNombre());
                    } else {
                    System.out.print("_ ");
                }
            }
            System.out.println(" ");
        }
    }
    
    
    
    
}
