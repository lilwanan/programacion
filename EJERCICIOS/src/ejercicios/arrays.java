/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.awt.Point;
/**
 *
 * @author medac
 */
public class arrays {
    
    public static void main (String[]args){
        
        //distintos metodos para crear arrays 
        //int [] array= {5,3,2,1,7};
        //System.out.println(array[0]);
        //int[] array= new int [3];
        //System.out.println(array[0]);
        
        //para cambiar el valor de la posicion
        /*
        array[0]=2;
        array[1]=3;
        System.out.println(array[0]+";"+array[1]+";"+array[2]);

        
        //Array que el usuario escribe 4 numeros
        Scanner sc = new Scanner(System.in);
        int [] array = new int [4];
        for(int i=0;i<4;i++){
            array[i] = sc.nextInt();
        }
        // dos maneras diferentes de mostrar un array por pantalla una con bucle for y otra sin bucle
        for(int i=0;i<4;i++){
            System.out.print(array[i] + ":---");
        }
        System.out.println(array[0]+";"+array[1]+";"+array[2]+";"+array[3]);

 */   
        /*
        //array tamaño 7 el usuario pone los valores; el resultado de la suma de los valores del array
        Scanner sc = new Scanner(System.in);
        int [] array = new int [7];
        for(int i = 0;i<7;i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println(sumaArray(array));

        for (int i=0;i<7;i++){
            suma= array[i]+suma;
        }
        System.out.println(suma);

        
        //array que el usuario introduzca el tam´ño del array, el usuario introduce los valores del tamaño, se muestra y a la inversa
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantas posiciones tiene el array");
        int [] array= new int[sc.nextInt()];
        
        for(int i =0;i<array.length;i++){
            System.out.println("Introduce valores del array");
            array[i]=sc.nextInt();
          }
        for(int i =0;i<array.length;i++){
        System.out.print(array[i]);
        
        }
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]);
        }

        
        int []a = {3,2,7};
        int []b = new int [3];
        b=a;
        System.out.println(b[0]);
        a[0]=5;
        System.out.println(b[0]);

        //generar un array de tamaño 3 random de numeros y introducir 3 numeros por consola y chequear si es la combinacion
        // si no son pedir otra vez numeros, si pone num negativo se sale
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        int [] array = new int [3];
        for(int i =0; i<3; i++){
            array[i]= (int) (Math.random()*10 +1);
            
        }
        System.out.println(Arrays.toString(array));
        int []array2= new int[3];
        for(int i=0;i<3;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        boolean respuesta;
        if(respuesta=true){
            System.out.println("Correcto");
        }
        while(!(Arrays.equals(array,array2))){
        if(Arrays.equals(array,array2)) {
                respuesta=true;
                System.out.println("Correcto");
            } else {
                respuesta=false;
                System.out.println("Introduce otra vez");
                for(int i=0;i<3;i++){
                    array2[i]=sc.nextInt();
                    
        }
                
            }
        }  

        char a []= new char[5];
        Arrays.fill(a,'_');
        System.out.println(Arrays.toString(a));


        //creo un array fijo y luego uno segundo introduce tamaño y numeros tamaño minimo 3, los compara y ver si los valores del segunda estan en el uno
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce array 1");
        int[] array1 = {1,2,3};
        
        System.out.println(array1.toString());
        System.out.println("Introduce dimensiones del Array 2");
        int [] array2 = new int [sc.nextInt()];
        System.out.println("Introduce elementos del array");
        for(int i=0; i<array2.length; i++){
            array2[i]=sc.nextInt();
        }
        System.out.println(comparar(array1,array2));
        
        // para un equals y comparar se usa Arrays.equals(a,0,2,b,0,2) compara dos arrays hasta cuando quieras
        
        
        
        Scanner sc = new Scanner(System.in);
        int intentos;
        int fallos=0;
        char letra;
        boolean aux;
        System.out.println("Indica intentos");
        intentos= sc.nextInt();
        System.out.println("Introduce dimensión Array con palabras");
        char [] array1 = new char [sc.nextInt()];
        System.out.println("Introduce las letras");
        for(int i =0;i<array1.length;i++){
            array1[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(array1));
        char [] array2 = new char [array1.length];
        Arrays.fill(array2,'_');
        System.out.println(Arrays.toString(array2));
        do{
        aux=false;
        System.out.println("Introduce una letra");
        letra = sc.next().charAt(0);
        for(int i=0;i<array1.length;i++){
            if(letra==array1[i]){
                
                array2[i]=letra;
                aux = true;
                
            
            }
            
        }
      
        
            if(!aux && intentos!=0){
                System.out.println("Letra incorrecta");
                intentos--;
                System.out.println("Intentos restantes: "+ intentos);
            } 
            else{
                 System.out.println(Arrays.toString(array2));
            }
        
        }      
        while(!Arrays.equals(array1, array2) || intentos==0);
        
        
        // array fijo creo un array nuevo y despues lo igualas, cuando eso metes un numero y empujas
        
        Scanner sc = new Scanner(System.in);
        int array1[] = {3,2,4,7};
        int array2[] = new int [5];
        for (int i=0;i<array1.length;i++){
            array2[i]=array1[i];
            System.out.println(Arrays.toString(array2));
           
        }
        System.out.println("Introduce numero");
        for (int j=0;j<1;j++){
            array2[2]=sc.nextInt();
            array2[3]=array1[2];
            array2[4]=array1[3];
            
            
            System.out.println(Arrays.toString(array2));
         
        
        
                    
        }
        b=Arrays.copyof(a,5) para copiar el array origen en uno nuevo
        Arrays.sort(b) para ordenar un array
       
        //arrays dimensionales
        
        int[][] matriz = new int [3][3]; // filas y columnas de una matriz
        for (int i =0; i<matriz.length;i++){
            for (int j =0;j<matriz[0].length;j++){ // desde j se tiene que mirar la posición 0 
                matriz[i][j]=3;
            }
        }
        for(int filas=0;filas<matriz.length;filas++){
            System.out.println(Arrays.toString(matriz[filas]));
        }
   
        
        int [][] matriz= {{2,3},{4,7},{5,5}};
        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
            
        }
        mostrarArray(matriz);
       
        
        char [][] matriz = new char [3][4];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='x';
                
                
        }
        }
        for(int filas=0;filas<matriz.length;filas++){
            System.out.println(Arrays.toString(matriz[filas]));
        
        
        
        }
*/    
        
        
        //hundir la flota
        /*
        char [][] matriz = new char [10][10];
        boolean aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]='A';
                
                
        }
        }
        
        for(int filas=0;filas<matriz.length;filas++){
            System.out.println(Arrays.toString(matriz[filas]));
            
        }
   
        do{
        aux=true;
        int posx= (int)(Math.random()*10);
        int posy= (int)(Math.random()*10);
        System.out.println("Coordenadas " + ("("+ posx + "," + posy + ")"));
        if(posy+5<10){
            System.out.println("Vale");
            for(int i=0;i<5;i++){
                matriz[posx][posy+i]='B';
                for(int filas=0;filas<matriz.length;filas++){
                System.out.println(Arrays.toString(matriz[filas]));
                }
            }
        } else {
            System.out.println("no vale");
            aux = false;
            
        } 
        } while(!aux);
        
       
        Scanner sc = new Scanner(System.in);
        
        int cordx,cordy;
        int coordenada;
        int contB1=5, contB2=3, contB3=1;
        System.out.println("Vamos a jugar a un juego: ");
        System.out.println("Abre tu juego de mesa");
        char[][] tablero = new char[10][10];
        char[][] copiaTablero= new char[10][10];
        rellenarTablero(tablero);
        rellenarTablero(copiaTablero);
        mostrarMatriz(tablero);
        System.out.println("Coloca tus barcos");
        
        introducirBarco(tablero,5,'B');
        introducirBarco(tablero,3,'C');
        introducirBarco(tablero,1,'D');
        mostrarMatriz(tablero);
        
        System.out.println("Empezamos el juego");
        do{
        mostrarMatriz(copiaTablero);
        System.out.println("Introduce coordenada X ");
        cordx = sc.nextInt();
        System.out.println("Introduce coordenada Y");
        cordy = sc.nextInt();
        
        
        char letra=tablero[cordx-1][cordy-1];
            switch(letra){
            case 'A':
                System.out.println("Agua");
                break;
            case'B':
                contB1--;
                tablero[cordx][cordy]='T';
                copiaTablero[cordx][cordy]='T';
                if(contB1==0){
                    System.out.println("Hundido");
                }
                break;
            case'C':
                contB2--;
                tablero[cordx][cordy]='T';
                copiaTablero[cordx][cordy]='T';
                if(contB2==0){
                    System.out.println("Hundido");
                }
                break;
            case'D':
                contB3--;
                tablero[cordx][cordy]='T';
                copiaTablero[cordx][cordy]='T';
                if(contB3==0){
                    System.out.println("Hundido");
                }
                break;
        }
        }
        while(!(contB1==0 && contB2==0 && contB3==0));
     
        Scanner sc = new Scanner(System.in);
        
        char [][] array1 = new char [3][3];
        char [][] copiaarray1= new char [3][3];
        int mina;
        int cordx,cordy;
        int posx,posy;
        //mina=sc.nextInt();
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                array1[i][j]='*';
                
                
        }
            
        
        }
        
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                copiaarray1[i][j]='*';
                
            }
        }
        mostrarMatriz(array1);
        cordx = (int) (Math.random()*3);
        cordy = (int) (Math.random()*3);
        System.out.println(cordx);
        System.out.println(cordy);
        array1[cordx][cordy]='m';
        mostrarMatriz(array1);
        
        //empieza el juego
        
        System.out.println("Comenzamos el juego, la mina ha sido asignada a una posición aleatoia");
        mostrarMatriz(copiaarray1);
        do{
        
            System.out.println("Introduce una coordenada x y una coordenada y");
            posx= sc.nextInt();
            posy= sc.nextInt();
            if(posx==cordx && posy==cordy){
                System.out.println("Boom");
            } else if(posx>2 && posy>2){
                System.out.println("Introduce otro numero, coordenada incorrecta");
                
            } else {
                System.out.println("Introduce otra coordenada");
            }
            copiaarray1[posx][posy]='C';
            mostrarMatriz(copiaarray1);
            
    }
    while((posx!=cordx && posy!=cordy));
        
        
    }  
    
    public static int sumaArray(int [] suma){
        int result=0;
        for(int i=0;i<7;i++){
            result= suma[i]+result;
        }
        return result;
    */
        
        //string
        
        int [] coches = new int [5];
        coches[0]= 5;
        System.out.println(coches[1]);
              
        
        
}
    
