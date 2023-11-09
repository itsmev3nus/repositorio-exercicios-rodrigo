package exercicio;

import javax.swing.JOptionPane;

public class exercicio8 {
    public static void main(String[] args) {
        double[][] matriz = new double[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog("Digite um valor double:");
                try {
                    double valor = Double.parseDouble(input);
                    matriz[i][j] = valor;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor double válido.");
                    j--;  
                }
            }
        }

        String output = "Matriz de dimensões 2x5:\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                output += matriz[i][j] + "\t";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}