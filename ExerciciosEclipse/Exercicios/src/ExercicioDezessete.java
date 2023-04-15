import java.util.Scanner;
public class ExercicioDezessete {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador = 0 ;
		
		for(int i = 0; i < 80; i++) {
			System.out.println("Digite um numero");
			int numeroDigitado = leitor.nextInt();
			if(numeroDigitado >= 10 && numeroDigitado <= 150) {
				contador++;
			}
		}
		
		System.out.println(contador);

	}

}
