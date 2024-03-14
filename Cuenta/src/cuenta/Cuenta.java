/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author medac
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //cuenta corrient --> saldo, limite del descubierto , nombre dni ; crear cuenta con saldo 0 limite de -50, mostrar informacion
         /*Cuenta_Corriente cuenta1 = new Cuenta_Corriente("Wanan","777848483");
         
         cuenta1.ingresar(100);
         
         System.out.println(cuenta1.saldo);
         cuenta1.retirar(50);
         System.out.println(cuenta1.saldo);
         cuenta1.mostrarinfo();
         //cuenta con solo saldo y otra cuenta con todos los datos 
         Cuenta_Corriente cuenta2 = new Cuenta_Corriente(1000);
         cuenta2.nombre="noname";
         cuenta2.dni="nodni";
         Cuenta_Corriente cuenta3 = new Cuenta_Corriente("Dani","77773421",300,-50);
         cuenta2.mostrarinfo();
         cuenta3.mostrarinfo();*/
         Persona persona1 = new Persona("Antonio", 18,"7777777");
         Cuenta_Corriente cc1= new Cuenta_Corriente(persona1,5000,-50);
         cc1.mostrar();
    }
    
}
