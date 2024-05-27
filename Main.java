package AtvdadeMaio;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância da viagem em km: ");
        double distancia = scanner.nextDouble();
        
        Veiculo popular = new Veiculo("Volkswagen", "Gol", "Gasolina", 50, 12);
        Veiculo suv = new Veiculo("Toyota", "RAV4", "Gasolina", 55, 10);
        Veiculo minivan = new Veiculo("Chrysler", "Pacifica", "Gasolina", 70, 8);

        double consumoPopular = distancia / popular.getAutonomia();
        double consumoSUV = distancia / suv.getAutonomia();
        double consumoMinivan = distancia / minivan.getAutonomia();

        System.out.println("Consumo para a viagem de " + distancia + " km:");
        System.out.println("Veículo Popular (Gol): " + consumoPopular + " litros");
        System.out.println("Veículo SUV (RAV4): " + consumoSUV + " litros");
        System.out.println("Veículo Minivan (Pacifica): " + consumoMinivan + " litros");
        
        scanner.close();
    }
}
