package ExerciciosCapgemini;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a distancia percorrida: ");
        double distanciaPercorrida = leitor.nextDouble();
        
        System.out.println("Informe o total de combustivel gasto: ");
        double totalCombustivelGasto = leitor.nextDouble();
        
        double mediaCombustivel = distanciaPercorrida / totalCombustivelGasto;
        
        System.out.println("Consumo medio: " + mediaCombustivel);
    }
}
