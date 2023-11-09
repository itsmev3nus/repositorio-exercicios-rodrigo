package exercicio;

import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] + B[i];
        }

        StringBuilder output = new StringBuilder("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            output.append(A[i]).append(" ");
        }

        output.append("\nVetor B: ");
        for (int i = 0; i < 10; i++) {
            output.append(B[i]).append(" ");
        }

        output.append("\nVetor C: ");
        for (int i = 0; i < 10; i++) {
            output.append(C[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}