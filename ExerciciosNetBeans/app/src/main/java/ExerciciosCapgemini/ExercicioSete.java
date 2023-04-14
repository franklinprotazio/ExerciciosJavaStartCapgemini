package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe temperatura em Celsius");
        float temperaturaCelcius = leitor.nextFloat();
        
        float temperaturaFahrenheit = (9*temperaturaCelcius+160) / 5;
        
        System.out.println("A temperatura convertida em Fahrenheit é: " + temperaturaFahrenheit);
    }
    
}
