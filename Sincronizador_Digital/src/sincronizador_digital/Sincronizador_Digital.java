/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sincronizador_digital;

/**
 *
 * @author medac
 */
public class Sincronizador_Digital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sincronizador_FM sc = new Sincronizador_FM(80.0,80.0,108.0);
        sc.subir();
        System.out.println(sc.frecuencia);
        sc.bajar();
        sc.bajar();
        System.out.println(sc.frecuencia);
    }
    
}
