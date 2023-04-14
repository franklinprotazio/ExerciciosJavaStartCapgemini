
import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da cotação do dolar");
		float cotacaoDolar = leitor.nextFloat();
		
		System.out.println("Informe a quantidade de dolares:");
		float quantidadeDolar = leitor.nextFloat();
		
		float real = cotacaoDolar * quantidadeDolar;
		
		System.out.println("Valor em real: R$" + real);
	}

}
