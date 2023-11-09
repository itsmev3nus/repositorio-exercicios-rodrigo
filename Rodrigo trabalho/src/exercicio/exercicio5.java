package exercicio;

import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {
        int numAlunos = 10;
        double[] Nota1 = new double[numAlunos];
        double[] Nota2 = new double[numAlunos];
        String[] Result = new String[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            Nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno " + (i + 1) + ":"));
            Nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno " + (i + 1) + ":"));

            double media = (Nota1[i] + Nota2[i]) / 2;
            if (media >= 7) {
                Result[i] = "Aprovado";
            } else {
                Result[i] = "Reprovado";
            }
        }

        StringBuilder resultadoFinal = new StringBuilder("Resultados dos Alunos:\n");
        for (int i = 0; i < numAlunos; i++) {
            resultadoFinal.append("Aluno " + (i + 1) + ": Média = " + (Nota1[i] + Nota2[i]) / 2 + ", Situação = " + Result[i] + "\n");
        }

        JOptionPane.showMessageDialog(null, resultadoFinal.toString());
    }
}