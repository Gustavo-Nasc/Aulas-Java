package Exercicio2;

// Importação do Scanner da Library System.in
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da sua importação
        Scanner in = new Scanner(System.in);

        boolean j = true;

        while (j == true) {
            // Abstração de um Objeto a partir da Classe criada
            Carro c = new Carro();

            // Leitura dos dados a partir do Scanner
            System.out.println("Insira o Nome do Carro (Corolla, Civic etc.):");
            c.descricao = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Marca do Carro (Toyota, Civic etc.):");
            c.marca = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a cor do Carro (Laranja, Branco, Cinza etc.):");
            c.cor = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Quantidade de Portas do Carro:");
            c.numPortas = in.nextInt();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Placa do Carro:");
            c.placa = in.next();

            System.out.println(); // Quebra de linha

            // Impressão dos dados inseridos pelo usuário
            System.out.println("Os dados inseridos foram:");
            System.out.println("Descrição: " + c.descricao);
            System.out.println("Marca: " + c.marca);
            System.out.println("Cor: " + c.cor);
            System.out.println("Número de Portas: " + c.numPortas);
            System.out.println("Placa: " + c.placa);

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