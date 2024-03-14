/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class EJERCICIOS {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    
    
    public static void main(String[] args) {
        // Escribir una aplicacion que pida el año actual y el de nacimiento del usuario, debe calcular su edad suponiendo que el año en curso ya ha cumplido años
        /*int fecha_nacimiento = 2001;
        int año_actual=2023;
        int edad = año_actual - fecha_nacimiento;
        System.out.println("La edad del usuario es : " + edad); 
        
        // ejercicio edad introduciendo por teclado con Scanner
        
        Scanner sc = new Scanner(System.in);
        int fecha_nacimiento;
        int año_actual;
        System.out.println("Introduce fecha nacimiento: ");
        fecha_nacimiento = sc.nextInt();
        System.out.println("Introduce año actual: ");
        año_actual = sc.nextInt();
        int edad = año_actual - fecha_nacimiento;
        System.out.println("Mi edad es: " + edad); 
        
        //EJERCICIO 2 
        
        // REDONDEAR UN NUMERO REAL
        
        Scanner sc = new Scanner(System.in);
        double real;
        System.out.println("Introduce un numero real: ");
        real = sc.nextDouble();
        real = real + 0.5;
        int aprox = (int) real;
        System.out.println("El Numero aproximado es: " + aprox); 
        
        //alternativa
        
        Scanner sc = new Scanner(System.in);
        double real;
        System.out.println("Introduce un numero real: ");
        real = sc.nextDouble();
        System.out.println("El numero aproximado es: " + Math.round(real)); 
        
        //EJERCICIO 3
        //SE QUIERE EL RADIO POR USUARIO, AREA, LONGITUD
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Introduce radio: ");
        radio=sc.nextDouble();
        //area
        double area;
        area = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area es: " + Math.round(area));
        //longitud
        double longitud;
        longitud= 2*Math.PI*radio;
        System.out.println("La longitud es: " + Math.round(longitud)); 
        
        
        //EJERCICIO 4        
        //QUEREMOS LOS SEGUNDOS POR USUARIO, CONVERSION A HORAS
        
        Scanner sc = new Scanner (System.in);
        double segundos;
        System.out.println("Introduce segundos: ");
        segundos= sc.nextInt();
        //conversion a minutos
        double minutos=0;
        minutos= segundos/60;
        minutos=(int) minutos;
        //conversion a horas
        double horas=0;
        horas=segundos/3600;
        horas=(int) horas;
        double hora_total=horas%minutos%segundos;
        double minutos_total=minutos%60;
        double segundos_totales= segundos%60;
        
        System.out.println("La hora completa es: " + hora_total+ "horas " + minutos_total + "minutos "+ segundos_totales + "Segundos");
        
        //dos enteros y ver si son iguales si no lo son los ordenos
        
        Scanner sc = new Scanner (System.in);
        int entero1;
        int entero2;
        System.out.println("Introduce primer entero");
        entero1=sc.nextInt();
        System.out.println("Introduce segundo entero");
        entero2=sc.nextInt();
        
         if(entero1==entero2) {
            System.out.println("Son iguales");
        } else {
            if(entero1>entero2) {
                System.out.println("Ordenados son: " + entero1 +" "+ entero2);
            } else {
                System.out.println("Ordenados son: " + entero2 +" "+ entero1);
                
        }
        
        }
        
        //ordenar 3 numeros de mayor a menor
        
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        System.out.println("Introduce primer numero: ");
        numero1= sc.nextInt();
        System.out.println("Introduce segundo numero");
        numero2= sc.nextInt();
        System.out.println("Introduce tercer numero");
        numero3= sc.nextInt();
        
        if(numero1 > numero2 && numero2 > numero3) {
            System.out.println("Ordenados son"+ numero1 + numero2 + numero3);
        } else if(numero2>numero1 && numero1>numero3){
            System.out.println("Ordenados : " + numero2+ numero1 + numero3);
        } else if (numero3>numero2 && numero2>numero1) {
            System.out.println("Ordenados: " + numero3 + numero2 + numero1);
        } else if (numero1>numero2 && numero3>numero2){
            System.out.println("Ordenados: " +numero1+numero3+numero2);
        } else if (numero2>numero1&& numero3>numero1) {
            System.out.println("Ordenados: " + numero2 + numero3+ numero1);
        } else if (numero3>numero2 && numero1>numero2) {
            System.out.println("Ordenados: " + numero3 + numero1 + numero2);
        } 
        
        //ax2 bx c = 0 hacer la raiz 
        
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.println("Introduce a: ");
        a=sc.nextDouble();
        System.out.println("Introduce b: ");
        b=sc.nextDouble();
        System.out.println("Introduce c ");
        c=sc.nextDouble();
        
        double auxiliar=b*b-4*a*c; // no separar con parentesis tontamente
        x1=(-b+(Math.sqrt(auxiliar)))/(2*a); // al dividir entre dos numeros o mas siempre rodear entre parentesis porque sino coge el primer numero
        x2=(-b-(Math.sqrt(auxiliar)))/(2*a);
        
        if(auxiliar<0 || a==0) {
            System.out.println("No tiene solucion");
        } else {
            System.out.println("La primera solucion es" + x1 +"La segunda solucion es" + x2);
        }
        
        
        Scanner sc = new Scanner (System.in);
        int jugar;
        boolean bigote;
        boolean gafas;
        boolean gorro;
        boolean barba;
        boolean perilla;
        boolean pelo;
        System.out.println("Quieres jugar al quien es quien: ");
        jugar = sc.nextInt();
        if(jugar==1){
            System.out.println("Empieza el juego");
            System.out.println("Primera pregunta:...");
            System.out.println("Tiene bigote ? " );
            bigote = sc.nextBoolean();
            System.out.println("Tiene gafas ? ");
            gafas = sc.nextBoolean();
            System.out.println("Tiene gorro ? ");
            gorro = sc.nextBoolean();
            System.out.println("Tiene barba ? ");
            barba = sc.nextBoolean();
            System.out.println("Tiene perilla ? ");
            perilla = sc.nextBoolean();
            System.out.println("Tiene pelo ? ");
            pelo = sc.nextBoolean();
            
            if(gafas==true && bigote==false && gorro==false && barba==false && perilla==false && pelo==false) {
                System.out.println("Es Lupas: ");
            } else if (pelo==true && gorro==false && bigote==false && barba==false && perilla==false && pelo==false){
                System.out.println("Es Monico; ");
            } else if(bigote==true && barba==false && gafas==false && gorro==false && perilla==false && pelo==false) {
                System.out.println("Es Nike: ");
            } else if (pelo==true && gorro == true && gafas==false && bigote==false && barba==false && perilla==false) {
                System.out.println("Es Kiko: ");
            } else if (bigote == true && barba==true && gafas==false && gorro==false && perilla==false && pelo==false) {
                System.out.println("Es Medinilla: ");
            } else if (gorro==true && perilla==true && gafas==false && bigote==false && barba==false && pelo==false) {
                System.out.println("Es Alejandro: ");
            }
                    
                    
        } else if(jugar==2){
            System.out.println("Salir del juego");
        } 
        //mete un numero del 0 al 10
        
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Introduce una Nota: ");
        nota = sc.nextInt();
        switch(nota){
            case 0,1,2,3,4:
                System.out.println("La nota seria insuficiente: ");
                break;
            case 5:
                System.out.println("La nota seria Aprobada ");
                break;
            case 6:
                System.out.println("La nota seria bien ");
                break;
            case 7,8:
                System.out.println("La nota seria notable");
                break;
            case 9,10:
                System.out.println("La nota seria sobresaliente");
                break;
            default:
                System.out.println("Numero incorrecto");
        }
        
        if(nota==0 || nota==1 || nota==2 || nota==3 || nota==4) {
            System.out.println("Suspenso");
        } else if (nota==5) {
            System.out.println("Aprobado");
        } else if (nota==6) {
            System.out.println("Bien");
        } else if (nota==7 || nota==8) {
            System.out.println("Notable");
        } else if (nota==9 || nota==10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Ha introducido un numero incorrecto");
        }


        // lunes martes miercoles jueves viernes sabado y domingo introduce un numero asignado a cada dia 
        
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        numero=sc.nextInt();
        switch(numero){
            case(1):
                System.out.println("Lunes");
                break;
            case(2):
                System.out.println("Martes");
                break;
            case(3):
                System.out.println("Miercoles");
                break;
            case(4):
                System.out.println("Jueves");
                break;
            case(5):
                System.out.println("Viernes");
                break;
            case(6):
                System.out.println("Sabado");
                break;
            case(7):
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No ha introducido bien el numero");

                
        } 
        
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Introduce una Nota: ");
        nota = sc.nextInt();
        switch(nota){
            case 0,1,2,3,4:
                System.out.println("La nota seria insuficiente: ");
                break;
            case 5:
                System.out.println("La nota seria Aprobada ");
                break;
            case 6:
                System.out.println("La nota seria bien ");
                break;
            case 7,8:
                System.out.println("La nota seria notable");
                break;
            case 9,10:
                System.out.println("La nota seria sobresaliente");
                break;
            default:
                System.out.println("Numero incorrecto");
        } 
        
         Scanner sc = new Scanner(System.in);
        char semana;
        System.out.println("Introduce un caracter");
        semana=sc.next().charAt(0);
        switch(semana){
            case('l'):
                System.out.println("Lunes");
                break;
            case('m'):
                System.out.println("Martes");
                break;
            case('x'):
                System.out.println("Miercoles");
                break;
            case('j'):
                System.out.println("Jueves");
                break;
            case('v'):
                System.out.println("Viernes");
                break;
            case('s'):
                System.out.println("Sabado");
                break;
            case('d'):
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No ha introducido bien el caracter");

             
        } 
           
        
        //bucle While
        
        //Introduce un numero por teclado y decir si es par o impar
        Scanner sc = new Scanner(System.in);
        double num = Math.random();
        System.out.println("Introduce numero");
        //num = sc.nextInt();
        while(num!=0) {
           num=sc.nextDouble();
           if(num%2==0 && num!=0) {
               System.out.println("Par");
           } else if(num!=0) {
               System.out.println("Impar");
           }
            System.out.println("Introduce otro numero");
        } 
        
        // numero secreto, acertar un numero desconocido
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero_introducido;
        numero = (int) (Math.random()*100+1);
        System.out.println("Numero random " + numero);
        System.out.println("Introduce el primer numero");
        numero_introducido=sc.nextInt();
        
        while(numero!=numero_introducido && numero_introducido!=-1) {
            
            
            if(numero_introducido<numero) {
                System.out.println("Mayor");
            } else if(numero_introducido>numero) {
                System.out.println("Menor");
            } else if(numero_introducido==numero) {
                System.out.println("Acertaste wey");
            }
            System.out.println("Introduce un numero: ");
            numero_introducido=sc.nextInt();
            
            
        }
        
        
        //min_rango max_rango valor minimo del rango valor maximo del rango introduce otro numero y decir si esta en el rango
        Scanner sc = new Scanner(System.in);
        int min_rango;
        int max_rango;
        int numero_introducido;
        System.out.println("Introduce Minimo rango");
        min_rango=sc.nextInt();
        System.out.println("Introduce Maximo rango");
        max_rango=sc.nextInt();
        System.out.println("El rango es de: " + min_rango + " a " + max_rango);
        do{
            System.out.println("Introduce un numero por pantalla: ");
            
            numero_introducido=sc.nextInt();
            if(numero_introducido<min_rango) {
                System.out.println("Numero Incorrecto introduce otro: ");
            } else if(numero_introducido>max_rango){
                System.out.println("Numero Incorrecto introduce otro: ");
            } else if(numero_introducido>min_rango && numero_introducido<max_rango){
                System.out.println("Correcto,bye");
            }
            
        } while(numero_introducido<min_rango || numero_introducido>max_rango);
        
        //introduce un numero del 1 al 10 si pone 11 vuelve a poner un numero si pone 8 o algun numero pone la tabla de multiplicar
        Scanner sc= new Scanner(System.in);
        int num;
        
        
        do {
           System.out.println("Introduce un numero del 1 al 10");
           num=sc.nextInt();
           //if(num==0 || num==1 || num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9 || num==10) {
               //System.out.println("La tabla de multiplicar: " + num*1 + " " + num*2 + " " + num*3 + " " + num*4 + " " + num*5 + " " + num*6 + " " +  num*7 + " " + num*8 + " " + num*9 + " " + num*10);
           //}
           
               int multiplo=1;
               while (multiplo < 11){
               System.out.println(num + "*" + multiplo + " = " + (num*multiplo));
               multiplo++;
               
               }
        } while(num<10);
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10 maquina");
        int num;       
        num=sc.nextInt();
        System.out.println("La tabla de fking panzas es: ");
        
        
        
        for(int multiplo=0;multiplo<11;multiplo++) {
            
            System.out.println(num + " * " + multiplo + " = " + (num*multiplo));
        }
        
        //programa que muestre el producto de los 10 primeros numeros impares
        Scanner sc = new Scanner(System.in);
        int num;
        int producto;
        System.out.println("Introduce los 10 primeros: ");
        producto = sc.nextInt();
        for(num=1;num%2==1;num++){
            System.out.println((num++)*producto);
        }
        
        int resultado=1;
        for(int a = 1 ; a<20;a=a+2) {
            resultado= resultado*a;
            System.out.println("resultado" + resultado);
            
        }
        
        
        //FOR ANIDADO   
        for(int i=0;i<2;i++) {
            
            for(int j=0;j<2;j++){
                System.out.print("2");
            }
            System.out.println("1");
        }
 //Matriz Cuadrada
        for(int i = 0;i<3;i++ ){
            for(int j=0;j<3;j++){
                System.out.print("2");
            }
            System.out.println("");
        }
     int cont=0;
        for(int i=0;i<3;i++){
          
            for(int j=0;j<3;j++){
                System.out.print(cont);
                cont++;
            }
            System.out.println("");
            cont=0;
        }

       
        for(int i=0;i<4;i++) {
            
            for(int j=0;j<i;j++){
                System.out.print("*");
                
                
                
            }
            System.out.println("*");
            
        }
        
  
        f
       
        //hacer un tringulo
        //codigo asci con ovnis y binarios // te pide los numeros binarios por pantalla y cuando llegue al ultimo corta
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de filas: ");
        int num_filas=sc.nextInt();
        sc.close();
        System.out.println();
        
        for(int altura=1;altura<=num_filas;altura++){
            for(int espacios=1;espacios<=num_filas;espacios--){
                System.out.println(" ");
            }
            for(int asteriscos=1;asteriscos<=(altura*2)-1;asteriscos++){
                System.out.println("*");
            }
            System.out.println();
        }

        
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Introduce dos numeros");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(media(a,b));
        
        
        

        //int base y exponente dame la base guarda eso, exponente, el resultado es + potencia
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        System.out.println("Introduce base");
        base=sc.nextInt();
        System.out.println("Introduce exponente");
        exponente=sc.nextInt();
        System.out.println("El resultado es: " + potencia(base,exponente));
        
   
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce numero para el factorial");
        numero=sc.nextInt();
        System.out.println("El factorial es " + factorial(numero));

        
        //El continue se usa para hacer un salto de un valor a otro que tu ponga en el código, ejemplo abajo
        for(int i=0;i<4;i++){
        if(i==2){
            continue;
        }
            System.out.println("i"+ i);
    }

        
        int a =0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a=j;
                
            }
            
        }
        
        //crear una funcion a te devuelve true es vocal b es falso no es vocal
        Scanner sc = new Scanner(System.in);
        
        char letra;
        System.out.println("Introduce Letra");
        letra=sc.next().charAt(0);
        System.out.println("La letra es" + vocal(letra));
        */
        
        //ARRAY :(
}

    
    public static double media(int num1 ,int num2){
        double res=(num1+num2)/2;
        return res;
    }
    public static int potencia(int b, int e) {
        int res=1;
        for(int exponente=1;exponente<=e;exponente++){
           res=res*b; 
        }
        return res;    
    }
    
    public static int factorial(int num){
        int res=1;
        for(int i=1;i<=num;i++) {
            res=res*i;
        }
        return res;
    }
    
    public static boolean vocal (char vocal){
        if(vocal=='a' || vocal=='e' || vocal=='i' || vocal=='o' || vocal=='u'){
            return true;
        } else {
            return false;
        }
    }
    
}

