
package boletin9_3;

import java.util.Scanner;

public class Clase1 {
    
    int area;
    
    Scanner ler=new Scanner(System.in);
    
public void calcularArea(){
   
    int base, altura;
    do{
    System.out.println("Introduce base: ");
    base=ler.nextInt();
    }while(base<=0);
    do{
    System.out.println("Introduce altura: ");
     altura=ler.nextInt();
    }while(altura<=0);
    
    if(base>0 && altura>0){
        area=base*altura;
        System.out.println("área: "+area); 
    }
    else{
        System.out.println("Erro: os valores deben ser positivos.");
    }   
   } 
}
