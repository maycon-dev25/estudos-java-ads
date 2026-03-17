// Classe responsável por demonstrar conversões entre tipos de dados
public class ConversaoTipos {

    // Método principal - ponto inicial do programa
    public static void main(String[] args) {

        // Conversão implícita (int -> double)
        int numero = 10;
        double d = numero; // o int é convertido automaticamente para double

        // Conversão explícita (double -> int)
        double d2 = 10.5;
        int int2 = (int) d2; // perde a parte decimal (fica 10)

        // Wrapper Integer sendo convertido para String
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        // Wrapper Double sendo convertido para String
        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();

        // String sendo convertida para tipos numéricos
        String numeroStringDois = "1234";

        // Converte String para Integer
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);

        // Converte String para Double
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);

        // Converte String para Long
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);

        // ❌ ERRO CORRIGIDO:
        // Antes você declarou novamente "numeroInteger" como Long (nome duplicado)
        // Isso causa erro de compilação, então foi alterado o nome da variável

        // Wrapper Long
        Long numeroLong = 10L;

        // Converte Long para String
        String numeroStringLong = numeroLong.toString();

        // Exibe os resultados das conversões
        System.out.println(d); // resultado da conversão int -> double
        System.out.println(int2); // resultado da conversão double -> int
        System.out.println(numeroInteger + " " + numeroString); // Integer e sua String
        System.out.println(numeroStringDois + " " + numeroConvertido); // String e Integer convertido
    }
}