import java.util.Scanner;

public class ExercicioVinteCinco {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int primeiroNumeroDigitado = leitor.nextInt();

		System.out.println("Digite um numero: ");
		int segundoNumeroDigitado = leitor.nextInt();
	
		if (primeiroNumeroDigitado > segundoNumeroDigitado) {
			System.out.println("Numeros diferentes");
			System.out.println("O primeiro numero é maior que o segundo ");
		}
		if (segundoNumeroDigitado > primeiroNumeroDigitado) {
			System.out.println("Numeros diferentes");
			System.out.println("O segundo numero é maior que o primeiro numero");
		} else {
			System.out.println("Numeros iguais");
		}
	}

}
