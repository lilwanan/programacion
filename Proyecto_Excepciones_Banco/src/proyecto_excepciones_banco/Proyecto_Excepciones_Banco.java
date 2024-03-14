/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_excepciones_banco;

/**
 *
 * @author medac
 */
public class Proyecto_Excepciones_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c;
        String [] valores = {"100","2500","700"};
        try{
            c=new Cuenta("Antonio",25,1000.00);
            System.out.println(c);
            procesarMovimiento(c,valores);
            System.out.println(c);
        }
        
        catch(NumberFormatException e3){
            System.out.println(e3.getMessage());
        }
        
        catch(SaldoInsuficienteException e1){
            System.out.println(e1.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void procesarMovimiento(Cuenta c , String[]movs) throws SaldoInsuficienteException{
        for(int i =0;i<movs.length;i++){
            c.movimiento(Double.parseDouble(movs[i]));
        }
    }
    
}
