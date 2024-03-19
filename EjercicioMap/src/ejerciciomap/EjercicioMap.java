/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomap;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author medac
 */
public class EjercicioMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Integer> notas = new HashMap <>();
        notas.put("Emilio", 6);
        notas.put("Sergio", 9);
        notas.put("Ivan", 10);
        notas.put("Alvaro", 5);
        notas.put("Monica", 2);
        int sumatotal=0;
        int media=0;
        Iterator<String> it = notas.keySet().iterator();
        while(it.hasNext()){
            String clave = it.next();
            int valor = notas.get(clave);
            sumatotal=sumatotal+valor;
            System.out.println(" clave: " + clave + " valor: " + valor);
            
            
        }
        System.out.println(sumatotal);
        media=sumatotal/notas.size();
        System.out.println(media);
        

        HashMap<Integer, String> notas2 = new HashMap<>();
        Iterator<String> it2 = notas.keySet().iterator();
        while(it2.hasNext()){
            String nombre = it2.next();
            int valor2 = notas.get(nombre);
            notas2.put(valor2, nombre);
            System.out.println(notas2);
    }
    }
    
}