/*
	 private int dimensionX;
	 private int dimensionY;
	 private char[][] matriz;
	    private int prb;
	    private int iniX;
	    private int iniY;
	    private int objX;
	    private int objY;
	    private boolean solucionable;


	    public Laberinto (int dimensionX, int dimensionY,int prb) {
	        this.dimensionX = dimensionX;
	        this.dimensionY = dimensionY;
	        this.prb=prb;
	        this.matriz = new char [dimensionX] [dimensionY];


	    }

	    public void generarLaberinto(int semilla) {
	        Random random=new Random(semilla);
	        iniX = random.nextInt(this.dimensionX);
	        iniY = random.nextInt(this.dimensionY);
	        objX = random.nextInt(this.dimensionX);
	        objY = random.nextInt(this.dimensionY);

	        matriz[iniX][iniY]= 'I';
            matriz[objX][objY]= 'G';
	        for (int i=0;i<dimensionX;i++){
	            for(int j=0;j<dimensionY;j++){

	            	
	            	if(!(i == iniX && j == iniY||i == objX && j == objY))
	            	{
	                if (random.nextInt(100) <= prb) {
	                    matriz[i][j] = '▉';
	                } else {
	                    matriz[i][j] = ' ';
	                }
	            }
	            }
	        }
	    }
	        
	        public void mostrarLaberinto() {
	        	int tempX = 0;
	        	int tempY = 0;
	        	while(tempY < this.dimensionY) {
	        		System.out.print(this.matriz[tempX][tempY]);
	        		
	        		if(tempX == this.dimensionX-1)
	        		{
	        			System.out.println();
	        			tempX = 0;
	        			tempY++;
	        		}
	        		else
	        			tempX++;
	        	}
	        }

	        public void pintarSolucion(ArrayList<Nodo> solucion)
	        {
	   
	        	int tempX = 0;
	        	int tempY = 0;
	        	
	        	if(this.solucionable== true)
	        	while(tempY < this.dimensionY) {
	        		if((tempX == objX && tempY == objY)||(tempX == iniX && tempY == iniY))
	        			System.out.print(this.matriz[tempX][tempY]);
	        		else if(esParte(tempX, tempY, solucion))
	        			System.out.print("+");
	        		else
		        		System.out.print(this.matriz[tempX][tempY]);

	        		
	        			if(tempX == this.dimensionX-1)
	        			{
	        				System.out.println();
	        				tempX = 0;
	        				tempY++;
	        			}
	        			else
	        				tempX++;
	        		}
	        	else
	        	{
	        		this.mostrarLaberinto();
	        		System.out.println("No existe solución");
	        	}
	        	
	        }
	        
*/

