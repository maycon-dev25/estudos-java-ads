// Importa as classes necessárias para trabalhar com HashMap
import java.util.HashMap;
import java.util.Map;

// Classe responsável por demonstrar o uso de HashMap (estrutura chave-valor)
public class EstudoHashMap {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um HashMap onde:
        // String = nome do aluno (chave)
        // Double = nota do aluno (valor)
        HashMap<String, Double> notasAlunos = new HashMap<>();

        // Adiciona pares chave-valor ao mapa
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iteração usando keySet():
        // Percorre apenas as chaves (nomes)
        for (String nome : notasAlunos.keySet()) {

            // Recupera a nota correspondente à chave
            double nota = notasAlunos.get(nome);

            // Exibe nome e nota
            System.out.println(nome + " : " + nota);
        }

        // Iteração usando entrySet():
        // Percorre chave e valor ao mesmo tempo
        for (Map.Entry<String, Double> entrada : notasAlunos.entrySet()) {

            // Obtém a chave (nome)
            String nome = entrada.getKey();

            // Obtém o valor (nota)
            double valorNota = entrada.getValue();

            // Exibe nome e nota
            System.out.println(nome + " : " + valorNota);
        }

        // Recupera a nota de um aluno específico
        double notaAlice = notasAlunos.get("Alice");

        // Exibe a nota com correção de texto
        System.out.println("A nota da Alice é " + notaAlice);

        // Obtém o tamanho do HashMap (quantidade de elementos)
        int tamanhoHash = notasAlunos.size();

        // Remove um elemento pela chave
        notasAlunos.remove("Maria");

        // Exibe o tamanho atualizado do mapa após remoção
        System.out.println("Quantidade de alunos após remoção: " + notasAlunos.size());
    }
}