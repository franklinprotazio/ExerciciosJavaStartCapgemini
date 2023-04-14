import java.util.Scanner;
public class ExercicioQuatorze {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int primeiroNumeroDigitado = leitor.nextInt();
		
		System.out.println("Digite outro numero");
		int segundoNumeroDigitado = leitor.nextInt();
			
		if(primeiroNumeroDigitado > segundoNumeroDigitado) {
			System.out.println("O primeiro numero é o maior com " + primeiroNumeroDigitado);
		} else {
			if (segundoNumeroDigitado > primeiroNumeroDigitado) {
				System.out.println("O segundo numero é o maior com " + segundoNumeroDigitado);
			} else {
				System.out.println("Números iguais");
			}
		}

	}

}
