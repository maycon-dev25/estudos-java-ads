// Classe responsável por demonstrar algumas operações com Strings
public class TrabalhandoComStrings {

    // Método principal onde o programa começa a execução
    public static void main(String[] args) {

        // Declaração de uma String com o nome "Joana"
        String nome = "Joana";

        // Declaração de outra String com o nome "João"
        String nomeDois = "João";

        // String contendo o sobrenome que será usado para formar o nome completo
        String sobrenome = " De Souza.";

        // Método length() retorna a quantidade de caracteres da String "nome"
        int tamanhoString = nome.length();

        // Método equals() compara duas Strings para verificar se possuem exatamente o mesmo conteúdo
        boolean saoIguais = nome.equals(nomeDois);

        // Método concat() junta duas Strings formando uma nova String
        // Aqui está formando o nome completo de Joana
        String nomeCompletoJoana = nome.concat(sobrenome);

        // Aqui está formando o nome completo de João
        String nomeCompletoJoao = nomeDois.concat(sobrenome);

        // Exibe uma mensagem de saudação e informa quantos caracteres o nome possui
        System.out.println("Olá, " + nome + "!" + " Seu nome tem " + tamanhoString + " caracteres.");

        // Exibe no console se os dois nomes são iguais ou não
        System.out.println("Os nomes são iguais? " + saoIguais);

        // Exibe os nomes completos formados pela concatenação do nome com o sobrenome
        System.out.println("Nome Completo: " + nomeCompletoJoana + " Nome completo: " + nomeCompletoJoao);
    }
}