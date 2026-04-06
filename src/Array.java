// Classe responsável por demonstrar o uso de arrays (vetores)
public class Array {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Declaração e inicialização de um array de inteiros
        int[] numeros = {10, 20, 30, 50, 1};

        // Declaração de um array de Strings (sem inicializar na mesma linha)
        String[] frutas;

        // Inicialização do array de frutas com valores
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};

        // Declaração de um array de double com tamanho fixo (5 posições)
        double[] salarios = new double[5];

        // Atribuição de valores em posições específicas do array
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

        // Iteração usando for tradicional (comentado)
//        for (int posicao = 0; posicao < salarios.length; posicao++) {
//            System.out.println(salarios[posicao]);
//        }

        // Iteração usando for-each (forma simplificada)
        for (double salario : salarios) {

            // Exibe cada valor do array
            System.out.println(salario);
        }

        // Alteração de valor em uma posição específica do array
        salarios[2] = 250.00;

        // Exibe o valor atualizado da posição 2
        System.out.println(salarios[2]);
    }
}
