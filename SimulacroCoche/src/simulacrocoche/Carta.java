/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrocoche;

/**
 *
 * @author medac
 */
public class Carta {
    private String nombre;
    private int distancia;
    boolean ataque;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public Carta(String nombre, int distancia, boolean ataque) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.ataque = ataque;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
