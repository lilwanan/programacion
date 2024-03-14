/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author medac
 */
public class Carta {
    private int avanzar;
    private int retroceder;
    
    
    public Carta(int avanzar, int retroceder){
        this.avanzar=avanzar;
        this.retroceder=retroceder;
    }

    public int getAvanzar() {
        return avanzar;
    }

    public int getRetroceder() {
        return retroceder;
    }

    public void setAvanzar(int avanzar) {
        this.avanzar = avanzar;
    }

    public void setRetroceder(int retroceder) {
        this.retroceder = retroceder;
    }
    
    
}
