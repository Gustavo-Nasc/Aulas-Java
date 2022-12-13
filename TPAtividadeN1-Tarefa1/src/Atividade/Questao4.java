package Atividade;

import javax.swing.JOptionPane;

public class Questao4 {

    public static void main(String[] args) {

        int quantidadePessoas = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Insira a quantidade de pessoas a serem inseridas:"
                )
        );

        int i = 1, quantidadeMulheres = 0, quantidadeHomens = 0;
        double mediaEstaturaMulheres = 0;

        while (i <= quantidadePessoas) {
            String sexo = JOptionPane.showInputDialog(null,
                    "Insira o sexo da " + i + "º Pessoa:"
                            + "\nF - Feminino"
                            + "\nM - Masculino"
            );

            if (sexo.equals("F")) {
                double altura = Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                                "Insira a altura da " + (quantidadeMulheres + 1) + "º Mulher"
                        )
                );

                mediaEstaturaMulheres+=altura;
                quantidadeMulheres++;

                i++;
            } else if (sexo.equals("M")) {
                quantidadeHomens++;

                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inserido inválido, tente novamente");
            }
        }

        mediaEstaturaMulheres = mediaEstaturaMulheres / quantidadeMulheres;

        JOptionPane.showMessageDialog(null,
                "A Média da Estatura das Mulheres é: " + mediaEstaturaMulheres
                        + "\nQuantidade de Homens: " + quantidadeHomens
        );
    }

}
