// Autor: Gustavo Nascimento Souza
// 2º Desenvolvimento de Sistemas - Manhã

package Questao1;

import javax.swing.JOptionPane;

public class PesquisaLimitada {

    public static void main (String[] args) {
        // Declaração da Variável da quantidade do laço 'for'
        int quantidade;

        // Laço para verificar se a quantidade é maior do que 0.
        do {
            quantidade = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira a quantidade de pessoas que irão participar da pesquisa:")
            );

            if (quantidade <= 0)
                JOptionPane.showMessageDialog(null, "Quantidade inválida, tente novamente!");
        } while(quantidade <= 0);


        // Variáveis utilizadas para armazenar dados
        double vetorAlturas[] = new double[quantidade];
        double mediaAlturas = 0;
        int quantidadeMenorIdade = 0, quantidadeAcimaMedia = 0, quantidadeAbaixoMedia = 0;

        for (int i = 1; i <= quantidade; i++) {
            JOptionPane.showInputDialog("Insira o Nome da " + i + "º Pessoa");
            int idade = Integer.parseInt(
                    JOptionPane.showInputDialog("Insira a Idade da " + i + "º Pessoa")
            );
            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Insira a altura da " + i + "º Pessoa")
            );


            if(idade < 18) {
                quantidadeMenorIdade++;
            }

            vetorAlturas[i-1] = altura;
            mediaAlturas += altura;
        }

        mediaAlturas /= quantidade;

        for (int i = 0; i < quantidade; i++) {
            if (vetorAlturas[i] < mediaAlturas)
                quantidadeAbaixoMedia++;

            if (vetorAlturas[i] > mediaAlturas)
                quantidadeAcimaMedia++;
        }

        float porcentagem = (100 * quantidadeMenorIdade) / quantidade;

        JOptionPane.showMessageDialog(null,
                "Média das Alturas: " + mediaAlturas
                        + "\nNúmero de pessoas com altura abaixo da média: " + quantidadeAbaixoMedia
                        + "\nNúmero de pessoas com altura acima da média:" + quantidadeAcimaMedia
                        + "\nPorcentagem de pessoas menor de 18 anos: " + porcentagem + "%"
        );
    }

}