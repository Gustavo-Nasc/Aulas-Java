package Atividade;

import javax.swing.JOptionPane;

public class Questao2 {

    public static void main(String[] args) {

        int i = 1;
        double media = 0, maiorValor = 0;

        int j = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite quantos valores deseja inserir:"
                )
        );


        while (i <= j) {
            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Insira o " + i + "º Valor:"
                    )
            );

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            media += valor;

            i++;
        }

        media /= j;

        JOptionPane.showMessageDialog(null,
                "A média dos valores é: " + media
                        + "\nO maior valor inserido foi: " + maiorValor
        );

    }

}
