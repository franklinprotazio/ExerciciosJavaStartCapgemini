import java.util.Scanner;
public class ExercicioVinteNove {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
			
		char desejaContinuar  = 's';
		
		while(desejaContinuar == 's' || desejaContinuar == 'S') {
			
			System.out.println("Digite um número");
			int numeroDigitado = leitor.nextInt();
			
			switch (numeroDigitado) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Março");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12: 
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Mês inválido");
			}
		System.out.println("Deseja continuar:");	
		desejaContinuar = leitor.next().charAt(0);
		}
		
		
	}

}
