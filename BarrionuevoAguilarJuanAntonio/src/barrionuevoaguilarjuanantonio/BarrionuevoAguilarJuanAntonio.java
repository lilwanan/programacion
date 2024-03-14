/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barrionuevoaguilarjuanantonio;


import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class BarrionuevoAguilarJuanAntonio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] laberinto = new char [10][10];
        int posxini,posyini,posfinx,posfiny,posactual;
        int turno=0;
        
        char jugador= 'o';
        boolean volver;
        char espacio=' ';
        boolean juego=false;
        
        
        rellenarTablero(laberinto);
        
        posxini=0;
        posyini=0;
        laberinto[0][0]=jugador;
        mostrarMatriz(laberinto);
        
        
        
        do{
            
            System.out.println("Indica hacia donde te quieres mover 1 der 2 izq 3 abajo 4 arriba");
            posactual=sc.nextInt();
            
            
            /*if(posactualx==1 && posactualy==0){
                laberinto[posxini][posyini++]='o';
            } else if(posactualx==0 && posactualy==1){
                laberinto[posxini++][posyini]='o';
            }
            mostrarMatriz(laberinto);
*/
            switch(posactual){
                case 1:
                    
                    if(laberinto[posxini][posyini+1]!='x'){
                        
                        laberinto[posxini][posyini+1]='o';
                        laberinto[posxini][posyini]=' ';
                        posyini++;
                        mostrarMatriz(laberinto);
                        if(posyini==9){
                            juego=true;
                        }
                    }
                    else{
                    turno++;
                    }
                    break;
                case 4:
                    if(posxini-1>=0 && posyini>=0){
                    if(laberinto[posxini-1][posyini]!='x'){
                        
                        laberinto[posxini-1][posyini]='o';
                        laberinto[posxini][posyini]=' ';
                        posxini--;
                        mostrarMatriz(laberinto);
                    }}
                            
                    else{
                    turno++;
                    }
                    break;
                case 2:
                    if (posxini >=0 && posyini-1>=0){
                    if(laberinto[posxini][posyini-1]!='x' ){
                        
                        laberinto[posxini][posyini-1]='o';
                        laberinto[posxini][posyini]=' ';
                        posyini--;
                        mostrarMatriz(laberinto);
                        
                    }} else {
                    turno++;
                    }
                    break;
                case 3: 
                    if(laberinto[posxini+1][posyini]!='x'){
                        
                        laberinto[posxini+1][posyini]='o';
                        laberinto[posxini][posyini]=' ';
                        posxini++;
                        mostrarMatriz(laberinto);
                        
                    } else {
                    turno++;
                    }
                    break;
                default:
                    turno++;
            }
            System.out.println("Llevas " + turno + " " + "Turnos");
            if(turno==3){
                System.out.println("Intentalo de nuevo");
            }
            
            
        }while(!(juego || turno>=3));
        
        
    }
    
    
    public static void mostrarMatriz(char [][] a){
    
    for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    
}
    
    public static void rellenarTablero(char [][]a){
        for(int i=0;i<1;i++){
            for(int j=0;j<5;j++){
                a[i][j]=' ';
            
                
            }
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<5;j++){
                a[i][j]='x';
            }
        }
        for(int i=4;i<a.length;i++){
            for(int j=5;j<6;j++){
                a[i][j]='x';
            }
        }
        for(int i=8;i<a.length;i++){
            for(int j=6;j<7;j++){
                a[i][j]='x';
            }
        }
        for(int i=0;i<3;i++){
            for(int j=6;j<7;j++){
                a[i][j]='x';
            }
        }
        for(int i=0;i<7;i++){
            for(int j=7;j<8;j++){
                a[i][j]='x';
            }
        }
        for(int i=0;i<9;i++){
            for(int j=8;j<9;j++){
                a[i][j]='x';
            }
        }
        for(int i=0;i<9;i++){
            for(int j=9;j<10;j++){
                a[i][j]='x';
            }
        }
        
    }
    
   
    
}
