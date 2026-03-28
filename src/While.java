// Classe responsável por demonstrar o uso da estrutura de repetição while
public class While {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Variável que controla o número de repetições
        int contador = 0;

        // Enquanto o contador for menor ou igual a 5, o bloco será executado
        while (contador <= 5) {

            // Exibe o valor atual do contador
            System.out.println("Contador: " + contador);

            // Incrementa o contador em 1 a cada repetição
            contador++;
        }
    }
}