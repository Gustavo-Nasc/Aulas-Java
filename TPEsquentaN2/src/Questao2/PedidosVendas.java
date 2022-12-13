// Autor: Gustavo Nascimento Souza
// 2º Desenvolvimento de Sistemas - Manhã

package Questao2;

import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class PedidosVendas {

    public static void main(String[] args) {
        // Condicional
        String condicao;

        // Contador
        int i = 0;

        // Valores a serem apresentados
        double valorVendasBruto = 0, comissao, valorVendasLiquido;

        // Vetores
        int vetNumerosPedidos[] = new int[0];
        double vetValoresPedidos[] = new double[0];

        // Decimal Format
        DecimalFormat df = new DecimalFormat("######.##");

        do {
            condicao = JOptionPane.showInputDialog(
                    "Selecione uma das opções:\n\n"
                            + "1 - Registrar Venda\n"
                            + "2 - Visualizar valores de vendas\n"
                            + "0 - Sair"
            );

            if (condicao.equals("1")) {
                int numeroPedido = new Random().nextInt(10000, 99999);
                String nomeVendedor = JOptionPane.showInputDialog("Insira o nome do Vendedor:");
                String nomeCliente = JOptionPane.showInputDialog("Insira o nome do Cliente:");
                float valorPedido = Float.parseFloat(
                        JOptionPane.showInputDialog("Insira o valor do Pedido:")
                );

                double vetNovosValoresPedidos[] = new double[vetValoresPedidos.length + 1];
                int vetNovosNumerosPedidos[] = new int[vetNumerosPedidos.length + 1];

                for (int j = 0; j < vetValoresPedidos.length; j++) {
                    vetNovosValoresPedidos[j] = vetValoresPedidos[j];
                    vetNovosNumerosPedidos[j] = vetNumerosPedidos[j];
                }

                vetNumerosPedidos = vetNovosNumerosPedidos;
                vetValoresPedidos = vetNovosValoresPedidos;

                // Adicionando o valor inserido ao Valor Bruto de Vendas
                valorVendasBruto += valorPedido;

                // Inserindo o valor no Vetor
                vetValoresPedidos[i] = valorPedido;
                vetNumerosPedidos[i] = numeroPedido;
                i++;

                JOptionPane.showMessageDialog(
                        null,
                        "Número do Pedido (id): " + numeroPedido + "\n"
                                + "Vendedor: " + nomeVendedor + "\n"
                                + "Cliente: " + nomeCliente + "\n"
                                + "Valor do Pedido: R$ " + df.format(valorPedido),
                        (i + 1) + "º Pedido", // Título do MessageDialog
                        1 // Tipo do MessageDialog (vai de 1 a 3)
                );

            } else if (condicao.equals("2")) {
                StringBuilder sb = new StringBuilder();

                sb.append("Pedidos\n\n");

                for(int j = 0; j < vetValoresPedidos.length; j++) {
                    sb.append(
                            "Número do Pedido: " + vetNumerosPedidos[j]
                                    + "\nValor do Pedido: " + df.format(vetValoresPedidos[j]) + "\n\n"
                    );
                }

                JOptionPane.showMessageDialog(null, sb.toString(), "Valores das Vendas", 1);
            } else if (condicao.equals("0")) {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar", "Obrigado!", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente", "Erro", 2);
            }

        } while (!condicao.equals("0"));

        comissao = (valorVendasBruto * 5) / 100;
        valorVendasLiquido = valorVendasBruto - comissao;

        JOptionPane.showMessageDialog(
                null,
                "Relatório Diário:\n\n"
                        + "Quantidade de Vendas: " + i
                        + "\nValor Bruto de Vendas: R$ " + df.format(valorVendasBruto)
                        + "\nValor de Comissão aos Funcionários: R$ " + df.format(comissao)
                        + "\nValor Líquido de Vendas: R$ " + df.format(valorVendasLiquido),
                "Relatório Diário",
                1
        );

    }

}
