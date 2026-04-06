// Importa as classes necessárias para trabalhar com listas
import java.util.ArrayList;
import java.util.List;

// Classe responsável por demonstrar o uso de ArrayList
public class EstudosArrayList {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Cria uma lista de Strings (lista de compras)
        List<String> listaDeCompras = new ArrayList<>();

        // Adiciona itens à lista
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");

//        // Iteração simples com for-each (comentado)
//        for (String item : listaDeCompras) {
//            System.out.println(item);
//        }

        // Adiciona um item em uma posição específica (índice 1)
        listaDeCompras.add(1, "Banana");

        // Percorre a lista e exibe os itens
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        // Obtém o item da posição 3 da lista
        String item = listaDeCompras.get(3);

        // Exibe o item encontrado na posição 3
        System.out.println("Na posição 3, eu tenho: " + item + ".");

        // Remove um item pelo valor
        listaDeCompras.remove("Sabão em pó");

        // Percorre novamente a lista após remoção
        for (String item2 : listaDeCompras) {
            System.out.println(item2);
        }

        // Verifica se a lista está vazia
        boolean eVazia = listaDeCompras.isEmpty();

        // Obtém o tamanho da lista
        int tamanho = listaDeCompras.size();

        // Verifica se a lista contém um determinado item
        boolean contem = listaDeCompras.contains("Arroz");

        // Exibe informações sobre a lista
        System.out.println("A lista está vazia? " + eVazia
                + ", qual o tamanho da lista? " + tamanho
                + ", a lista contém o item Arroz? " + contem + ".");

//        // Limpa todos os elementos da lista (comentado)
//        listaDeCompras.clear();
//        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        // Percorre a lista usando forEach com expressão lambda
        listaDeCompras.forEach(produto -> System.out.println(produto));
    }
}