// Classe responsável por demonstrar expressões comparativas
public class ExpressoesComparativas {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Declaração de duas variáveis inteiras para comparação
        int pao = 10;
        int acucar = 20;

        // Verifica se os valores são iguais (==)
        System.out.println(pao == acucar); // false

        // Verifica se os valores são diferentes (!=)
        System.out.println(pao != acucar); // true

        // Verifica se "pao" é maior que "acucar" (>)
        System.out.println(pao > acucar); // false

        // Verifica se "pao" é menor que "acucar" (<)
        System.out.println(pao < acucar); // true

        // Verifica se "pao" é maior ou igual a "acucar" (>=)
        System.out.println(pao >= acucar); // false

        // Verifica se "pao" é menor ou igual a "acucar" (<=)
        System.out.println(pao <= acucar); // true
    }
}