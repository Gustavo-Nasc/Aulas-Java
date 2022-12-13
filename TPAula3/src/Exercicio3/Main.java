package Exercicio3;

// Importando o Scanner da lib do Java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da importação
        Scanner in = new Scanner(System.in);

        // Mensagem para usuário
        System.out.println("Insira a Velocidade do Carro:");
        int velocidadeCarro = in.nextInt(); // Leitura da Velocidade do Carro

        // Mensagem para usuário
        System.out.println("Insira a Velocidade Máxima da rua:");
        int velocidadeMaxima = in.nextInt(); // Leitura da Velocidade Máxima

        if (velocidadeCarro > velocidadeMaxima && velocidadeCarro < velocidadeMaxima + 11) {
            System.out.println("Valor a ser pago: R$ 50,00");
        } else if (velocidadeCarro > velocidadeMaxima + 10 && velocidadeCarro < velocidadeMaxima + 31) {
            System.out.println("Valor a ser pago: R$ 100,00");
        } else if (velocidadeCarro > velocidadeMaxima + 30) {
            System.out.println("Valor a ser pago: R$ 300,00");
        } else {
            System.out.println("Nada a ser pago!");
        }

        // Fechando o Scanner
        in.close();
    }
}
