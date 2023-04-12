package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int primeiroNumeroDigitado = leitor.nextInt();
        
        System.out.println("Digite um numero: ");
        int segundoNumeroDigitado = leitor.nextInt();
        
        System.out.println("A soma eh: " + (primeiroNumeroDigitado + segundoNumeroDigitado));
    }
    
}
