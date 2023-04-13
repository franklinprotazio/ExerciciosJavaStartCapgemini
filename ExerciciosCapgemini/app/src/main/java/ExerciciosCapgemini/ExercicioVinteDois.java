package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioVinteDois {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        int i = 0;

        for (; i < 3; i++) {

            System.out.println("Digite o nome do produto:");
            nomeProduto = leitor.next();

            System.out.println("Informe o preço de custo do produto:");
            precoCusto = leitor.nextFloat();

            System.out.println("Informe o preco de venda do produto:");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            System.out.println("-----------------------------------------------");
            if (precoCusto == precoVenda) {
                System.out.println("Houve empate entre o preco de custo e"
                        + "preco de venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve prejuizo");
                } else {
                    System.out.println("Lucro");
                }
            }
            System.out.println(nomeProduto + ", preco do custo = " + precoCusto
            + ", preco de venda = " + precoVenda);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("A media de preco de custo eh de: " + (totalCusto / i));
        System.out.println("A media de preco de venda eh de: " + (totalVenda / i));

    }
}
