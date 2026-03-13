public class OperadoresAritmeticos {

    // Método principal onde o programa começa a ser executado
    public static void main(String[] args) {

        // Valores dos produtos
        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;

        // Valor do desconto aplicado na compra
        double desconto = 5.00;

        // Quantidade de dias do mês
        int totalDiasDoMes = 30;

        // Número usado para dividir o valor final
        double divisao = 3;

        // Soma do valor dos produtos
        double somar = pao + queijo + acucar;

        // Valor total da compra após aplicar o desconto
        double valorComDesconto = somar - desconto;

        // Divide o valor com desconto pelo número definido na variável "divisao"
        double dividido = valorComDesconto / divisao;

        // Calcula quanto seria gasto no mês inteiro considerando o valor com desconto
        double valorMensal = valorComDesconto * totalDiasDoMes;

        // Exibe no console o resultado da divisão do valor final
        System.out.println("Valor total = R$" + dividido);
    }
}
