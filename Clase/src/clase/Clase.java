/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;


import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Clase {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int resp;
        Persona [] alumnos = new Persona[100];
        int pos=0;
        do{
            System.out.println("1. Insertar Alumno.....6.Salir"); 
            resp=sc.nextInt();
            switch(resp){
                case 1:
                    System.out.println("1. Alumno 2.Alumna");
                    int res = sc.nextInt();
                    if(res==1){ // alumno
                        alumnos[pos]=new Alumno(sc.next());
                        alumnos[pos].insertarNotas();
                        alumnos[pos].estaAprobado();
                    } else { //alumna
                        alumnos[pos] = new Alumna(sc.next());
                        alumnos[pos].insertarNotas();
                        alumnos[pos].estaAprobado();
                    }
                    pos++;
                    break;
                case 2:
                    for(int i =0;i<alumnos.length;i++){
                        if(alumnos[i] instanceof Alumno){
                            System.out.println(alumnos[i]);
                        }
                    }
                    break;
                case 3: // igual que con alumno 
                    break;
                case 4:
                    System.out.println("1. Alumnos 2. Alumnas");
                    int respuesta=sc.nextInt();
                    
                    for (int i =0;i<pos;i++){
                        
                        if(respuesta==1){
                            if (alumnos[i] instanceof Alumno && alumnos[i].isSuspenso()){
                                System.out.println(alumnos[i]);
                            }
                        } else{
                            if (alumnos[i] instanceof Alumna && alumnos[i].isSuspenso()){
                                System.out.println(alumnos[i]);
                            }
                        }
                    }
                    break;
                case 5:
                    int contmasc=0;
                    int contfem=0;
                    for (int i=0;i<pos;i++){
                        if(alumnos[i].isSuspenso() && alumnos[i] instanceof Alumno){
                            contmasc++;
                        }
                        else if(alumnos[i].isSuspenso() && alumnos[i] instanceof Alumna) {
                            contfem++;
                        }
                    }
                    System.out.println("Alumnos chicos " + contmasc/pos + " Alumnos chicas " + contfem/pos);
                    break;
                case 6:
                    break;
            }
        } while (resp!=6); 
    }
    
}
