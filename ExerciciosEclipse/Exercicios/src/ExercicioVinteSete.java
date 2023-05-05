import java.util.Scanner;
public class ExercicioVinteSete {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float totalPagamentos = 0f;
		float totalDescontos = 0f;
		float valorVeiculo = 50.000f;
		float desconto = 0;
		
		char desejaContinuar = 's';
		
		while(desejaContinuar == 's' || desejaContinuar == 'S') {
			System.out.println("Qual tipo do veiculo que deseja: 1 = Álcool | 2 = Gasolina | 3 = Diesel");
			int tipoVeiculo = leitor.nextInt();
			
			switch (tipoVeiculo) {
			case 1: 
					desconto = valorVeiculo * 25 / 100;
					totalDescontos = totalDescontos + desconto;
					totalPagamentos = totalPagamentos + (valorVeiculo - desconto);
					System.out.println("O tipo escolhido foi o Álcool, o valor do desconto é de: " + desconto + ", o valor "
							+ "pagamento: " + (valorVeiculo - desconto));
					break;
			case 2: 
				desconto = valorVeiculo * 21 / 100;
				totalDescontos = totalDescontos + desconto;
				totalPagamentos = totalPagamentos + (valorVeiculo - desconto);
				System.out.println("O tipo escolhido foi o Gasolina, o valor do desconto é de: " + desconto + ", o valor "
						+ "pagamento: " + (valorVeiculo - desconto));
				break;
			case 3:
				desconto = valorVeiculo * 14 / 100;
				totalDescontos = totalDescontos + desconto;
				totalPagamentos = totalPagamentos + (valorVeiculo - desconto);
				System.out.println("O tipo escolhido foi o Diesel, o valor do desconto é de: " + desconto + ", o valor "
						+ "pagamento: " + (valorVeiculo - desconto));
				break;				
			}
			System.out.println("Deseja continuar?");
			desejaContinuar = leitor.next().charAt(0);
		}
		System.out.println("Total descontos: R$" + totalDescontos);
		System.out.println("Total pagamentos: R$" + totalPagamentos);

	}

}
