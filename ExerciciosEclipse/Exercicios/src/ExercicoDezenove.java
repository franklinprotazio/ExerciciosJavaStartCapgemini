import java.util.Scanner;
public class ExercicoDezenove {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int qtoHomens = 0;
		int qtoMulheres = 0;
		
		for(int i = 0; i < 56; i++) {
			System.out.println("Nome");
			String nome = leitor.nextLine();
			System.out.println("Sexo - M / F");
			String sexo = leitor.nextLine();
			if(sexo.toUpperCase().equals("M")) {
				qtoHomens++;
			} if(sexo.toUpperCase().equals("F")) {
				qtoMulheres++;
			}
		}
		System.out.println("Quantidade Homens: " + qtoHomens);
		System.out.println("Quantidade Mulheres: " + qtoMulheres);
	}

}
