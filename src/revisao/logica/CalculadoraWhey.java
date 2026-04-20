package revisao.logica;

import java.util.Scanner;

public class CalculadoraWhey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do pote de Whey: R$ ");
        double precoPote = scanner.nextDouble();

        System.out.print("Quantas doses vêm no pote? ");
        int doses = scanner.nextInt();

        double valorPorDose = precoPote/doses;

        System.out.println("O valor de cada dose é: R$ " + valorPorDose);

        if (valorPorDose <= 5.0){
            System.out.println("Custo-benefício aprovado!");
        } else {
            System.out.println("Valor por dose elevado. Melhor pesquisar outra marca.");
        }

        scanner.close();
    }
}