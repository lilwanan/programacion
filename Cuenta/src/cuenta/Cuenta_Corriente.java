/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author medac
 */
public class Cuenta_Corriente {
    Persona persona; // esto para meter los atributos de otra clase en esta
    private int saldo;
    private int limite;
    
    Cuenta_Corriente(Persona persona, int saldo, int limite){
        this.persona=persona;
        this.saldo=saldo;
        this.limite=limite;
    }
    void mostrar(){
        System.out.println(this.persona);
        System.out.println(this.saldo);
        System.out.println(this.limite);
    }
    
   /* 
    Cuenta_Corriente (String nombre, String dni, int saldo, int limite){
        this.nombre=nombre;
        this.dni=dni;
        this.saldo=saldo;
        this.limite=limite;
    }
    
    Cuenta_Corriente (String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        saldo=0;
        limite=-50;
    }
    public Cuenta_Corriente(int saldo){
        this.saldo=saldo;
    }
    
    void ingresar(int num){
        this.saldo=num+this.saldo;
        
    }
    void retirar(int num){
        if(this.saldo-num<limite){
            System.out.println("no se puede");
        } else {
            saldo = saldo -num;
        }
    }
    void mostrarinfo(){
        System.out.println(this.nombre);
        System.out.println(this.dni);
        System.out.println(this.saldo);
        System.out.println(this.limite);
    }
*/
}

//public es para hacer referencia a cualquier clase del paquete
// private solo hace llamadas a elementos de la misma clase
