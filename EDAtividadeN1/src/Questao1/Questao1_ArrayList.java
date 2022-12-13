package Questao1;

import java.text.DecimalFormat;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Questao1_ArrayList {

    public static void main(String[] args) throws Exception {
        // Criar um programa com uma aplicação prática utilizando a estrutura de vetor usando a classe ArrayList;
        // (Desenvolver o código em Java e inserir comentários).

        // Criação da variável 'arrayList', que é uma instância do ArrayList
        ArrayList<Double> arrayList = new ArrayList<Double>();

        // Criação de variaveis 'conditional', que é responsável pelos processos de validação (if-else) da aplicação
        String conditional;

        // Criação da variável 'position', que é responsável por receber um valor inteiro, uma posição no vetor
        int position;

        // Criação da variável 'stackable', que é responsável pelos processos de acúmulo de valores (Double) da aplicação
        // Criação da variável 'value', que é responsável por receber os valores que o usuário inserir
        // Criação da variável 'newValue', que é responsável por receber novos valores que o usuário inserir
        double stackable = 0, value, newValue;

        // Criação de uma instância do 'DecimalFormat, para a formatação de números decimais
        DecimalFormat df = new DecimalFormat("######.##");

        // Mensagem inicial ao usuário
        JOptionPane.showMessageDialog(null,
                "Olá, seja bem vinda a sua Lista de Valores!"
                        + "\n\nAh, só informando, eu criei uma Lista de valores decimais (Double) para você!"
        );

        do {
            conditional = JOptionPane.showInputDialog(null,
                    "Selecione uma das opções abaixo:"
                            + "\n1 - Inserir um valor"
                            + "\n2 - Inserir um valor em determinada posição"
                            + "\n3 - Remover um valor"
                            + "\n4 - Procurar a posição de determinado valor"
                            + "\n5 - Verificar o tamanho da Lista"
                            + "\n6 - Verificar o valor total até o momento"
                            + "\n7 - Visualizar Lista"
                            + "\n8 - Substituir um elemento da Lista"
                            + "\n9 - Limpar a lista (Irreversível)"
                            + "\n0 - Sair"
            );

            if (conditional.equals("1")) {
                // Caso a opção seja '1', ou seja, 'Inserir um valor'
                // Um laço de repetição para inserir valores até o usuário não desejar mais inserir
                do {
                    // Leitura do 'value'
                    value = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Insira o valor:"
                            )
                    );

                    // Adicionar o valor ao vetor
                    arrayList.add(value);

                    // Incremental a variável 'stackable'
                    stackable+=value;

                    do {
                        conditional = JOptionPane.showInputDialog(null,
                                "Deseja inserir mais algum valor?"
                                        + "\n1 - Sim"
                                        + "\n2 - Não"
                        );

                        if (!(conditional.equals("1") || conditional.equals("2")))
                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    } while (!(conditional.equals("1") || conditional.equals("2")));

                } while (conditional.equals("1"));

            } else if (conditional.equals("2")) {
                // Caso a opção seja '2', ou seja, 'Inserir um valor em uma posição especifica'
                // Um laço de repetição para inserir valores até o usuário não desejar mais inserir
                do {
                    // Leitura do 'value'
                    value = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Insira o valor:"
                            )
                    );

                    // Leitura da 'position'
                    position = Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                                    "Insira a posição:"
                            )
                    );

                    // Tratamento de Erros
                    try {
                        // Adicionar o valor ao vetor na posição específica
                        arrayList.add(position, value);

                        // Incremental a variável 'stackable'
                        stackable+=value;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível adicionar um elemento na posição desejada, tente novamente!");
                    }

                    do {
                        conditional = JOptionPane.showInputDialog(null,
                                "Deseja inserir mais algum valor?"
                                        + "\n1 - Sim"
                                        + "\n2 - Não"
                        );

                        if (!(conditional.equals("1") || conditional.equals("2")))
                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    } while (!(conditional.equals("1") || conditional.equals("2")));

                } while (conditional.equals("1"));

            } else if (conditional.equals("3")) {
                // Caso a opção seja '3', ou seja, 'Remover um valor'
                // Um laço de repetição para inserir valores até o usuário não desejar mais remover
                do {
                    // Leitura do 'value'
                    value = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Insira o valor a ser removido:"
                            )
                    );

                    if (arrayList.contains(value)) {
                        // Remover o valor do vetor
                        arrayList.remove(value);

                        // Substratir da variável 'stackable'
                        stackable-=value;

                        JOptionPane.showMessageDialog(null, "Valor removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não encontrado, tente novamente");
                    }


                    do {
                        conditional = JOptionPane.showInputDialog(null,
                                "Deseja remover mais algum valor?"
                                        + "\n1 - Sim"
                                        + "\n2 - Não"
                        );

                        if (!(conditional.equals("1") || conditional.equals("2")))
                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    } while (!(conditional.equals("1") || conditional.equals("2")));

                } while (conditional.equals("1"));

            } else if (conditional.equals("4")) {
                // Caso a opção seja '4', ou seja, 'Procurar a posição de determinado valor'
                // Um laço de repetição para inserir valores até o usuário não desejar mais verificar
                do {
                    // Leitura do 'value'
                    value = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Insira o valor a ser procurado:"
                            )
                    );

                    if (arrayList.contains(value)) {
                        JOptionPane.showMessageDialog(null, "Valor encontrado na posição " + arrayList.indexOf(value));
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não encontrado, tente novamente");
                    }


                    do {
                        conditional = JOptionPane.showInputDialog(null,
                                "Deseja procurar mais algum valor?"
                                        + "\n1 - Sim"
                                        + "\n2 - Não"
                        );

                        if (!(conditional.equals("1") || conditional.equals("2")))
                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    } while (!(conditional.equals("1") || conditional.equals("2")));

                } while (conditional.equals("1"));

            } else if (conditional.equals("5")) {
                // Caso a opção seja '5', ou seja, 'Verificar o tamanho da lista'

                // É exibida uma mensagem ao usuário, informando o tamanho da lista
                JOptionPane.showMessageDialog(null, "Tamanho da lista: " + arrayList.size() + " valor(es)");
            } else if (conditional.equals("6")) {
                // Caso a opção seja '6', ou seja, 'Verificar o valor total até o momento'

                // É exibida uma mensagem ao usuário, informando o valor total
                JOptionPane.showMessageDialog(null, "Soma dos valores até o momento: " + df.format(stackable));
            } else if (conditional.equals("7")) {
                // Caso a opção seja '7', ou seja, 'Visualizar Lista'

                // É exibida a Lista
                JOptionPane.showMessageDialog(null,
                        "Lista:\n"
                                + formatArrayList(arrayList)
                );
            } else if (conditional.equals("8")) {
                do {
                    // Caso a opção seja '8', ou seja, 'Substituir um elemento da Lista'

                    // É lida a 'position' do elemento que ele deseja substituir
                    value = Double.parseDouble(
                            JOptionPane.showInputDialog(null,
                                    "Insira o elemento a ser substituido:"
                            )
                    );

                    // Verificação para verificar se o 'arrayList' possui o 'value'
                    if (arrayList.contains(value)) {
                        // Caso contenha, é exibida a posição do elemento
                        JOptionPane.showMessageDialog(null, value + " encontrado na " + (arrayList.indexOf(value) + 1) + "º posição");

                        // E é verificado se é esse mesmo o valor que o usuário deseja alterar
                        do {
                            conditional = JOptionPane.showInputDialog(null,
                                    "É esse o valor que deseja alterar?"
                                            + "\n1 - Sim"
                                            + "\n2 - Não"
                            );

                            if (!(conditional.equals("1") || conditional.equals("2")))
                                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                        } while (!(conditional.equals("1") || conditional.equals("2")));

                        // O processo de alteração só ocorrerá caso o usuário digite '1'
                        if (conditional.equals("1")) {
                            // Caixa de Diálogo, pedindo um novo valor ao usuário
                            newValue = Double.parseDouble(
                                    JOptionPane.showInputDialog(null,
                                            "Insira o novo valor a ser inserido na " + (arrayList.indexOf(value) + 1) + "º Posição"
                                                    + "\nLembrando que o valor anterior nessa posição é: " + value
                                    )
                            );

                            // 'Setando' um novo valor na posição correspondente
                            arrayList.set(arrayList.indexOf(value), newValue);

                            // Caixa de Diálogo, informando que o processo ocorreu com êxito
                            JOptionPane.showMessageDialog(null, "Valor alterado com sucesso");
                        }

                    } else {
                        // Caso não contenha, é exibida uma mensagem informando que o valor não foi encontrado
                        JOptionPane.showMessageDialog(null, "Valor não encontrado, tente novamente");
                    }

                    do {
                        conditional = JOptionPane.showInputDialog(null,
                                "Deseja substituir mais algum valor?"
                                        + "\n1 - Sim"
                                        + "\n2 - Não"
                        );

                        if (!(conditional.equals("1") || conditional.equals("2")))
                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                    } while (!(conditional.equals("1") || conditional.equals("2")));

                } while (conditional.equals("1"));

            } else if (conditional.equals("9")) {
                // Caso a opção seja '9', ou seja, 'Limpar a lista'

                // A lista é limpa
                arrayList.clear();

                // E é exibido que foi limpo com sucesso
                JOptionPane.showMessageDialog(null, "Lista limpa com sucesso");

                // E a 'stackable' é zerada
                stackable = 0;
            } else if (conditional.equals("0")) {
                // Caso a opção seja '0', ou seja, 'Sair'

                // É exibida a mensagem de agradecimento
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar!");
            } else {
                // Caso não seja nenhuma das opções selecionadas

                // É exibida uma 'Mensagem de Erro'
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
            }

        } while (!conditional.equals("0"));

    }

    public static String formatArrayList(ArrayList<Double> arrayList) {
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("######.##");

        int j = 1;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                sb.append(j +"º Linha:\n");
                j++;
            }

            sb.append(df.format(arrayList.get(i)));

            if (i % 14 == 0 && i != 0) {
                sb.append(";");
                sb.append("\n\n" + j + "º Linha:\n");
                j++;
            } else {
                if (i == arrayList.size() - 1)
                    sb.append(".");
                else
                    sb.append(", ");
            }

        }

        return sb.toString();

    }

}