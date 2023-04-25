/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;
import java.util.Scanner;

/**
 *
 * @author gbeni
 */
public class guia {
    
    public static void main (String[] args){
    
        int a ;
       
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("ingrese la cantidad de invitados");
        
        a = s.nextInt();
        
       if(a == 1){
       
       
           System.out.println("una cita con alguien, el costo será de 300 dolares");
           
           
       }else{
       
       
            switch(a){
                
                case 2:
                    
                    System.out.println("reunion de amigos, costo de 350$");
                    break;
                    
                case 3 :
                    
                    System.out.println("reunion de amigos, costo de 350$");
                    break;
                    
                case 4 :
                    
                    System.out.println("reunion de amigos, costo de 350$");
                    break;
                    
                case 5 :
                    
                    System.out.println("reunion de amigos, costo de 350$");
                     break;
                     
                case 6 :
                    
                    System.out.println("reunion de amigos, costo de 350$");
                    break;
                    
                case 7 :
                    
                    System.out.println("reunion de amigos, costo de 350$");    
                    break;
                    
                case 8: 
                    
                    System.out.println("fiesta pequeña, son 400 dolares");
                    break;
                    
                case 9 :
                    
                    System.out.println("fiesta pequeña, son 400 dolares");
                    break;
                    
                case 10 :
                    
                    System.out.println("fiesta pequeña, son 400 dolares");
                    break;
                    
                default :
                    
                    System.out.println("no podemos organizar fiestas de mas de 10 personas.");
                    break;
                    
        }
       }
        
    
    }
    
    
}
