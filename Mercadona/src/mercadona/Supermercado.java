/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadona;

import java.util.Arrays;

/**
 *
 * @author medac
 */
public class Supermercado {
    private String nombre;  
    private Producto[] lista;
    
    
    public Supermercado(String nombre, Producto[] lista){
        this.nombre = nombre;
        this.lista=lista;
        
    }

    public String getNombre() {
        return nombre;
    }

    public Producto[] getLista() {
        return lista;
    }
    
    
    
    
    @Override
    public String toString(){
        return nombre +" "+ Arrays.toString(lista);
        
}
}
