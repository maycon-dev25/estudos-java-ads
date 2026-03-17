// Importa a classe Scanner, utilizada para ler dados digitados pelo usuário
import java.util.Scanner;

// Classe responsável por demonstrar entrada e saída de dados
public class EntradaSaidaDeDados {

    // Método principal - ponto inicial de execução do programa
    public static void main(String[] args) {

        // Exemplos de diferentes formas de saída no console (comentados)
        // println -> imprime e pula linha
        // print -> imprime na mesma linha
        // printf -> imprime formatado
//        System.out.println("Olá, eu faço a impressão e pulo a linha.");
//        System.out.print("Olá, eu faço a impressão na mesma linha.");
//        System.out.printf("Olá, eu faço a impressão formatada.");

        // Cria um objeto Scanner para ler dados do teclado (entrada padrão)
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o nome
        System.out.println("Olá, digite o seu nome:");

        // Lê uma linha inteira digitada pelo usuário e armazena na variável nome
        String nome = scanner.nextLine();

        // Exemplo de exibição do nome digitado (comentado)
//        System.out.println("Nome: " + nome);

        // Solicita ao usuário que digite a idade
        System.out.println("Digite sua idade:");

        // Lê um número inteiro digitado pelo usuário e armazena na variável idade
        int idade = scanner.nextInt();

        // Exemplo de exibição dos dados (comentado)
//        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos.");

        // Solicita ao usuário que informe se está empregado (true ou false)
        System.out.println("Digite se você está empregado: sim (true) ou não (false).");

        // Lê um valor booleano digitado pelo usuário
        boolean empregado = scanner.nextBoolean();

        // Exibe no console as informações coletadas do usuário
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos. "
                + "Você está empregado? " + empregado);

        // Fecha o Scanner para liberar recursos do sistema
        scanner.close();
    }
}