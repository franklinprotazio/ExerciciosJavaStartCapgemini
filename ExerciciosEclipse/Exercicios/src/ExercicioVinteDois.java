import java.util.Scanner;

public class ExercicioVinteDois {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float mediaCusto = 0f;
		float mediaVenda = 0f;
		float somaCusto = 0f;
		float somaVenda = 0f;

		int i = 0;

		for (; i < 5; i++) {
			System.out.println("Preço custo");
			float precoCusto = leitor.nextFloat();
			somaCusto = somaCusto + precoCusto;

			System.out.println("Preço venda");
			float precoVenda = leitor.nextFloat();
			somaVenda = somaVenda + precoVenda;

			if (precoVenda == precoCusto) {
				System.out.println("Empate");

			}
			if (precoVenda > precoCusto) {
				System.out.println("Lucro");
			} else {
				System.out.println("Prejuzio");
			}
			
		}
		mediaCusto = somaCusto / i;
		mediaVenda = somaVenda / i;
		
		System.out.println("Media de custo R$" + mediaCusto);
		System.out.println("Media de venda R$" + mediaVenda);
	}

}
