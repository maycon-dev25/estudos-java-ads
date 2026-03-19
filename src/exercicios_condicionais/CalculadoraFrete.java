// Define o pacote onde a classe está organizada
package exercicios_condicionais;

// Classe responsável por simular uma calculadora de frete
public class CalculadoraFrete {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Valor total da compra realizada pelo cliente
        double valorCompra = 150.0;

        // Indica se o cliente é assinante (ex: Prime)
        boolean isPrime = true;

        // Indica se há um cupom de desconto ativo
        boolean cupomDescontoAtivo = false;

        // Se a compra for maior ou igual a 200 OU o cliente for Prime
        // então ele ganha frete grátis
        if (valorCompra >= 200.0 || isPrime) {
            System.out.println("Parabéns! Você ganhou frete grátis.");

            // Se a compra for maior que 100 E houver cupom ativo
            // aplica desconto no frete
        } else if (valorCompra > 100.0 && cupomDescontoAtivo) {
            System.out.println("Frete com 50% de desconto aplicado.");

            // Caso nenhuma das condições anteriores seja atendida
            // aplica o frete normal
        } else {
            System.out.println("Frete padrão calculado para o seu endereço.");
        }
    }
}