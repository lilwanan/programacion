/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anillos;

/**
 *
 * @author medac
 */
public abstract class Jugador {
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    protected Carta [] cartas;
    protected int size;
    protected String nombre;

    public Jugador() {
        vivo=true;
        cartas=new Carta[100];
        size=0;
    }
    
    public void robarCarta(Carta carta){
        
        
        
            cartas[size]=carta;
            size++;
            
        
    }
    
    public void verCartas(){
        for(int i=0;i<cartas.length;i++){
            if(cartas[i]!=null){
            System.out.println(cartas[i] + " pos " + i);
            }
        }
    }
    
    public void usarCarta(int pos){
        vida = vida + cartas[pos].getVida();
        ataque = ataque + cartas[pos].getAtaque();
        cartas[pos]=null;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getSize() {
        return size;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}

