package exercicio;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class exercicio7 {
    public static void main(String[] args) {
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor inteiro:");
            valores[i] = Integer.parseInt(input);
        }

        Arrays.sort(valores);

        StringBuilder resultado = new StringBuilder("Valores em ordem crescente: ");
        for (int valor : valores) {
            resultado.append(valor).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}