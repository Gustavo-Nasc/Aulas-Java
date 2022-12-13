// Autor: Gustavo Nascimento Souza
// Feito: Com muito amor e carinho para Cláudio Benossi

package Atividade;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TPAtividadeN1_Tarefa2 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");

        int quantidadeDiasAcimaMedia = 0, quantidadeDiasAbaixoMedia = 0;

        int j = 1;

        double vetorTemperatura[] = new double[7];
        double mediaTemperatura = 0;

        for (int i = 0; i < 7; i++ ) {
            double temperatura = Double.parseDouble(
                    JOptionPane.showInputDialog(null,
                            "Insira a temperatura do " + j + "º dia:"
                    )
            );

            vetorTemperatura[i] = temperatura;

            mediaTemperatura+=temperatura;

            j++;
        }

        mediaTemperatura /= 7;

        for(int i = 0; i < 7; i++) {
            if (vetorTemperatura[i] > mediaTemperatura)
                quantidadeDiasAcimaMedia++;

            if (vetorTemperatura[i] < mediaTemperatura)
                quantidadeDiasAbaixoMedia++;
        }


        JOptionPane.showMessageDialog(null,
                "Média do período (Semanal): " + df.format(mediaTemperatura)
                        + "\nQuantidade de dias com Temperatura acima da média: " + quantidadeDiasAcimaMedia
                        + "\nQuantidade de dias com Temperatura abaixo da média: "+ quantidadeDiasAbaixoMedia
        );

    }

}
