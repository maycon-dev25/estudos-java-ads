// Classe responsável por demonstrar estruturas condicionais (if, else if, else e operador ternário)
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

        // Se tiver dinheiro E cartão, pode pedir dois serviços
        if (temDinheiro && temCartao) {
            System.out.println("Peça um iFood e um Zé Delivery.");

            // Se tiver dinheiro OU cartão, pode pedir apenas um
        } else if (temDinheiro || temCartao) {
            System.out.println("Peça um iFood.");

            // Caso não tenha nenhum dos dois
        } else {
            System.out.println("Não peça nada.");
        }

        // Operador ternário:
        // Forma reduzida de escrever um if/else simples
        String mensagem = temDinheiro ? "Peça um iFood." : "Coma o que tem em casa.";

        // Exibe o resultado do operador ternário
        System.out.println(mensagem);

        // Estrutura equivalente ao operador ternário acima
        if (temDinheiro) {
            System.out.println("Peça um iFood.");
        } else {
            System.out.println("Coma o que tem em casa.");
        }
    }
}