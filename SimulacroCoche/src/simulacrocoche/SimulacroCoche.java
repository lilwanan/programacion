/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacrocoche;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author medac
 */
public class SimulacroCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Carta> cartas = new LinkedList<>();
        crearCartas(cartas);
        
        LinkedList<Carta> listaJ1 = new LinkedList<>();
        LinkedList<Carta> listaJ2 = new LinkedList<>();
        repartirCartas(cartas,listaJ1,listaJ2);
        Jugador J1 = new Jugador(listaJ1);
        Jugador J2 = new Jugador(listaJ2);
        LinkedList<Carta> mesaJ1 = new LinkedList();
        LinkedList<Carta> mesaJ2 = new LinkedList();
        do{
            
        } while (J1.getKmTotales()<10000 || J2.getKmTotales()<10000);
    }
    
    public static void crearCartas(LinkedList<Carta> cartas){
        for (int i =0;i<8;i++){
            cartas.add(new Carta("Semaforo verde",0,false));
            cartas.add(new Carta("Semaforo rojo",0,true));
            cartas.add(new Carta("Gasolina",0,false));
            cartas.add(new Carta("Sin gasolina",0 ,true));
            if(i<2){
                cartas.add(new Carta("200km",200,false));
                cartas.add(new Carta("75", 75, false));
                cartas.add(new Carta("25",25,false));
                cartas.add(new Carta("50", 50 , false));
                cartas.add(new Carta("150",150,false));
                
            }
            else {
                cartas.add(new Carta("100",100,false));
            }
        }
    }

    private static void repartirCartas(LinkedList<Carta> cartas, LinkedList<Carta> listaJ1, LinkedList<Carta> listaJ2) {
        Collections.shuffle(cartas);
        for (int i = 0 ;i<6;i++){
            listaJ1.add(cartas.pollFirst());
            listaJ2.add(cartas.pollFirst());
        }
        
    }
    
    public static boolean comprobarVerde(LinkedList<Carta> lista){
        boolean verde = false;
        if(lista.getLast().getNombre().equalsIgnoreCase("Semaforo verde")){
            verde = true;
        } else if(lista.isEmpty()){
            verde=true;
        }
        return verde;
    }
    
}
