// Classe responsável por demonstrar o uso das estruturas de repetição while e do-while
public class While {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Variável que controla o número de repetições
        int contador = 0;

//        // Estrutura while:
//        // Executa o bloco enquanto a condição for verdadeira
//        while (contador <= 5) {
//
//            // Exibe o valor atual do contador
//            System.out.println("Contador (while): " + contador);
//
//            // Incrementa o contador em 1 a cada repetição
//            contador++;
//        }

        // Estrutura do-while:
        // Executa o bloco pelo menos uma vez, mesmo que a condição seja falsa
        do {

            // Exibe o valor atual do contador
            System.out.println("Contador (do-while): " + contador);

            // Incrementa o contador em 1 a cada repetição
            contador++;

            // Continua repetindo enquanto o contador for menor ou igual a 5
        } while (contador <= 5);
    }
}