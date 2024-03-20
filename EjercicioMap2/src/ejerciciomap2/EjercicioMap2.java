/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomap2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author medac
 */
public class EjercicioMap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> hack = new HashMap<>();
        hack.put("admin", "admin");
        hack.put("user", "user11");
        hack.put("ivan", "1234");
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        do {
            System.out.println("Introduce usuario y contraseña");
            String usuario = sc.next();
            String contra = sc.next();
            if(hack.containsKey(usuario)&& hack.get(usuario).equals(contra)){
                
                System.out.println("Sesion iniciado");
                cont=4;
            } else {
                System.out.println("error");
                cont++;
            }
        } while (cont <= 3);
    }
    
}
