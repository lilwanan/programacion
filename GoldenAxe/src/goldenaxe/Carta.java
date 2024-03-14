/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author medac
 */
public class Carta {
    private String fraseCarta;
    private int vida;
    private int fuerza;
    
    
    public Carta(String fraseCarta,int vida,int fuerza){
        fraseCarta=this.fraseCarta;
        vida=this.vida;
        fuerza=this.fuerza;
    }

    public String getFraseCarta() {
        return fraseCarta;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFraseCarta(String fraseCarta) {
        this.fraseCarta = fraseCarta;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
}
