
package boletin9_4;


import java.util.Scanner;


public class Clase1 {
    
    public void tabla(){
        
        int i, producto, num;
      
    Scanner ler=new Scanner(System.in);
    
    System.out.println("Introduce número: ");
    num=ler.nextInt(); 
   
    while(num!=0){
   
    for(i=0; i<=10;i++){
     
        if(num!=0){
        producto=num*i;
        
        System.out.println(num+"x"+i+"="+producto);
        }
    
        else{
        System.exit(0);
        }
    }
    System.out.println("Introduce número: ");
    num=ler.nextInt();
    }   
  }
}
