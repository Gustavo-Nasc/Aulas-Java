package Exercicio2;

// Importando o Scanner da lib do Java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da importação
        Scanner in = new Scanner(System.in);

        // Mensagem para o usuário 1
        System.out.println("Insira o número 1:");
        double numero1 = in.nextDouble();

        // Mensagem para o usuário 2
        System.out.println("Insira o número 2:");
        double numero2 = in.nextDouble();

        // Mensagem para o usuário 3
        System.out.println("Insira o número 3:");
        double numero3 = in.nextDouble();

        // Condicional que verifica os números
        if (numero1 > numero2 + numero3) {
            System.out.println("O número " + numero1 + " é maior do que a soma entre " + numero2 + " e " + numero3);
        } else {
            System.out.println("O número " + numero1 + " é menor do que a soma entre " + numero2 + " e " + numero3);
        }

        // Fechamento do Scanner
        in.close();
    }
}
