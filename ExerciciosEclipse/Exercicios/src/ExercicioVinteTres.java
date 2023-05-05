import java.util.Random;
public class ExercicioVinteTres {

	public static void main(String[] args) {

		Random gerador = new Random();
		
		int numero = gerador.nextInt(100);
		
		System.out.println(numero);
		
		if(numero > 80) {
			System.out.println("Maior que 80");
		} if (numero < 25) {
			System.out.println("Menor que 25");
		} if(numero == 40) {
			System.out.println("Numero 40");
		}

	}

}
