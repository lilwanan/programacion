/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanasanta;

import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author medac
 */
public class SemanaSanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al parking Wanan");
        File file = new File("parking.txt");
        HashMap<String, String> park = new HashMap<>();
        ArrayList<String> horas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        try {
            FileReader freader1 = new FileReader(file);
            BufferedReader breader1 = new BufferedReader(freader1);
            String linea1 = breader1.readLine();

            while (linea1 != null) {
                String[] array1 = linea1.split(" ");
                System.out.println(Arrays.toString(array1));
                for (int i = 0; i < array1.length; i++) {
                    park.put(array1[i], array1[i + 1]);
                    linea1 = breader1.readLine();
                    i++;
                }

            }
            System.out.println(park);
            System.out.println("QUE QUIERES HACER CON EL PARKING 1. INTRODUCIR HORA DE SALIDA MEDIANTE MATRICULA 2. SALIR (TODOS LOS COCHES FUERAS)");
            int menu;
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    File file2 = new File("salida.txt");

                    try {
                        FileWriter fWriter = new FileWriter(file2, true);
                        BufferedWriter buffer = new BufferedWriter(fWriter);
                        System.out.println("Introduce matrícula");
                        String matricula = sc.next();
                        if (park.containsKey(matricula)) {
                            System.out.println("Introduce hora de salida");
                            String hsalida = sc.next();
                            buffer.write(hsalida);
                            horas.add(hsalida);
                            buffer.newLine();
                            buffer.close();
                        }
                    } catch (IOException e) {
                        System.out.println("error");
                    }
                    break;

                case 2:
                    if (park.isEmpty()) {
                        salir = true;
                    }
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("QUE QUIERES HACER 1.CALCULAR PRECIO INSERTANDO MATRICULA 2.CALCULAR GANANCIA TOTAL DEL PARKING 3 CALCULAR TUS GANANCIAS");
        int menu2 = sc.nextInt();
        switch (menu2) {
            case 1:
                System.out.println("Introduce la matricula de tu coche");
                String matricula2 = sc.next();
                if (park.containsValue(matricula2)) {
 
                }
        }
    }

}