    public static boolean comparar(int [] array,int array1[]){
        
        boolean aux = true;
        
        /*if(array[0]==array1[0] && array[1]==array1[1] && array[2]==array1[2]){
            return true;
        } else {
            return false;
        }
        
*/
        
        for(int i =0;i<array.length;i++){
            
            if(array[i]!=array1[i]){
                aux= false;
            } 
            
        }
        return aux;
    }
    
    public static void mostrarArray(int [][] a){
    
    for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    
}
    
    public static void mostrarMatriz(char [][] a){
    
    for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    
}
    
    
    
    public static void rellenarTablero(char [][]a){
        for(int fila = 0;fila<a.length;fila++){
            Arrays.fill(a[fila],'A' );
        }
    }
    
    public static void introducirBarco(char[][] m, int tam, char letra){
        boolean condicion;
        int posx, posy;
        do{
        condicion=false;
        posx= (int) (Math.random()*10);
        posy= (int) (Math.random()*10);
        if(posy + tam<m[0].length){ // m[0].length te da el tamaño de las columnas y si [0] te indica filas
            condicion= true;
            //comprobar que no hay otro barco
            for(int i =0;i<tam;i++){
                if(m [posx][posy+i]!='A'){
                    System.out.println("Ya hay otro barco");
                    condicion=false;
                }
            }
            if (condicion){
                for(int i =0;i<tam;i++){
                    m[posx][posy+i]=letra;
                }
            }
        }
        }
        while(!condicion);
    }
        
}
