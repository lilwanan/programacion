/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercadona;


import java.util.Scanner;
import java.io.*;
/**
 *
 * @author medac
 */
public class Mercadona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("mercadona.txt");
        File file2 = new File ("carrefour.txt");
        String nombre = " ";
        String precio = " ";
        int pr;
        FileReader fileReader ;
        FileReader fileReader2;
        Producto[] listabuff = new Producto[10];
        Producto[] listabuff2 = new Producto[10];
        int cont=0;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        try{
        
            fileReader = new FileReader(file);
            fileReader2 = new FileReader(file2);
            BufferedReader buffer = new BufferedReader(fileReader);
            BufferedReader buffer2 = new BufferedReader(fileReader2);
            nombre= buffer.readLine();
            nombre= buffer2.readLine();
            while(nombre!=null){
                
               precio =buffer.readLine();
               precio=buffer2.readLine();
               pr=Integer.parseInt(precio);
               listabuff[cont]=new Producto(nombre,pr);
               listabuff2[cont]=new Producto(nombre, pr);
               cont++;
               nombre = buffer.readLine();
                
            }
            System.out.println(precio);

        
        } catch(IOException e){
            System.out.println("error");
        }

        Supermercado mercado1 = new Supermercado("Mercadona",listabuff);
        Supermercado mercado2 = new Supermercado("Carrefour", listabuff2);
        
        System.out.println("Bienvenidos a la APP SuperComparator");
       
        System.out.println(mercado1);
        System.out.println(mercado2);
        
        do{
            System.out.println("MENU: 1. COMPARATOR DE PRODUCTOS 2. VER LA CESTA DE LA COMPRA 3.SALIR");
            int eleccion;
            eleccion= sc.nextInt();
            switch (eleccion){
                case 1:
                    comparar(mercado1,mercado2);
            }
            
            
            
        } while(salir==false);
    
        
    }
    
    public static void comparar (Supermercado m1 ,Supermercado m2){
        Scanner sc = new Scanner(System.in);
        Producto [] producto1 = m1.getLista();
        Producto [] producto2 = m2.getLista();
        String producto;
        producto = sc.nextLine();
        
        for(int i =0;i<producto1.length;i++){
            if(producto.equals(producto1[i].getNombre()) && producto.equals(producto2[i].getNombre())){
            if (producto1[i].getPrecio()<= producto2[i].getPrecio()){
                System.out.println("Precio Mercadona mejor" +producto1[i].getNombre());
            } else {
                System.out.println("Precio Carrefour mejor"+ producto2[i].getNombre());
            }
            }
        }
        

        

    }
    
}
