import java.util.Scanner;
public class ExercicioVinte {
	
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int totalCarros2000 = 0;
		int total = 0;
		
		float desconto = 0;
		float valorCarro;
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar == 'S' || desejaContinuar == 's') {
			
			System.out.println("Qual ano do veiculo que deseja comprar?");
			int anoCarro = leitor.nextInt();
			
			System.out.println("Digite o valor do carro");
			valorCarro = leitor.nextFloat();
			
			if(anoCarro <= 2000 ) {
				desconto = valorCarro * 12 / 100;
				totalCarros2000++;
				System.out.println("O valor de desconto foi R$" + desconto);
				System.out.println("Valor a ser pago R$: " + (valorCarro - desconto));
				
			} else  {
				desconto = valorCarro * 7 /100;
				
				System.out.println("O valor de desconto foi R$" + desconto);
				System.out.println("Valor a ser pago R$: " + (valorCarro - desconto));
				
			}
			total++;
			System.out.println("------------------------------");
			System.out.println("Deseja continua? S = Sim | N = Não");
			desejaContinuar = leitor.next().charAt(0);
		}
		System.out.println("Total de carro ate 2000: " + totalCarros2000);
		System.out.println("Total de carro: " + total);
	}

}
