/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author medac
 */
public class Coche extends Vehiculo {
    public Coche(){
        super();
        nombre="Coche";
        int posx = 0;
        int posy = 0;
    }
    @Override
    public void avanzar(int posx){
    posy =posy+3;
}

public void retroceder(int posx){
    posy =posy-3;
}
}
