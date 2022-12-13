package Atividade;

import javax.swing.JOptionPane;

public class Questao6 {

    public static void main(String[] args) {

        // Para testar o código, altere de 150 para 3 ou um outro valor menor
        for (int i = 1; i <= 150; i++) {
            String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do " + i + "º Cliente:");

            double valorPassadoCliente = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Digite o valor das compras de " + nomeCliente + " no ano passado:"
                    )
            );

            double valorCompraCliente = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Digite o valor atual de compra de " + nomeCliente + ":"
                    )
            );

            if (valorPassadoCliente < 500000) {
                JOptionPane.showMessageDialog(null,
                        nomeCliente + " possui um desconto de 10% para a compra atual:"
                                + "\nValor de Desconto: R$ " + (valorCompraCliente * 0.1)
                                + "\nValor Final: R$ " + (valorCompraCliente - (valorCompraCliente * 0.1))
                );
            } else {
                JOptionPane.showMessageDialog(null,
                        nomeCliente + " possui um desconto de 10% para a compra atual:"
                                + "\nValor de Desconto: R$ " + (valorCompraCliente * 0.15)
                                + "\nValor Final: R$ " + (valorCompraCliente - (valorCompraCliente * 0.15))
                );
            }
        }
    }

}
