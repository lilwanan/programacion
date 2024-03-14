/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author medac
 */
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 inserta huesped 2. nº habitaciones libres 3. calcula precio por nombre del huesped 4. elimina huesped por nombre 
        // 5. busca huesped por nombre 6. buscar huesped por nº habitacion 7 salir
        Scanner sc = new Scanner(System.in);
        Huesped [] array = new Huesped [20];
        int elegir;
        int i;
        String nombre;
        int noches;
        boolean salir=true;
        int num_hab;
        do{
        System.out.println("Que quieres hacer 1 inserta huesped 2. nº habitaciones libres 3. calcula precio por nombre del huesped 4. elimina huesped por nombre \n" +
"        // 5. busca huesped por nombre 6. buscar huesped por nº habitacion 7 salir");
        elegir=sc.nextInt();
        switch(elegir){
            case 1:
                System.out.println("Nombre");
                nombre= sc.next();
                System.out.println("Numero noches");
                noches= sc.nextInt();
                Huesped huesped = new Huesped(nombre,noches);
                System.out.println("Introduce en que habitación vas a meter al huesped");
                i=sc.nextInt();
                array[i]=huesped;
                i++;
                break;
            case 2:
                for (int fila=0 ; fila<array.length;fila++){
                    if(array[fila]==null){
                        System.out.println("La habitación " + fila + " " + "está libre");
                    } else {
                        System.out.println("La habitación " + fila + " " + "está ocupada");
                    }
                }
                break;
            case 3:
                System.out.println("Introduce nombre");
                nombre=sc.next();
                for(int fila=0 ; fila<array.length;fila++){
                    if(array[fila]!=null){
                        if(nombre.equals(array[fila].getNombre()));{
                            array[fila].precio();
                }
                    }
 
                }
                break;
            case 4:
                System.out.println("Introduce nombre");
                nombre=sc.next();
                for (int fila=0;fila<array.length;fila++){
                    if(array[fila]!=null){
                        if(nombre.equals(array[fila].getNombre())){
                        array[fila]=null;
                    }
                    }
                    
                }
                break;
            case 5:
                System.out.println("Introduce nombre para buscar");
                nombre=sc.next();
                for (int fila=0;fila<array.length;fila++){
                    if(array[fila]!=null){
                        if(nombre.equals(array[fila].getNombre())){
                            System.out.println(array[fila].getNombre() + " " + "Está en la habitación " + fila); // como es una posicion del array se accede asi
                    }
                    }
                }
            case 6:
                System.out.println("Introduce numero hab");
                num_hab=sc.nextInt();
                for (int fila=0;fila<array.length;fila++){
                    if(num_hab==fila){
                        System.out.println("La habitacion " + fila + " " + "Es de: " + array[fila].getNombre());
                    }
                }
            case 7:
                salir =false;
                
        }
        } while(salir=true);
    }
    
}
