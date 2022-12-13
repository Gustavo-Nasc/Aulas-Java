package Atividade;

import javax.swing.JOptionPane;

public class Questao7 {

    public static void main(String[] args) {

        int quantidadeVotos1 = 0,
                quantidadeVotos2 = 0,
                quantidadeVotos3 = 0,
                quantidadeVotos4 = 0,
                quantidadeVotosNulos = 0,
                quantidadeVotosBranco = 0,
                voto;

        do {
            voto = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "Insira o seu voto:"
                                    + "\n1 - Candidato 1"
                                    + "\n2 - Candidato 2"
                                    + "\n3 - Candidato 3"
                                    + "\n4 - Candidato 4"
                                    + "\n5 - Voto Nulo"
                                    + "\n6 - Voto em Branco"
                    )
            );

            switch (voto) {
                case 1:
                    quantidadeVotos1++;
                    break;
                case 2:
                    quantidadeVotos2++;
                    break;
                case 3:
                    quantidadeVotos3++;
                    break;
                case 4:
                    quantidadeVotos4++;
                    break;
                case 5:
                    quantidadeVotosNulos++;
                    break;
                case 6:
                    quantidadeVotosBranco++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
            }

            if (voto == 1 || voto == 2 || voto == 3 || voto == 4 || voto == 5 || voto == 6) {
                JOptionPane.showMessageDialog(null, "Voto inserido com sucesso");
            }

        } while(voto != 0);

        JOptionPane.showMessageDialog(null,
                "\nTotal de Votos para o Candidato 1: " + quantidadeVotos1 +
                        "\nTotal de Votos para o Candidato 2: " + quantidadeVotos2 +
                        "\nTotal de Votos para o Candidato 3: " + quantidadeVotos3 +
                        "\nTotal de Votos para o Candidato 4: " + quantidadeVotos4 +
                        "\nTotal de Votos para o Candidato 4: " + quantidadeVotos4 +
                        "\nTotal de Votos Nulos: " + quantidadeVotosNulos +
                        "\nTotal de Votos em Branco: " + quantidadeVotosBranco
        );
    }

}
