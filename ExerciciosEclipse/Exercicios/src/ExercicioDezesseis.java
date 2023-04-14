import java.util.Scanner;

public class ExercicioDezesseis {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o nome do aluno");
		String nomeAluno = leitor.nextLine();

		double nota;
		double soma = 0;
		double media;

		int i = 0;
		for (; i < 3; i++) {
			System.out.println("Informe " + (i+1) + "º nota");
			nota = leitor.nextDouble();
			soma = soma + nota;
		}		
		media = soma / 3;
		if(media >= 7) {
			System.out.println("O aluno " + nomeAluno + " foi Aprovado, a sua média foi " + media);
		} else {
			if (media >= 5.1 && media <= 6.9 ) {
				System.out.println("O aluno " + nomeAluno + " Está de Recuperação, a sua média foi " + media);
			} else {
				System.out.println("O aluno " + nomeAluno + " foi Reprovado, a sua média foi " + media);
			}
		}
	}

}
