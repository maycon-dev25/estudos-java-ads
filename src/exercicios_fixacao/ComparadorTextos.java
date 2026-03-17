// Define o pacote onde a classe está organizada
package exercicios_fixacao;

// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Classe responsável por comparar dois textos digitados pelo usuário
public class ComparadorTextos {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a palavra-chave
        System.out.println("Digite uma palavra-chave:");

        // Lê a palavra-chave digitada
        String palavraChave = scanner.nextLine();

        // Solicita ao usuário que digite outra palavra para comparação
        System.out.println("Digite outra tentativa:");

        // Lê a segunda palavra digitada
        String tentativa = scanner.nextLine();

        // Compara as duas Strings para verificar se são exatamente iguais
        boolean saoIguais = palavraChave.equals(tentativa);

        // Exibe o resultado da comparação (true ou false)
        System.out.println("A palavra-chave é igual? " + saoIguais);

        // Fecha o Scanner para liberar recursos do sistema
        scanner.close();
    }
}
