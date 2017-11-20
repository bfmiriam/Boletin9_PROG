
package boletin9_5;

import java.util.Scanner;

public class Clase1 {

Scanner ler=new Scanner(System.in);
  
public void calcularSerie1(){    
    int i=0, num=2;
    
    System.out.println("Primeira serie\nIntroduce o número de elementos:");
    int elem=ler.nextInt();
    
    System.out.print("2");
        while (i<elem){
        num=num+2;
        i++;
        System.out.print("+"+num);
        }
        System.out.println("...");
 }
 public void calcularSerie2(){
    
    System.out.println("Segunda serie\nIntroduce o número de elementos:");
    int elem=ler.nextInt();
     
     for(int i=1;i<elem; i++){
         
        if(i%2 == 0){
            System.out.print("+"+i);
        }
        else{
            
           System.out.print("-"+i);
        }
   
     }
     System.out.println("...");
 }
     
public void calcularSerie3(){
   
    System.out.println("Terceira serie\nIntroduce o número de elementos:");
    int elem=ler.nextInt();
    
    int i, num1=0, num2=1;

        System.out.print(num1);
        
        for(i=2;i<elem;i++){
            
         System.out.print(", "+num2);
         
             num2 = num1 + num2;
             num1 = num2 - num1;
         
       }
        System.out.println("...");
    }
    
}
