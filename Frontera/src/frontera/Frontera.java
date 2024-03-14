/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frontera;


import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Frontera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,dni;
        boolean salir=true;
        Scanner sc = new Scanner(System.in);
        //Person p1= new Person("Ana","777776");
        //Person p2= new Person("Paco","777777");
        //Person p3= new Person("Luis","777778");
        //Person p4= new Person("Dani","777779");
        //Person [] p = {p1,p2,p3,p4};
        int i =0;
        Person[]arrayPersonas= new Person[100];
        do {
            System.out.println("Bienvenido: 1.crear 2.mostrar todos 3. buscar nombre 4.buscar dni 5,salir");
            int opcion= sc.nextInt();
            switch(opcion){
                case 1:
                    Person p= new Person();
                    arrayPersonas[i] = p;
                    i++;
                    break;
                case 2:
                    for (int recorrer=0;recorrer<i;recorrer++){
                        System.out.println(arrayPersonas[recorrer]);
                    }
                    break;
                case 4:
                    System.out.println("Dime dni");
                    dni=sc.next();
                    for(int recorrer=0;recorrer<i;recorrer++){
                        if(dni.equals(arrayPersonas[recorrer].getDni())){
                            System.out.println("La persona con DNI" + " "+ dni + " es " + arrayPersonas[recorrer]);
                        }
                    }
                    break;
                case 3:
                     System.out.println("Dime nombre");
                     nombre=sc.next();
                    for(int recorrer=0;recorrer<i;recorrer++){
                        if(nombre.equals(arrayPersonas[recorrer].getNombre())){
                            System.out.println("La persona con nombre" + " "+ nombre + " es " + arrayPersonas[recorrer]);
                        }
                    }
                    break;
                default:
                    salir=false;
                    break;
            }
            
        } while(salir==true);
        
        
    }
    
}
