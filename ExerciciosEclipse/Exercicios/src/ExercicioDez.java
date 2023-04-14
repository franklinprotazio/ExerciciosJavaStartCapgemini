import java.util.Scanner;
public class ExercicioDez {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da venda");
		double valorVenda = leitor.nextDouble();
		
		System.out.println("Valor da prestação: R$" + valorVenda / 5);
		
		

	}

}
