// Classe responsável por demonstrar o uso da estrutura switch-case
public class SwitchCase {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Variável que representa o dia da semana (1 a 7)
        int diaDeSemana = 5;

        // Estrutura switch para verificar o valor da variável
        switch (diaDeSemana) {

            // Caso o valor seja 1
            case 1:
                System.out.println("Domingo");
                break; // Interrompe o switch

            // Caso o valor seja 2
            case 2:
                System.out.println("Segunda-feira");
                break;

            // Caso o valor seja 3
            case 3:
                System.out.println("Terça-feira");
                break;

            // Caso o valor seja 4
            case 4:
                System.out.println("Quarta-feira");
                break;

            // Caso o valor seja 5
            case 5:
                System.out.println("Quinta-feira");
                break;

            // Caso o valor seja 6
            case 6:
                System.out.println("Sexta-feira");
                break;

            // Caso o valor seja 7
            case 7:
                System.out.println("Sábado");
                break;

            // Caso o valor não esteja entre 1 e 7
            default:
                System.out.println("Dia inválido.");
        }
    }
}