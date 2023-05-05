import java.util.Scanner;

public class ExercicioVinteOito {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String nomeFuncionario;
		double salarioMinimo;
		double salarioFuncionario;
		double folhaPagamentoAtual = 0;
		double folhaPagamento = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nome:");
			nomeFuncionario = leitor.next();

			System.out.println("Salario:");
			salarioFuncionario = leitor.nextDouble();

			System.out.println("Salario minimo:");
			salarioMinimo = leitor.nextDouble();

			if (salarioFuncionario <= (salarioMinimo * 3)) {
				double novoSalario = (salarioFuncionario * 50 / 100) + salarioFuncionario;
				System.out.println("Funcionario: " + nomeFuncionario + "\nReajuste: R$"
						+ (salarioFuncionario * 50 / 100) + "\nNovo salario: R$" + novoSalario);
				folhaPagamento = folhaPagamento + salarioFuncionario;
				folhaPagamentoAtual = folhaPagamentoAtual + novoSalario;
				
			}
			if (salarioFuncionario > (salarioMinimo * 3) && salarioFuncionario <= (salarioMinimo * 10)) {
				double novoSalario = (salarioFuncionario * 20 / 100) + salarioFuncionario;
				System.out.println("Funcionario: " + nomeFuncionario + "\nReajuste: R$"
						+ (salarioFuncionario * 20 / 100) + "\nNovo salario: R$" + novoSalario);
				folhaPagamento = folhaPagamento + salarioFuncionario;
				folhaPagamentoAtual = folhaPagamentoAtual + novoSalario;
				
			}
			if (salarioFuncionario > (salarioMinimo * 10) && salarioFuncionario <= (salarioMinimo * 20)) {
				double novoSalario = (salarioFuncionario * 15 / 100) + salarioFuncionario;
				System.out.println("Funcionario: " + nomeFuncionario + "\nReajuste: R$" + (salarioFuncionario * 15 / 100) + 
						"\nNovo salario: R$" + novoSalario);
				folhaPagamento = folhaPagamento + salarioFuncionario;
				folhaPagamentoAtual = folhaPagamentoAtual + novoSalario;
				
			} if(salarioFuncionario > (salarioMinimo * 20)) {
				double novoSalario = (salarioFuncionario * 10 / 100) + salarioFuncionario;
				System.out.println("Funcionario: " + nomeFuncionario + "\nReajuste: R$" + (salarioFuncionario * 10 / 100) + 
						"\nNovo salario: R$" + novoSalario);
				folhaPagamento = folhaPagamento + salarioFuncionario;
				folhaPagamentoAtual = folhaPagamentoAtual + novoSalario;
				
			}	
			System.out.println("-------------------------------------");
		}
		System.out.println("O aumento da folha de pagamento será R$" + (folhaPagamentoAtual - folhaPagamento));

	}

}
