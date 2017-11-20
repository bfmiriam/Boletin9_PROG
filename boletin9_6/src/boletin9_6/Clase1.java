
package boletin9_6;

import java.util.Scanner;

public class Clase1 {
    
    Scanner ler=new Scanner(System.in);

  public void calcularSoldos(){
      
      int trabTotal=0;
      int traballadores1=0;
      int traballadores2=0;
      
      System.out.println("Introduce soldo: ");
       int soldo=ler.nextInt();
  
     while(soldo!=0){
         
        if(soldo>0){
            trabTotal++;
            if(soldo>=1000 && soldo<=1750){
            traballadores1++;
            }   
        
            else if(soldo>0 && soldo<1000){
                traballadores2++;
            } 
            else{
                
            }
        } 
     System.out.println("Introduce soldo: ");
     soldo=ler.nextInt();
     }
         
     System.out.println("Hai "+traballadores1+" persoas que gañan entre 1000 e 1750");    
     System.out.println("Hai un "+(traballadores2*100/trabTotal)+" % de traballadores que gañan menos de 1000");
   
  }
    
}
