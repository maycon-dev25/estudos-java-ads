// Define o pacote onde a classe está organizada
package exercicios_fixacao;

// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

// Classe responsável por praticar conversão de tipos (casting)
public class PraticaCasting {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o valor do produto
        System.out.println("Digite o valor do produto:");

        // Lê o valor digitado como texto (String)
        String preco = scanner.nextLine();

        // Converte a String para double (valor numérico com casas decimais)
        double precoConvertido = Double.parseDouble(preco);

        // Faz o casting de double para int (remove a parte decimal)
        int precoConvertidoInt = (int) precoConvertido;

        // Exibe o valor original e o valor convertido conforme o enunciado
        System.out.println("O preço original é " + precoConvertido
                + " e o valor para pagamento em dinheiro é " + precoConvertidoInt + ".");

        // Fecha o Scanner para liberar recursos do sistema
        scanner.close();
    }
}