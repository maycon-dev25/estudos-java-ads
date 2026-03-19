// Classe responsável por demonstrar operadores lógicos
public class OperadoresLogicos {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Declaração de duas variáveis booleanas
        boolean x = true;
        boolean y = false;

        // Operador lógico AND (&&)
        // Retorna true apenas se ambos forem true
        System.out.println(x && y); // false

        // Operador lógico OR (||)
        // Retorna true se pelo menos um for true
        System.out.println(x || y); // true

        // Operador lógico NOT (!)
        // Inverte o valor lógico (true vira false)
        System.out.println(!x); // false

        // Inverte o valor de y (false vira true)
        System.out.println(!y); // true
    }
}