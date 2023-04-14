import java.util.Scanner;
public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float custoFabrica = 1000f;
		
		float percentualDistribuidor = 28f;
		
		float impostos = 45f;
		
		float fabricaImpostos = custoFabrica * impostos / 100;
		
		float totalFabrica = custoFabrica + fabricaImpostos;
		
		float Distribuidor = totalFabrica * percentualDistribuidor / 100;
		
		float totalDistribuidor = totalFabrica + Distribuidor;
		
		System.out.println("Venda para o consumidor: R$" + totalDistribuidor);
		
	}

}
