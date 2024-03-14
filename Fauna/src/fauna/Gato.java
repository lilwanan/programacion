/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fauna;

/**
 *
 * @author medac
 */
public class Gato extends Animal{
        public Gato(){
        int patas=4;
        nombre="no name";
    }
    @Override
    public void comer(){
        System.out.println("atun");
    }
    @Override
    public void dormir(){
        System.out.println("Hijos de puta(miau)");
    }
}
