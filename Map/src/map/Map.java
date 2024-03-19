/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author medac
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,String> diccionario = new HashMap<>();
        diccionario.put("Seat", "Ibiza");
        diccionario.put("Ford", "Fiesta");
        diccionario.put("Opel", "Corsa");
        diccionario.put("Peugeot", "206");
        diccionario.put("Fiat", "Punto");
        
        System.out.println(diccionario);
        System.out.println(diccionario.put("Peugeot", "3008"));
        System.out.println(diccionario);
        System.out.println(diccionario.size());
        System.out.println(diccionario.isEmpty());
        System.out.println(diccionario.get("Seat"));
        System.out.println(diccionario.containsKey("Ford"));
        System.out.println(diccionario.containsValue("Punto"));
        System.out.println(diccionario.values());
        System.out.println(diccionario.remove("Opel"));
        diccionario.clear();
        System.out.println(diccionario);
        // MANERA 1 DE RECORRER UN MAP
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Almeria");
        map.put(2, "Cadiz");
        map.put(3, "Huelva");
        for(HashMap.Entry<Integer,String> ciudades:map.entrySet()){
            int clave= ciudades.getKey();
            String valor = ciudades.getValue();
            System.out.println("clave: " + clave + "valor: " + valor);
        }
        // SEGUNDA FORMA DE RECORRER UN MAP (CONVERTIR UNA CLAVE EN UN SET PARA PODER USAR UN ITERATOR)
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int clave = it.next();
            String valor = map.get(clave);
            System.out.println("clave: " + clave + "valor: " + valor);
        }
        
        //TERCER METODO PARA RECORRER UN MAP(NO MUESTRA LAS CLAVES)
        for(String ciudad : map.values()){
            System.out.println("ciudad" + ciudad);
        }
        //CUARTO METODO PARA RECORRER UN MAP
        map.forEach((clave,valor) -> {
        System.out.println("clave " + clave + "valor " + valor); 
    });
        
        TreeMap <String,Integer> mapa = new TreeMap<>();
        mapa.put("Juan", 18);
        mapa.put("Elena", 20);
        mapa.put("Zarko", 50);
        mapa.put("Alvaro", 18);
        System.out.println(mapa);
        
        
        LinkedHashMap <String,Integer> mapa2 = new LinkedHashMap<>();
        mapa2.put("Juan", 18);
        mapa2.put("Elena", 20);
        mapa2.put("Zarko", 50);
        mapa2.put("Alvaro", 18);
        System.out.println(mapa2);
    }
    
}
