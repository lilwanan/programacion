/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacrocoche;

import java.util.LinkedList;

/**
 *
 * @author medac
 */
public class Jugador {
    LinkedList<Carta> cartas;
    int kmTotales=0;

    public Jugador(LinkedList<Carta> cartas) {
        this.cartas = cartas;
        
    }

    public LinkedList<Carta> getCartas() {
        return cartas;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setCartas(LinkedList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
