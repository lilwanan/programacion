/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author medac
 */
public class Jugador {
    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;
    protected String nombre;
    protected Carta[]carta;

    public Jugador() {
        Carta [] carta = new Carta [5];
        carta[0] = new Carta("Obtienes un punto de vida",1,0);
        carta[1] = new Carta("Te quitan un punto de vida",-1,0);
        carta[2] = new Carta("Obtienes un punto de fuerza",0,1);
        carta[3] = new Carta("Te quitan un punto de fuerza",0,-1);
        carta[4] = new Carta("Obtienes dos puntos de vida", 2,0 );
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta[] getCarta() {
        return carta;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarta(Carta[] carta) {
        this.carta = carta;
    }
    

    
    
    
    
}
