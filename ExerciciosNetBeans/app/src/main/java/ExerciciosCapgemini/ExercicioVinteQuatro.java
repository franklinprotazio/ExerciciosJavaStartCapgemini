package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        String continuar = "s";
        
        while(continuar.equalsIgnoreCase("s")){
            
            System.out.println("Digite um numero: ");
            int numeroDigitado = leitor.nextInt();
            
            if(numeroDigitado == 0){
                System.out.println("O numero eh zero");
            } else {
                if(numeroDigitado > 0){
                    System.out.println("Positivo");
                }else{
                    System.out.println("Numero Negativo");
                }
            }   
            System.out.println("Deseja continuar? ");
            continuar = leitor.next();
    }  
}   
}
