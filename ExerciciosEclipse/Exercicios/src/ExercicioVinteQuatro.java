import java.util.Scanner;
public class ExercicioVinteQuatro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		char desejaContinuar =  's';
		
		int qtoNumerosPositivos = 0;
		int qtoNumerosNegativos = 0;
		int qtoZero = 0;
		
		while(desejaContinuar == 's' || desejaContinuar == 'S') {
			System.err.println("Digite um numero:");
			int numeroDigitado = leitor.nextInt();
			
			if(numeroDigitado > 0) {
				System.out.println("Positivo");
				qtoNumerosPositivos++;
								
			} if(numeroDigitado < 0) {
				System.out.println("Negativo");
				qtoNumerosNegativos++;
				
			} if (numeroDigitado == 0) {
				System.out.println("Zero");
				qtoZero++;
			}
			
			System.out.println("Deseja continuar?");
			desejaContinuar = leitor.next().charAt(0);
		}
		System.out.println("----------------------------");
		System.out.println("Quantidade numeros positivo: " + qtoNumerosPositivos);
		System.out.println("Quantidade numeros negativos: " + qtoNumerosNegativos);
		System.out.println("Quantidade de zeros: " + qtoZero);

	}

}
