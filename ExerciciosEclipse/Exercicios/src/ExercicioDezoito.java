import java.util.Scanner;
public class ExercicioDezoito {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i <75; i++) {
			System.out.println("Informe a sua idade");
			int idade = leitor.nextInt();
			if(idade >= 18 ) {
				System.out.println("Você é de maior");
			} else {
				System.out.println("Você é de menor");
			}
		}

	}

}
