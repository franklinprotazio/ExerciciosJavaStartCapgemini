import java.util.Scanner;
public class ExercicioQuinze {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numeroDigitado = leitor.nextInt();
		
		if(numeroDigitado >= 100 && numeroDigitado <= 200) {
			System.out.println("O numero está no intervalor entre 100 e 200");
		}

	}

}
