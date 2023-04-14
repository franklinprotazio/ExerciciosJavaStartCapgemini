import java.util.Scanner;
public class ExercicioOnze {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Preço de custo");
		float precoCusto = leitor.nextFloat();
		
		System.out.println("Informe o acrescimo para venda do produto");
		float porcentagem = leitor.nextFloat();
		
		float acrescimo = (precoCusto * porcentagem / 100);
		
		System.out.println("Valor de venda: R$" + (acrescimo + precoCusto));
	}

}
