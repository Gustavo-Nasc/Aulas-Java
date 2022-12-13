package Atividade;

import javax.swing.JOptionPane;

public class Questao8 {

    public static void main(String[] args) {

        int maiorIdade = 0, quantidadeFeminino = 0, idade = 0;
        String sexo, corOlhos, corCabelo;

        // Para testar o código, altere de 500 para 3 ou um outro valor menor
        for(int i = 1; i <= 500; i++) {
            do {
                sexo = JOptionPane.showInputDialog(null,
                        "Insira o sexo da " + i + "º Pessoa:"
                                + "\n\nF - Feminino"
                                + "\nM - Masculino"
                );

                if (!(sexo.equals("F") || sexo.equals("M")))
                    JOptionPane.showMessageDialog(null, "Sexo inserido inválido, tente novamente\n");

            } while (!(sexo.equals("F") || sexo.equals("M")));

            do {
                corOlhos = JOptionPane.showInputDialog(null,
                        "Insira a Cor dos Olhos da " + i + "º Pessoa:"
                                + "\n\nA - Azuis"
                                + "\nV - Verdes"
                                + "\nC - Castanhos"
                );

                if (!(corOlhos.equals("A") || corOlhos.equals("V") || corOlhos.equals("C")))
                    System.out.println("Cor dos Olhos inválida, tente novamente\n");

            } while (!(corOlhos.equals("A") || corOlhos.equals("V") || corOlhos.equals("C")));

            do {
                corCabelo = JOptionPane.showInputDialog(null,
                        "Insira a Cor do Cabelo da " + i + "º Pessoa:"
                                + "\n\nL - Louros"
                                + "\nC - Castanhos"
                                + "\nP - Pretos"
                );

                if (!(corCabelo.equals("L") || corCabelo.equals("C") || corCabelo.equals("P")))
                    JOptionPane.showMessageDialog(null, "Cor de Cabelo inválida, tente novamente\n");

            } while (!(corCabelo.equals("L") || corCabelo.equals("C") || corCabelo.equals("P")));

            idade = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Insira a idade da " + i + "º Pessoa"
                    )
            );

            if(idade >= 18 && idade <= 35 && sexo.equals("F") && corOlhos.equals("V") && corCabelo.equals("L"))
                quantidadeFeminino++;

            if (idade > maiorIdade)
                maiorIdade = idade;
        }

        JOptionPane.showMessageDialog(null,
                "\nMaior Idade do grupo: " + maiorIdade +
                        "\n\nQuantidade de pessoas que atendem aos critérios:" +
                        "\n- Sexo Feminino" +
                        "\n- Idade entre 18 e 35 anos" +
                        "\n- Olhos Verdes" +
                        "\n- Cabelos Louros" +
                        "\n" + quantidadeFeminino + " Pessoa(s)"
        );
    }
}
