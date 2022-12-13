package Questao2;

import javax.swing.JOptionPane;

public class Questao2_Pilha {

    public static void main(String[] args) {
        // Instância de uma nova Pilha, que será o Extrato Bancário
        Pilha extratoBancario = new Pilha();

        // Variável 'condicional', para as verificações nos processos condicionais
        String condicao;

        // Mensagens iniciais para o Usuário
        JOptionPane.showMessageDialog(null, "Olá, bem vindo ao seu banco digital!");
        JOptionPane.showMessageDialog(null, "Pelo visto, você é novo por aqui.\n\n Faça seu cadastro!");
        String nomeTitular = JOptionPane.showInputDialog("Insira seu nome:");

        // É criada a Conta Corrente, com o novo nome inserido
        ContaCorrente contaCorrente = new ContaCorrente(nomeTitular);

        JOptionPane.showMessageDialog(null,
                "Conta criada com sucesso!\n\n"
                        + contaCorrente.getAccountData()
                        + "\nLimite: R$ 3.000,00"
        );

        do {
            condicao = JOptionPane.showInputDialog(
                    "Olá, " + nomeTitular + ", o que deseja fazer?"
                            + "\n\n1 - Realizar Depósito"
                            + "\n2 - Realizar Saque"
                            + "\n3 - Visualizar Última Transação"
                            + "\n4 - Visualizar Extrato Completo"
                            + "\n5 - Visualizar Dados da C/C"
                            + "\n0 - Sair"
            );

            if (condicao.equals("1")) {
                // Caso o usuário deseje realizar um Depósito
                // É pedido o valor que ele deseja depositar
                double valor = Double.parseDouble(
                        JOptionPane.showInputDialog("Insira o valor a ser depositado:")
                );

                // É inserido na Conta
                JOptionPane.showMessageDialog(null, contaCorrente.deposit(valor));

                // E é inserido na Pilha (Extrato), com a exibição de mensagem
                extratoBancario.push(valor);
            } else if (condicao.equals("2")) {
                // Caso o usuário deseje realizar um Saque
                // É pedido o valor que ele deseja sacar
                double valor = Double.parseDouble(
                        JOptionPane.showInputDialog("Insira o valor a ser sacado (Ex: -50.00):")
                );

                if (valor > 0) {
                    JOptionPane.showMessageDialog(null, "Insira um valor com um número negativo");
                } else {
                    // É sacado da conta
                    JOptionPane.showMessageDialog(null, contaCorrente.withdraw(valor));

                    // E é inserido na Pilha (Extrato), com a exibição de mensagem
                    extratoBancario.push(valor);
                }

            } else if (condicao.equals("3")) {
                // Caso o Usuário deseje visualizar a última transação

                // É exibida a última transação
                if (extratoBancario.peek() == -3000.01) {
                    JOptionPane.showMessageDialog(null, "Ainda não possui transações...");
                } else if (extratoBancario.peek() > 0) {
                    JOptionPane.showMessageDialog(null, "Última Transação:\n\nDepósito: R$ " + extratoBancario.peek());
                } else {
                    JOptionPane.showMessageDialog(null, "Última Transação:\n\nSaque: R$ " + extratoBancario.peek());
                }
            } else if (condicao.equals("4")) {
                // Caso o Usuário deseje visualizar o Extrato Completo

                // É exibido o Extrato Completo
                JOptionPane.showMessageDialog(null, "Transações:\n\n" + extratoBancario.toString());
            } else if (condicao.equals("5")) {
                // Caso o Usuário deseje visualizar os Dados da Conta

                // Os dados São exibidos
                JOptionPane.showMessageDialog(null,
                        "Dados da conta:\n\n"
                                + contaCorrente.getAccountData()
                                + "\nLimite: R$ 3.000,00"
                );
            } else if (condicao.equals("0")) {
                // Caso o usuário opte por encerrar a aplicação, é exibida a mensagem de agracimento
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar e testar o App!");
            } else {
                // Caso o usuáio tenha inserido uma opção inválida, é exibida uma mensagem de "erro"
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
            }
        } while(!condicao.equals("0")); // Para o usuário finalizar o programa, basta ele digitar '0' nas opções

    }

}