/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unoenclase;

/**
 *
 * @author Medac
 */
public class Carta implements Comparable<Carta> {
    private String nombre; 
   private int num;

    public Carta(String nombre, int num) {
        this.nombre = nombre;
        this.num = num;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
       
        return "Carta{" + "nombre=" + nombre + ", num=" + num + '}';
    }

    @Override
    public int compareTo(Carta o) {
        return (num-o.num);
        //si queremos ordenar por color es:
        //return color.CompareTO(c.color);
    }
   
    /*En el constructor si quiero darle valor a unas letras pongo en el constructor switch(numero)
    case 10;
    letra = j
    break;
    y asi con todas las cartas que su valor sea una letra o una palabra
    */
   
   
   
}
