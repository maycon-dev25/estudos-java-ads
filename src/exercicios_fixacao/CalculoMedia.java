package exercicios_fixacao;// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Classe do exercício
public class CalculoMedia {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar dados digitados no teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.println("Digite o seu nome:");

        // Lê o nome completo digitado e armazena na variável nome
        String nome = scanner.nextLine();

        // Solicita a primeira nota (AV1)
        System.out.println("Digite sua AV1:");

        // Lê a nota e armazena na variável nota1
        double nota1 = scanner.nextDouble();

        // Solicita a segunda nota (AV2)
        System.out.println("Digite sua AV2:");

        // Lê a nota e armazena na variável nota2
        double nota2 = scanner.nextDouble();

        // Solicita a terceira nota (AV3)
        System.out.println("Digite sua AV3:");

        // Lê a nota e armazena na variável nota3
        double nota3 = scanner.nextDouble();

        // Soma das três notas informadas pelo usuário
        double soma = nota1 + nota2 + nota3;

        // Calcula a média dividindo a soma das notas por 3
        double media = soma / 3;

        // Exibe o nome do usuário e a média calculada
        System.out.println("Meu nome é " + nome + " e a minha média foi " + media + ".");

        // Fecha o Scanner para liberar recursos do sistema (boa prática)
        scanner.close();
    }
}