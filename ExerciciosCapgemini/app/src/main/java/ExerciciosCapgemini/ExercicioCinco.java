package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioCinco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float notaAluno;
        float somaNota = 0.0f;
        float mediaAluno = 0.0f;
        int i = 0;

        System.out.println("Informe o nome do aluno:");
        String nomeAluno = leitor.next();

        for (; i < 3; i++) {

            System.out.println("Informe a nota da prova");
            notaAluno = leitor.nextFloat();
            
            somaNota = somaNota = notaAluno;         
        }
        
        mediaAluno = somaNota / i;
        System.out.println("O aluno " + nomeAluno + " obteve a media " + mediaAluno);

    }

}
