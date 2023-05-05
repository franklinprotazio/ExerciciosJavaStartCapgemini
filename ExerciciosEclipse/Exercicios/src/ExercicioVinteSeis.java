import java.util.Scanner;
public class ExercicioVinteSeis {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		char desejaContinuar = 's';
		
		while(desejaContinuar == 's' || desejaContinuar == 'S') {
			System.out.println("Digite um numero entre 1 e 5");
			int numeroDigitado = leitor.nextInt();
			
			switch (numeroDigitado) {
			case 1: 
				System.out.println("Um");
				break;
			case 2:
				System.out.println("Dois");
				break;
			case 3:
				System.out.println("Três");
				break;
			case 4:
				System.out.println("Quatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			default:
				System.out.println("Número Inválido");
			}
			System.out.println("Deseja Continua?");
			desejaContinuar = leitor.next().charAt(0);			
		}
		
		System.out.println("Fim");
	}

}
