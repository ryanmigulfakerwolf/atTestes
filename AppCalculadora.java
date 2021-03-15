/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author ryanc
 */
public class AppCalculadora {
    
    
   
    
    
    
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
    
        
        Calculadora ca = new Calculadora();
        
           
        int op;
        System.out.println("Digite a operação desejada");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("1-Multiplicação");
        System.out.println("2-Divisão");
        op = in.nextInt();
        
        
        int i=1;
        while(i!=0){
       
        switch(op){
            case 1:
                System.out.println("Soma");
                System.out.println("Digite o primeiro valor: ");
                ca.v1 = in.nextDouble();
                System.out.println("Digite o segundo valor:");
                ca.v2 = in.nextDouble();
                System.out.println("Resultado" + ca.soma(ca.result));   
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println("Digite o primeiro valor: ");
                ca.v1 = in.nextDouble();
                System.out.println("Digite o segundo valor:");
                ca.v2 = in.nextDouble();
                System.out.println("Resultado" + ca.subtra(ca.result));
                
            case 3:
                System.out.println("Multiplicação");
                System.out.println("Digite o primeiro valor: ");
                ca.v1 = in.nextDouble();
                System.out.println("Digite o segundo valor:");
                ca.v2 = in.nextDouble();
                System.out.println("Resultado" + ca.multipli(ca.result));
                
            case 4:
                System.out.println("Divisão");
                System.out.println("Digite o primeiro valor: ");
                ca.v1 = in.nextDouble();
                System.out.println("Digite o segundo valor:");
                ca.v2 = in.nextDouble();
                System.out.println("Resultado" + ca.divisao(ca.result));
                
        }
                System.out.println("Deseja continuar? 1-Continuar | 0- Sair ");
                i = in.nextInt();
                if(i==1){
                    System.out.println("Digite a operação desejada");
                    System.out.println("1-Soma");
                    System.out.println("2-Subtração");
                    System.out.println("1-Multiplicação");
                    System.out.println("2-Divisão");
                    op = in.nextInt();
                }else{
                    System.out.println("Fim do Programa");
                }
    }
        
    }
    
    
    
    
    
    
    
            
    
            
            
    
    
    
    
    
    
    
}
