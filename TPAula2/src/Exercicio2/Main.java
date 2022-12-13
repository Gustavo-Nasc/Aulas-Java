package Exercicio2;

//Importação do Scanner da Library System.in
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da sua importação
        Scanner in = new Scanner(System.in);

        ContaCorrente c1 = new ContaCorrente(null, 0, -1000);
        ContaCorrente c2 = new ContaCorrente(null, 0, "Conta Poupança");

        System.out.println("Insira os dados da 1º Conta Corrente");

        // Código para quebrar linha
        System.out.println();

        c1.cadastroDados();

        // Código para quebrar linha
        System.out.println();

        System.out.println("Insira os dados da 2º Conta Corrente");
        c2.cadastroDados();

        // Código para quebrar linha
        System.out.println();

        System.out.println(c1.imprimeDados());

        // Código para quebrar linha
        System.out.println();

        System.out.println(c2.imprimeDados());

        // Utilizando a função de depósito para a 1º conta
        System.out.println("Quando você deseja depositar, " + c1.nome + "?");
        int valor = in.nextInt();
        c1.depositar(valor);

        // Código para quebrar linha
        System.out.println();

        // Utilizando a função de depósito para a 2º conta
        System.out.println("Quando você deseja depositar, " + c2.nome + "?");
        valor = in.nextInt();
        c2.depositar(valor);

        // Código para quebrar linha
        System.out.println();

        // Utilizando a função de saque para a 1º conta
        System.out.println("Quando você deseja sacar, " + c1.nome + "?");
        valor = in.nextInt();
        c1.sacar(valor);

        // Código para quebrar linha
        System.out.println();

        // Utilizando a função de saque para a 1º conta
        System.out.println("Quando você deseja sacar, " + c2.nome + "?");
        valor = in.nextInt();
        c2.sacar(valor);

        in.close();
    }
}
