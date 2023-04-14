package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do vendedor: ");
        String nomeVendedor = leitor.next();
        
       double salarioFixo = 1000d;
       int totalVentas = 10;
       double valorVenda = 100d;
       double salarioFinal = (valorVenda * totalVentas * 15 /100) + salarioFixo ;
      
       System.out.println("O vendedor " + nomeVendedor + " tem salario de " +  salarioFixo + " e com a comissao de 15% sobre as vendas, o salario final eh: " + salarioFinal);
        
        
    }
    
}
