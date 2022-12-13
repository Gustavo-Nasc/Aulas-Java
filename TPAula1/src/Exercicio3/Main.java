package Exercicio3;

//Importação do Scanner da Library System.in
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da sua importação
        Scanner in = new Scanner(System.in);

        boolean j = true;

        while (j == true) {
            // Abstração de um Objeto a partir da Classe criada
            CaixaDialogo cd = new CaixaDialogo();

            // Leitura dos dados a partir do Scanner
            System.out.println("Insira a Mensagem a ser enviada:");
            cd.mensagem = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira o Emissor da Mensagem:");
            cd.emissor = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira o Receptor da Mensagem:");
            cd.receptor = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Data de Envio da Mensagem:");
            cd.dataEnvio = in.next();

            System.out.println(); // Quebra de linha

            // Impressão dos dados inseridos pelo usuário
            System.out.println("Os dados inseridos foram:");
            System.out.println("Mensagem: " + cd.mensagem);
            System.out.println("Emissor: " + cd.emissor);
            System.out.println("Receptor: " + cd.receptor);
            System.out.println("Data de Envio: " + cd.dataEnvio);

            // Mensagem para a verificação do laço de repetição
            System.out.println("Deseja testar novamente? (1 - Sim; 2 - Não):");
            int loopCondition = in.nextInt();

            if (loopCondition == 1) {
                j = true;
            } else if (loopCondition == 2) {
                j = false;
            } else {
                System.out.println("Valor inserido não corresponde às opções");
            }
        }

        in.close();
    }
}
