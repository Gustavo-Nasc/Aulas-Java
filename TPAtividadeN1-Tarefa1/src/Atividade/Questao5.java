package Atividade;

import javax.swing.JOptionPane;

public class Questao5 {

    public static void main(String[] args) {
        double mediaTurma = 0, mediaAluno = 0, maiorMedia = 0, menorMedia = 10;
        int quantidadeNotas = 0, i = 1;

        while (mediaAluno >= 0) {
            mediaAluno = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Insira a " + i + "º Média:"
                    )
            );

            if (mediaAluno < 0) {
                break;
            }

            mediaTurma = mediaTurma + mediaAluno;

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
            }

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
            }

            quantidadeNotas++;

            i++;
        }

        mediaTurma = mediaTurma / quantidadeNotas;

        JOptionPane.showMessageDialog(null,
                "A Média Aritmétrica da turma é: " + mediaTurma +
                        "\nA Maior Nota inserida foi: " + maiorMedia +
                        "\nA Menor Nota inserida foi: " + menorMedia
        );
    }

}
