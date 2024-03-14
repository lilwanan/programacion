/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoteljogo;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class HotelJogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j1 = new Jugador();
        Hotelboom hboom= new Hotelboom();
        HotelChinatown hchin= new HotelChinatown();
        HotelPresident hpre= new HotelPresident();
        HotelWaikiki hwai= new HotelWaikiki();
        HotelFontaine hfon= new HotelFontaine();
        HotelBlue hblu= new HotelBlue();
        Hotel [] array = {hboom,hchin,hpre,hwai,hfon,hblu};
        System.out.println("Comienza el juego");
        Scanner sc = new Scanner(System.in);
        int turno=1;
        int dado;
        int dado_precio;
        int eleccion;
        int multa=j1.getDinero()-500000;
        do{
            System.out.println("Turno " + turno + " :");
            System.out.println("J1 tienes " + j1.getDinero());
            System.out.println("1.HOTEL BOOM [ ] 2.HOTEL CHINATOW [ ] 3.HOTEL PRESIDENT [ ]4. HOTEL WAIKIKI [ ]\n" +
"5.HOTEL FONTAINE [ ] 6.HOTEL BLUE [ ]");
            dado= (int) (Math.random()*7);
            switch(dado){
                case 1:
                    if (hboom.isEstado()==true) {
                        System.out.println("Hotel BOOM , que quieres hacer: 1. jugar 2. Pasar");
                        eleccion = sc.nextInt();
                        if(eleccion==1){
                            dado_precio = (int) (Math.random()*4);
                            if(dado_precio==1){
                                System.out.println("Precio estipulado");
                                j1.setDinero(j1.getDinero()-hboom.getPrecio_compra());
                            } else if (dado_precio==2) {
                                System.out.println("Pagas doble");
                            } else if (dado_precio==3){
                                System.out.println("Pagas triple");
                            } else if(dado_precio==0){
                                System.out.println("Es gratis");
                            }
                            hboom.setEstado(false);
                            turno++;
                        } else {
                            System.out.println("Paso");
                            turno++;
                    }
                    } else {
                        j1.setDinero(multa);
                    }
                    
            }
            
            
        } while(turno<6);
    }
    
    public static void mostrar (Hotel[]tablero){
        char letra=' ';
        for(int i =0;i<tablero.length;i++){
            if(tablero[i].isEstado()){
                letra='x';
            }
            System.out.println(tablero[i].getNombre_hotel()+ " [ " + letra + " ] ");
        }
    }
    
}
