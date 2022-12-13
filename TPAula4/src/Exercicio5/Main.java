package Exercicio5;

// Importação do Scanner da lib (library - biblioteca) do Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um novo Scanner a partir da importação
        Scanner in = new Scanner(System.in);

        // Mensagem para o usuário e leitura de valor de variável
        System.out.println("Digite o consumo em KWh");
        double consumo = in.nextDouble();

        // Cálculo do Valor do Fornecimento
        double fornecimento = consumo * 0.28172;

        double icms, cofins, pisPasesp, icmsCofins, icmsPisPasesp;

        // Cáculo das impostos
        if (consumo <= 200) {
            icms = 0.136363 * fornecimento;
            cofins = 0.0614722 * fornecimento;
            pisPasesp = 0.013346 * fornecimento; // Concertar
            icmsCofins = 0.136363 * 0.0614722 * fornecimento; // Concertar
            icmsPisPasesp = 0.136363 * 0.013346 * fornecimento;
        } else {
            icms = 0.333333 * fornecimento;
            cofins = 0.0730751 * fornecimento;
            pisPasesp = 0.0158651 * fornecimento; // Concertar
            icmsCofins = 0.333333 * 0.0730751 * fornecimento; // Concertar
            icmsPisPasesp = 0.333333 * 0.0158651 * fornecimento;
        }

        double fatura = fornecimento + icms + cofins + pisPasesp + icmsCofins + icmsPisPasesp;

        System.out.println(
                "Fornecimento = " + fornecimento +
                        "\nICMS = " + icms +
                        "\nCOFINS = " + cofins +
                        "\nPIS/PASESP = " + pisPasesp +
                        "\nICMS sobre COFINS = " + icmsCofins +
                        "\nICMS sobre PIS/PASESP = " + icmsPisPasesp +
                        "\nFatura = " + fatura);

        // Fechando o Scanner
        in.close();
    }

}
