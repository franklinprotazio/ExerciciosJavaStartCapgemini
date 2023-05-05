import java.util.Scanner;
public class ExercicioTrintaUm {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		float primeiroNumero = leitor.nextFloat();
		
		System.out.println("Digite outro numero");
		float segundoNumero = leitor.nextFloat();
		
		System.out.println("Escolha uma operação:\n Soma: +\n Subtração: -\n Multiplicação: *\n Divisão: / " );
		String operador = leitor.next();
		
		if(operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") ) {
			
			if(operador.equals("+")) {
				System.out.println("Soma:" + (primeiroNumero + segundoNumero));
			}
			
			if(operador.equals("-")) {
				System.out.println("Subtração:" + (primeiroNumero - segundoNumero));
			}
			
			if(operador.equals("*")) {
				System.out.println("Multiplicação:" + (primeiroNumero * segundoNumero));
			}
			
			if(operador.equals("/")) {
				System.out.println("Divisão:" + (primeiroNumero / segundoNumero));
			}
			
		} else {
			System.out.println("ERRO, operador não definido");
		}
		
	}

}
