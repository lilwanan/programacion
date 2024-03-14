/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro2;

/**
 *
 * @author medac
 */
public class Inventario {
    private String nombre;
    private int precio;
    private int cantidad;
    private String [] Inventario;
    
    
    public Inventario(String nombre,int precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
    @Override
    
    public String toString(){
        return "Item: " + this.nombre + " " + this.precio + " " + this.cantidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String[] getInventario() {
        return Inventario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setInventario(String[] Inventario) {
        this.Inventario = Inventario;
    }
    
    
}
