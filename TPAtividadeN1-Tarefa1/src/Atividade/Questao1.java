package Atividade;

import javax.swing.JOptionPane;

public class Questao1 {
    public static void main(String[] args) {

        double media = 0;
        int j = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite quantos valores deseja inserir:"
                )
        );


        for (int i = 1; i <= j; i++) {
            double valor = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "\nDigite o " + i + "º Valor: "
                    )
            );

            media += valor;
        }

        media /= j;

        JOptionPane.showMessageDialog(null, "\nA média é: " + media);
    }

}
