/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paciente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author medac
 */
public class Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Pacientes> pacientes = new ArrayList<>();
        int resp;
        do{
            System.out.println("1AÑADIR 2SALIR");
            resp=sc.nextInt();
            switch(resp){
                case 1:
                    pacientes.add(new Pacientes (sc.next(),sc.nextInt()));
                    break;
                case 2:
                    Collections.sort(pacientes);
                    System.out.println(pacientes);
                    break;
            }
        } while (resp!=2);
    }
    
}
