import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Valor do deposito:");
		float valorDeposito = leitor.nextFloat();
		
		float juroPoupanca = 0.07f;
		
		float rendimento = (valorDeposito * juroPoupanca / 100);
		
		float total = rendimento + valorDeposito;
		
		System.out.println("O seu dinheiro rendeu R$" + rendimento + ", o seu total é R$" + total);
	}

}
