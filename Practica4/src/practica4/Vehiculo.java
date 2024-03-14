/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author medac
 */
public abstract class Vehiculo {
    
protected String nombre;
protected int posx;
protected int posy;
protected Carta [] carta;
protected int size;


public Vehiculo(){
    carta = new Carta[50];
    size=0;
}

public void avanzar(int posx){
    posx =posx+1;
}

public void retroceder(int posx){
    posx =posx-1;
}



    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public Carta[] getCarta() {
        return carta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setCarta(Carta[] carta) {
        this.carta = carta;
    }

    public void robarCarta(Carta cartas){
        carta[size]=cartas;
        size++;
    }
    
}
