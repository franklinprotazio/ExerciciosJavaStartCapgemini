import java.util.Scanner;
public class ExercicioVinteUm {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int totalAptos = 0;
		int totalNaoAptos = 0;
		
		char desejaContinuar = 'S';
		
		while(desejaContinuar == 'S' || desejaContinuar =='s') {
			System.out.println("Nome:");
			String nome = leitor.next();
			
			System.out.println("Sexo: M | F");
			char sexo = leitor.next().charAt(0);
			
			System.out.println("Idade");
			int idade = leitor.nextInt();
			
			System.out.println("Saúde");
			String saude = leitor.next();
			
			if(idade >= 18 && saude.equals("Boa")) {
				System.out.println("Apto para o serviço militar obrigatorio");
				totalAptos++;
			}else {
				System.out.println("Não está apto para o serviço militar obrigatorio");
				totalNaoAptos++;
			}
			System.out.println("Deseja continuar?");
			desejaContinuar = leitor.next().charAt(0);
		}
		System.out.println("---------------------------------------");
		System.out.println("Total de aptos: " + totalAptos);
		System.out.println("Total de não aptos: " + totalNaoAptos);

	}

}
