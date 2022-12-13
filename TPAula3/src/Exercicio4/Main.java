package Exercicio4;

// Importando o Scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da importação
        Scanner in = new Scanner(System.in);

        // Mensagem para usuário
        System.out.println("Insira o primeiro valor:");
        double num1 = in.nextDouble(); // Leitura do primeiro valor

        // Mensagem para usuário
        System.out.println("Insira o segundo valor:");
        double num2 = in.nextDouble(); // Leitura do segundo valor

        // Mensagem para usuário
        System.out.println("Insira o terceiro valor:");
        double num3 = in.nextDouble(); // Leitura do terceiro valor

        System.out.println("A ordem é:");

        // Fechamento do Scanner
        in.close();
    }
}
