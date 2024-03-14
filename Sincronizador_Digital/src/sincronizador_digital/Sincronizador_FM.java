/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sincronizador_digital;

/**
 *
 * @author medac
 */
public class Sincronizador_FM {
    
    // metodo subir 0,5 hz y bajar 0,5hz y otro q te muestre la frecuencia inicial 100mhz, metodo display muestra la frecuencia si se sobrepasa 80mhz o 108 mhz por arriba pasa al otro extremo
    double frecuencia;
    double frecuencia_min;
    double frecuencia_max;
    
    Sincronizador_FM (double frecuencia, double frecuencia_min, double frecuencia_max){
        this.frecuencia=frecuencia;
        this.frecuencia_min=frecuencia_min;
        this.frecuencia_max=frecuencia_max;
        
        frecuencia_min=80;
        frecuencia_max=108;
        
    }
    
    void subir(){
        
        this.frecuencia=0.5+this.frecuencia;
        if(frecuencia>frecuencia_max){
            this.frecuencia=frecuencia_min;
        } 
    }
    void bajar(){
        this.frecuencia=this.frecuencia-0.5;
        if (frecuencia<frecuencia_min){
            this.frecuencia=frecuencia_max;
        }
    }
    void display(double frecuencia){
        this.frecuencia=frecuencia;
    }
}