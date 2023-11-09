package exercicio;

public class exercicio4 {
    public static void main(String[] args) {
        int[] vetorA = {2, 5, 8, 12, 17, 24, 33, 40, 51, 62};
        int totalElementos = vetorA.length;
        int pares = 0;
        int impares = 0;

        for (int elemento : vetorA) {
            if (elemento % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double percentualPares = (pares * 100.0) / totalElementos;
        double percentualImpares = (impares * 100.0) / totalElementos;

        System.out.println("Percentual de elementos pares: " + percentualPares + "%");
        System.out.println("Percentual de elementos ímpares: " + percentualImpares + "%");
    }
}