// Define o pacote onde a classe está organizada
package exercicios_fixacao;

// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Classe responsável por simular um sistema simples de vendas
public class SistemaVendas {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar dados digitados no teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do produto
        System.out.println("Qual é o produto?");

        // Lê o nome do produto digitado pelo usuário
        String produto = scanner.nextLine();

        // Solicita o valor unitário do produto
        System.out.println("Qual é o valor da unidade?");

        // Lê o preço do produto
        double preco = scanner.nextDouble();

        // Solicita a quantidade de unidades
        System.out.println("Quantas unidades?");

        // Lê a quantidade informada
        int quantidade = scanner.nextInt();

        // Calcula o valor total da compra (preço x quantidade)
        double totalDoValor = preco * quantidade;

        // Exibe o nome do produto e o valor total a pagar
        System.out.println("Produto: " + produto + " | Total a pagar: R$ " + totalDoValor + ".");

        // Fecha o Scanner para liberar recursos do sistema
        scanner.close();
    }
}