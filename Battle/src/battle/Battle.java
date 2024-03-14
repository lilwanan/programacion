/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battle;

/**
 *
 * @author medac
 */
public class Battle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador j1 = new Jugador ("Alfonso");
        Jugador j2 = new Jugador ("Monico");
         
                System.out.println("  O                      O          ");
                System.out.println("O-|-O     FIGHT!!!     O-|-O        ");
                System.out.println("  |                      |          ");
                System.out.println(" / \\                    / \\        ");
                System.out.println("                                    ");  
        
        do {
            int a = (int)(Math.random()*2);
            if (a==0){ //jugador1 pega 1 j2
                j1.luchar(j2);
                
            } else {
                j2.luchar(j1);
            }
            System.out.println("Vidas restantes J1: " + j1.getVida() + " " + "Vidas restantes J2: " + j2.getVida());
    } while(j1.getVida()>0 && j2.getVida()>0);
    
        if (j1.getVida()==0){
            //j1 perdio
            System.out.println("Ha ganado " + j2.toString());
            System.out.println("");
                System.out.println("  O                        O O O         ");
                System.out.println("O-|-O     WINNER --->       \\|/       ");
                System.out.println("  |                          |          ");
                System.out.println(" / \\                        / \\        ");
                System.out.println("                                    "); 
            
        } else {
            //j2 perdio
            System.out.println("Ha ganado " + j1.toString());
            System.out.println("");
                System.out.println("O O O                    O          ");
                System.out.println(" \\|/     <---WINNER    O-|-O        ");
                System.out.println("  |                      |          ");
                System.out.println(" / \\                    / \\        ");
                System.out.println("                                    "); 
        }
}
}