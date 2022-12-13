package Atividade;

import javax.swing.JOptionPane;

public class Questao3 {

    public static void main(String[] args) {

        int j = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite quantos valores deseja inserir:"
                )
        );

        int quantidadeNumerosPositivos = 0, quantidadeNumerosNegativos = 0;
        double menorValor = 0;

        for (int i = 1; i <= j; i++) {
            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Insira o " + i + "º Valor:"
                    )
            );

            if (valor < 0)
                quantidadeNumerosNegativos++;
            else if (valor > 0)
                quantidadeNumerosPositivos++;

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Quantidade de Números Negativos: " + quantidadeNumerosNegativos +
                        "\nQuantidade de Números Positivos: " + quantidadeNumerosPositivos +
                        "\nMenor Valor Inserido: " + menorValor
        );

    }

}
