import java.util.Scanner;
public class ExercicioTrinta {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
					
			System.out.println("Digite o primeiro numero");
			int primeiroNumero = leitor.nextInt();
			
			System.out.println("Digite o primeiro numero");
			int segundoNumero = leitor.nextInt();
			
			System.out.println("Digite o primeiro numero");
			int terceiroNumero = leitor.nextInt();
			
			if(primeiroNumero < segundoNumero && segundoNumero < terceiroNumero) {
				System.out.println("Ordem crescente: " + primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);						
			}
			
			if (primeiroNumero < terceiroNumero && terceiroNumero < segundoNumero) {
				System.out.println("Ordem crescente: " + primeiroNumero + ", " + terceiroNumero + ", " + segundoNumero);
			}
			
			if(segundoNumero < primeiroNumero && primeiroNumero < terceiroNumero) {
				System.out.println("Ordem crescente: " + segundoNumero + ", " + primeiroNumero + ", " + terceiroNumero);
			}
			
			if(segundoNumero < terceiroNumero && terceiroNumero < primeiroNumero) {
				System.out.println("Ordem crescente: " + segundoNumero + ", " + terceiroNumero + ", " + primeiroNumero);
			}
			
			if(terceiroNumero < primeiroNumero && primeiroNumero < segundoNumero) {
				System.out.println("Ordem crescente: " + terceiroNumero + ", " + primeiroNumero + ", " + segundoNumero);
			}
			
			if(terceiroNumero < segundoNumero && segundoNumero < primeiroNumero) {
				System.out.println("Ordem crescente: " + terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
			}
	}

}
