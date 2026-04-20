package revisao.logica;

public class ContadorLegPress {
    public static void main(String[] args) {
//        for (int i = 1; i <= 12; i++) {
//            System.out.println("Repetição nº " + i);
//        }
        int repeticao = 1;

        while (repeticao <= 12) {
            System.out.println("Repetição nº " + repeticao);
            repeticao++;
        }
        System.out.println("Série concluída! Descanso de 60 segundos.");
    }
}