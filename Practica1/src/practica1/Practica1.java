/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Barrionuevo Aguilar
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1
       
        Scanner scanner = new Scanner(System.in);
        char inicial;
        int edad;
        System.out.println("Introduce la Inicial del nombre");
        inicial=scanner.next().charAt(0);
        System.out.println("Introduce la Edad");
        edad=scanner.nextInt();
        if(edad>=65) {
            int diferencia_edad;                    //EN ESTE BUCLE IF ME ENCARGO PRINCIPALMENTE DE CALCULAR LA DIFERENCIA 
            diferencia_edad= edad - 65;             // ENTRE LA EDAD Y EL AÑO DE JUBILACION PARA SABER CUANTO LLEVA JUBILADO
            System.out.println("Esta persona esta jubilada desde hace: " + diferencia_edad + " años ");
        } else {
            System.out.println("Esta persona tiene: " + edad + " años ");
        }
       
        //EJERCICIO 2
        
        Scanner scann = new Scanner(System.in);
        int cantidad_euros;
        double dolares_americanos ;
        System.out.println("Introduce Cantidad de Euros: ");
        cantidad_euros= scann.nextInt();
        System.out.println("Introduce valor actual del Dolar: ");
        dolares_americanos = scann.nextDouble();                           //HE INTRODUCIDO POR PANTALLA EL VALOR ACTUAL DEL DOLAR Y LA CANTIDAD DE EUROS DE LA QUE QUEREMOS HACER CONVERSION
        double conversion= cantidad_euros*dolares_americanos;           //LUEGO HE HECHO UNA MULTIPLICACION DE EUROS POR EL VALOR QUE TENGA EL DOLLAR EN ESE MOMENTO
        System.out.println("El valor en dollar es: " + conversion);     // COMO DE INT SE PUEDE PASAR A DOUBLE SIN CASTING SIMPLEMENTE SERIA SACAR POR PANTALLA EL VALOR EN DOLAR 
        
     
        //EJERCICIO 3
    /*
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Introduce el valor inicial de la cadena");
        num = scan.nextInt(); 
        int resultado=1;// NUM HACE REFERENCIA AL VALOR INICIAL DE LA SECUENCIA DE NUMEROS
        //int multiplo=1;
        //while(num*multiplo<=99){
            //System.out.println("La sucesion de numeros seria: " + (num*multiplo));
            //multiplo++;
        for(int multiplo=0;num*multiplo<100;multiplo++){
            System.out.println(num*multiplo);
            resultado=resultado+(num*multiplo);
            System.out.println("La suma es: " + resultado);
            
            
            }
        
        */
           

        //Ejercicio 4
        /*
        Scanner sca = new Scanner(System.in);
        int suspensos,aprobados,notables,sobresaliente,notas_totales;
        notas_totales=0;
        suspensos=0;
        while(notas_totales<11){
            notas_totales=sca.nextInt();
            switch(notas_totales) {
                case 0,1,2,3,4:
                suspensos++;
                break;
                //seguir hasta cubrir todas las opciones
            }
        }
           
        */
                
        
    
    
    //EJERCICIO 5
 /*   
    Scanner sc = new Scanner(System.in);
    char inicial_producto;
    int precio;
    
    char continuar;
        System.out.println("Bienvenidos a Supermecado Medac ");
        System.out.println("Introduce inicial del producto: ");
        inicial_producto=sc.next().charAt(0);
        System.out.println("Introduce su respectivo precio: ");
        precio = sc.nextInt();
        System.out.println("¿Quiere seguir introduciendo productos? (s/n)");
        continuar = sc.next().charAt(0);
        
        
        while(continuar=='s'){
        if (continuar == 's') {
            System.out.println("Introduce otro producto: ");
            inicial_producto=sc.next().charAt(0);
            System.out.println("Introduce su valor");
            precio=sc.nextInt();
            System.out.println("¿Quiere seguir introduciendo productos? (s/n)");
            continuar = sc.next().charAt(0);
            
        } else if (continuar == 'n') {
            System.out.println("Adios");
        } else {
            System.out.println("¿Quiere seguir introduciendo productos? (s/n)");
            continuar = sc.next().charAt(0);
            
        }
        
        }
        
        System.out.println("El precio total es: " + precio);
        
       */
 
       Scanner sc = new Scanner (System.in);
       char continuar;
       char letra;
       int precio;
       int total;
       System.out.println("letra");
       letra=sc.next().charAt(0);
        System.out.println("precio");
        precio=sc.nextInt();
        total=precio;
        System.out.println("continuar?");
        continuar=sc.next().charAt(0);
        while(continuar!='n'){
            switch(continuar){
                case 's', 'S':
                    System.out.println("letra");
                    letra=sc.next().charAt(0);
                    System.out.println("precio");
                    precio=sc.nextInt();
                    total=precio+precio;
                    System.out.println("continuar?");
                    continuar=sc.next().charAt(0);
                    break;
                case 'n','N':
                    continuar='n';
                    break;
                default:
                    System.out.println("continuar?");
                    continuar= sc.next().charAt(0);
                    break;
            }
        }
        System.out.println("" + total);
    }
    
}
