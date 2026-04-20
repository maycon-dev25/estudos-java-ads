package revisao.logica;

import java.util.Scanner;

public class CalculoProteina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Peça o peso do usuário
        System.out.print("Digite seu peso atual (kg): ");
        double peso = scanner.nextDouble();

        // 2. Cálculo (Peso vezes 2)
        double totalProteina = peso * 2;

        // 3. Exiba o resultado
        System.out.println("Para hipertrofia, você deve consumir: " + totalProteina + "g de proteína.");
        if (totalProteina > 160){
            System.out.println("Capricha no frango e no Whey!");
        } else {
            System.out.println("Dá para bater a meta tranquilo!");
        }
        scanner.close();
    }
}