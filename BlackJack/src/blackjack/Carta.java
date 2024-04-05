/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author Luis
 */
public class Carta {
    // atributos
    private int numero;
    private String palo;
    private String letra;

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        switch(numero){
            
            case 1:
                letra="A";
                break;
            case 11:
                letra= "J";
                this.numero=10;
                break;
            case 12:
                letra="Q";
                this.numero=10;
                break;
                
            case 13:
                letra="K";
                this.numero=10;
                break;
            default:
             // letra ="" + numero;
                letra= String.valueOf(numero);
                
        }
    }

    @Override
    public String toString() {
        return    letra +" "+ palo+" ";
    }
    
    
}
