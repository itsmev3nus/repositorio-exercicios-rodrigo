package exercicio;

import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main(String[] args) {
     
        int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        StringBuilder mensagem = new StringBuilder("Valores do vetor A: ");
        for (int valor : A) {
            mensagem.append(valor).append(" ");
        }
        mensagem.append("\nValores do vetor B: ");
        for (int valor : B) {
            mensagem.append(valor).append(" ");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString(), "Valores dos Vetores", JOptionPane.INFORMATION_MESSAGE);
    }
}