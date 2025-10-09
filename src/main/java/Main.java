package main.java;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        double massa = scanner.nextDouble();
 
        System.out.print("Digite o volume inicial (m³): ");
        double volume = scanner.nextDouble();
 
        System.out.print("Digite a densidade inicial (kg/m³): ");
        double densidade = scanner.nextDouble();
 
        System.out.print("Digite a altura inicial (m): ");
        double altura = scanner.nextDouble();
 
        CorpoHumano c = new CorpoHumano(massa, volume, altura, densidade);
        System.out.println("\n=== VALORES INICIAIS ===");
        System.out.println("Massa: " + c.getMassa() + " kg");
        System.out.println("Volume: " + c.getVolume() + " m³");
        System.out.println("Densidade: " + c.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c.getAltura() + " m");
        System.out.printf("IMC: %.2f\n", c.calcularIMC());
        System.out.println("\nDigite uma nova massa(kg): ");
        double novaMassa = scanner.nextDouble();
        c.setMassa(novaMassa);
        System.out.println("Digite uma nova altura");
        double novaAltura = scanner.nextDouble();
        c.setAltura(novaAltura);
       
        System.out.println("\n Novos Valores: ");
        System.out.println("Massa: "+ c.getMassa()+ "kg");
        System.out.println("Altura: "+ c.getAltura()+ "m");
        System.out.println("Novo IMC: "+ c.calcularIMC());
 
     
    }
    
}
