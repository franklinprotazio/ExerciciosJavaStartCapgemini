package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int primeiroNumeroDigitado = leitor.nextInt();
        
        System.out.println("Digite um numero: ");
        int segundoNumeroDigitado = leitor.nextInt();
        
        int soma = primeiroNumeroDigitado + segundoNumeroDigitado;
        int subtracao = primeiroNumeroDigitado - segundoNumeroDigitado;
        int multiplicacao = primeiroNumeroDigitado * segundoNumeroDigitado;
        int divisao = primeiroNumeroDigitado / segundoNumeroDigitado;
                
        System.out.println("A soma eh: " + soma);
        System.out.println("A subtracao eh: " + subtracao);
        System.out.println("A multiplicacao eh: " + multiplicacao);
        System.out.println("A divisao eh: " + divisao);
    }
    
}
