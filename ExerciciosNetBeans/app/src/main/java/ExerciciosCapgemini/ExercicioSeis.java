package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
              
        System.out.println("Digite um valor para A");
        int valorA = leitor.nextInt();
        
        int trocador = valorA;
        
        System.out.println("Digite um valor para B");
        int valorB = leitor.nextInt();
        
        valorA = valorB;
        valorB = trocador;  
        
        System.out.println("Novo valor de A " + valorA);
        System.out.println("Novo valor de B " + valorB);
        
    }
    
}
