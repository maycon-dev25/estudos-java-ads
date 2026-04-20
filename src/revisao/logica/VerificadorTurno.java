package revisao.logica;

import java.util.Scanner;

public class VerificadorTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para Trabalho, 2 para Descanso");
        int dia = scanner.nextInt();

        if (dia == 1){
            System.out.println("Prepare a marmita e o uniforme!");
        } else {
            System.out.println("Dia de focar no treino e ADS!");
        }
        scanner.close();
    }
}
