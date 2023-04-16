import java.util.Scanner;
public class ExercicioVinte {
	
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int totalCarros2000 = 0;
		int total = 0;
		
		float vendaCarro = 0;
		float valorCarro;
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar == 'S' || desejaContinuar == 's') {
			
			System.out.println("Qual ano do veiculo que deseja comprar?");
			int anoCarro = leitor.nextInt();
			
			System.out.println("Digite o valor do carro");
			valorCarro = leitor.nextFloat();
			
			if(anoCarro <= 2000 ) {
				vendaCarro = valorCarro * 12 / 100;
				totalCarros2000++;
				total++;
				System.out.println("O valor do carro com desconto de 12% é R$" + (valorCarro - vendaCarro));
				
			} if(anoCarro > 2000) {
				vendaCarro = valorCarro * 7 /100;
				total++;
				System.out.println("O valor do carro com desconto de 7% é R$" + (valorCarro - vendaCarro));
				
			}
			System.out.println("------------------------------");
			System.out.println("Deseja continua? S = Sim | N = Não");
			desejaContinuar = leitor.next().charAt(0);
		}

	}

}
