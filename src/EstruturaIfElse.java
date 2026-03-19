// Classe responsável por demonstrar estruturas condicionais (if, else if, else)
public class EstruturaIfElse {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

//        // Exemplo 1: Verificação de idade
//        int idade = 20;
//
//        // Se a idade for maior ou igual a 18
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade.");
//        } else {
//            // Caso contrário
//            System.out.println("Você é menor de idade.");
//        }
//
//        // Exemplo 2: Verificação de clima
//        boolean estaChovendo = true;
//
//        // Se NÃO estiver chovendo
//        if (!estaChovendo) {
//            System.out.println("Vamos sair para passear.");
//        } else {
//            // Caso esteja chovendo
//            System.out.println("Vamos ficar em casa.");
//        }

        // Variáveis que representam formas de pagamento
        boolean temDinheiro = true;
        boolean temCartao = true;

        // Se tiver dinheiro E cartão
        if (temDinheiro && temCartao) {
            System.out.println("Peça um iFood e um Zé Delivery.");

            // Se tiver dinheiro OU cartão
        } else if (temDinheiro || temCartao) {
            System.out.println("Peça um iFood.");

            // Caso não tenha nenhum dos dois
        } else {
            System.out.println("Não peça nada.");
        }
    }
}