/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteljogo;

/**
 *
 * @author medac
 */
public abstract class Hotel {
    protected String nombre_hotel;
    protected int precio_compra;
    protected boolean estado;
    
    public Hotel(){
       
    }

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
