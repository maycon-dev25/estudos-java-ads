package revisao.logica;

import java.util.Scanner;

public class GymSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Exemplo de constante final
        final double LIMITE_PESO_LEVE = 60.0;

        System.out.println("=== BEM-VINDO AO GYMSYSTEM ===");

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver sugestão de treino");
            System.out.println("2 - Calcular IMC");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu objetivo (1 para Hipertrofia, 2 para Perda de Peso): ");
                    int objetivo = scanner.nextInt();
                    // TODO: Use um IF/ELSE para sugerir um treino baseado no objetivo
                    if (objetivo == 1) {
                        System.out.println("Foco em cargas altas e poucas repetições.");
                    } else {
                        System.out.println("Foco em aeróbico e volume alto.");
                    }
                    break;

                case 2:
                    System.out.print("Digite seu peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite sua altura (m): ");
                    double altura = scanner.nextDouble();

                    // TODO: Calcule o IMC (peso / (altura * altura))
                    double imc = peso/(altura*altura);
                    System.out.println("Seu IMC é: " + imc);
                    // TODO: Use IF/ELSE para dizer se está abaixo, no peso ou acima
                    if (imc < 18.5) {
                        System.out.println("Abaixo do peso.");
                    } else if (imc < 24.9) {
                        System.out.println("Peso Normal.");
                    } else {
                        System.out.println("Sobrepeso");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema... Bons treinos!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}