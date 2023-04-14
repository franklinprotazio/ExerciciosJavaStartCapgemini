import java.util.Scanner;
public class ExercicioTreze {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
		System.out.println("Digite um numero");
		int numeroDigitado = leitor.nextInt();
		
		if(numeroDigitado > 10) {
			System.out.println("Numero maior que 10");
		}
		System.out.println("Fim");
	}

}
