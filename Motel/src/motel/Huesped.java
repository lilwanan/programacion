/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author medac
 */
public class Huesped {
    
    //1 inserta huesped 2. nº habitaciones libres 3. calcula precio por nombre del huesped 4. elimina huesped por nombre 
    // 5. busca huesped por nombre 6. buscar huesped por nº habitacion 7 salir
    private String nombre;
    private int num_noches;
    
    Huesped (String nombre, int num_noches){
        this.nombre=nombre;
        this.num_noches=num_noches;
        int precio =num_noches*50;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNoches(){
        return this.num_noches;
    }
    public void setNoches(int num_noches){
        this.num_noches=num_noches;
    }
    public void precio (){
        int dinero=50;
        
        int precio_total= this.num_noches * dinero;
        System.out.println(precio_total);
    }
}
