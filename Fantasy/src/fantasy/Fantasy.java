/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Liga Fantasy donde el ganador será juanblazer");
        Scanner sc = new Scanner(System.in);
        Futbolista f1 = new Futbolista("Oblak", "Portero", 24000000.0);
        Futbolista f2 = new Futbolista("Abqar", "Defensa", 6000000.0);
        Futbolista f3 = new Futbolista("Gabriel Paulista", "Defensa", 10000000.0);
        Futbolista f4 = new Futbolista("Valjent", "Defensa", 5600000.0);
        Futbolista f5 = new Futbolista("Isco", "Mediocampista", 750000000.0);
        Futbolista f6 = new Futbolista("Kroos", "Mediocampista", 430000000.0);
        Futbolista f7 = new Futbolista("Oscar Valentin", "Mediocampista", 8800000.0);
        Futbolista f8 = new Futbolista("Riquelme", "Mediocampista", 51000000.0);
        Futbolista f9 = new Futbolista("Oyarzabal", "Delantero", 44000000.0);
        Futbolista f10 = new Futbolista("Gerard Moreno", "Delantero", 54000000.0);
        Futbolista f11 = new Futbolista("Morata", "Delantero", 54000000.0);
        Futbolista f12 = new Futbolista("Ter Stegen", "Portero", 34000000.0);
        Futbolista f13 = new Futbolista("Kounde", "Defensa", 53000000.0);
        Futbolista f14 = new Futbolista("Ramos", "Defensa", 14000000.0);
        Futbolista f15 = new Futbolista("Koke", "Mediocampista", 13000000.0);
        Futbolista f16 = new Futbolista("Pedri", "Mediocampista", 54000000.0);
        Futbolista f17 = new Futbolista("Rakitic", "Mediocampista", 27000000.0);
        Futbolista f18 = new Futbolista("Ayoze Perez", "Delantero", 44000000.0);
        Futbolista f19 = new Futbolista("Parejo", "Mediocampista", 16000000.0);
        Futbolista f20 = new Futbolista("Griezmann", "Delantero", 84000000.0);
        Futbolista f21 = new Futbolista("Rodrygo", "Delantero", 560000000.0);
        Futbolista f22 = new Futbolista("Vinicius", "Delantero", 88000000.0);
        Futbolista [] equipo= {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21,f22};
        Futbolista [] plantilla = new Futbolista[11];
        Futbolista [] centrocampista={f5,f6,f7,f8,f15,f16,f17,f19,null,null,null};
        Futbolista [] delantero = {f9,f10,f11,f18,f20,f21,f22,null,null,null,null};
        Futbolista [] portero = {f1,f12};
        Futbolista [] defensa ={f2,f3,f4,f13,f14};
        int posRandom, accion;
        int poseq,pospl;
        boolean salir =false;
        posRandom = (int) (Math.random()*22);
        
        for(int i = 0; i< plantilla.length && i<centrocampista.length && i<delantero.length;i++){
            if (equipo[posRandom]!=null){
                
                plantilla[i]=equipo[posRandom];
                equipo[posRandom]=null;
                
                
            } else {
                i--;
            }
            posRandom = (int) (Math.random()*22);
        }
        
        do{
            System.out.println("¿Que quieres hacer? : 1. Mostrar Plantilla ; 2. Cambiar Jugador ; 3. Valor Equipo ; 4.Salir");
            accion = sc.nextInt();
            switch (accion){
                case 1: 
                    for (int i = 0 ; i < plantilla.length;i++){
                        if (plantilla[i]!=null){
                            System.out.println(plantilla[i].getNombre() + " " + plantilla[i].getPosicion() + " " + plantilla[i].getValor());
                        }
                    }
                    break;
                case 2:
                    for(int i=0; i<equipo.length;i++){
                        if (equipo[i]!=null){
                            System.out.println("El jugador: " + equipo[i].getNombre() + " " + equipo[i].getPosicion() + " " + equipo[i].getValor() + " " + "está disponible");
                            
                        }
                    }
                    System.out.println("");
                    System.out.println("Tu plantilla: ");
                    for (int i = 0 ; i < plantilla.length;i++){
                        if (plantilla[i]!=null){
                            
                            System.out.println(plantilla[i].getNombre() + " " + plantilla[i].getPosicion() + " " + plantilla[i].getValor());
                        }
                    }
                    System.out.println("Introduce la posición del jugador que quieres cambiar de la lista: ");
                    poseq=sc.nextInt();
                    System.out.println("Elige la posición del jugador que quieres cambiar de tu plantilla: ");
                    pospl=sc.nextInt();
                    plantilla[pospl]=equipo[poseq];
                    equipo[poseq]= null;
                    
                    break;
                            
                case 3:
                    double total;
                    total=plantilla[0].getValor()+plantilla[1].getValor()+plantilla[2].getValor()+plantilla[3].getValor()+plantilla[4].getValor()+plantilla[5].getValor()+plantilla[6].getValor()+plantilla[7].getValor()+plantilla[8].getValor()+plantilla[9].getValor()+plantilla[10].getValor();
                    System.out.println("El total del valor es: " + total);
                    break;
                case 4:
                    salir=true;
            }
            
        } while (salir==false);
    }
    
    
    
    
}
