package Exercicio1;

// Importação do Scanner da Library System.in
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da sua importação
        Scanner in = new Scanner(System.in);

        boolean j = true;

        while (j == true) {
            // Abstração de um Objeto a partir da Classe criada
            Eletrodomestico e = new Eletrodomestico();

            // Leitura dos dados a partir do Scanner
            System.out.println("Insira a Descrição do Eletrodoméstico (SmartTV, Geladeira etc.):");
            e.descricao = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Marca do Eletrodoméstico (Panasonic, Samsung etc.):");
            e.marca = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira o Modelo do Eletrodoméstico (24TL520S, por exemplo):");
            e.modelo = in.next();

            System.out.println(); // Quebra de linha

            System.out.println("Insira a Voltagem do Eletrodoméstico (Em números):");
            e.voltagem = in.nextInt();

            System.out.println(); // Quebra de linha

            System.out.println("Deseja ligar o Eletrodoméstico? (1 - Sim; 2 - Não):");
            int condition = in.nextInt();

            // Condição para aplicar um valor a variável "ligado" do Objeto
            if (condition == 1) {
                e.ligado = true;
            } else if (condition == 2) {
                e.ligado = false;
            } else {
                System.out.println("Valor inserido não corresponde às opções");
            }

            System.out.println(); // Quebra de linha

            // Impressão dos dados inseridos pelo usuário
            System.out.println("Os dados inseridos foram:");
            System.out.println("Descrição: " + e.descricao);
            System.out.println("Marca: " + e.marca);
            System.out.println("Modelo: " + e.modelo);
            System.out.println("Voltagem: " + e.voltagem);
            System.out.println("Ligado?: " + e.ligado);

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