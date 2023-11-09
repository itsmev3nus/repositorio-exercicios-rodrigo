package exercicio;

import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        int tamanho = 6;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String input = JOptionPane.showInputDialog("Digite o valor do elemento " + (i + 1));
            vetorA[i] = Integer.parseInt(input);
        }

        for (int i = 0; i < tamanho; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("Vetor A: ");
        for (int valor : vetorA) {
            resultado.append(valor).append(" ");
        }
        resultado.append("\nVetor B: ");
        for (int valor : vetorB) {
            resultado.append(valor).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}