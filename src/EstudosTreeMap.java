// Importa as classes necessárias para trabalhar com TreeMap
import java.util.Map;
import java.util.TreeMap;

// Classe responsável por demonstrar o uso de TreeMap (mapa ordenado)
public class EstudosTreeMap {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria um TreeMap onde:
        // String = nome do aluno (chave)
        // Double = nota do aluno (valor)
        // O TreeMap mantém as chaves automaticamente ordenadas (ordem alfabética)
        TreeMap<String, Double> notasAlunos = new TreeMap<>();

        // Adiciona pares chave-valor ao mapa
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Mateus", 8.0);
        notasAlunos.put("Maria", 9.9);

        // Iteração usando keySet():
        // Percorre apenas as chaves (nomes), já em ordem
        for (String nome : notasAlunos.keySet()) {

            // Recupera a nota correspondente à chave
            double nota = notasAlunos.get(nome);

            // Exibe nome e nota
            System.out.println(nome + " : " + nota);
        }

        // Iteração usando entrySet():
        // Percorre chave e valor ao mesmo tempo (forma mais eficiente)
        for (Map.Entry<String, Double> entrada : notasAlunos.entrySet()) {

            // Obtém a chave (nome)
            String nome = entrada.getKey();

            // Obtém o valor (nota)
            double valorNota = entrada.getValue();

            // Exibe nome e nota
            System.out.println(nome + " : " + valorNota);
        }

        // Exibe a primeira chave do mapa (ordem alfabética)
        System.out.println("Primeira chave: " + notasAlunos.firstKey());

        // Exibe a última chave do mapa (ordem alfabética)
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}