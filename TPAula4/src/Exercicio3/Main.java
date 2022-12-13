package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da Importação
        Scanner in = new Scanner(System.in);

        // Criando um novo Objeto a partir da Classe
        Torneio t1 = new Torneio();
        Torneio t2 = new Torneio("Carlos", 27);

        System.out.println("Insira o Nome da Pessoa:");
        String nome = in.next();

        System.out.println("Insira a Idade da Pessoa:");
        int idade = in.nextInt();

        t1.setNome(nome);
        t1.setIdade(idade);

        t1.imprimeDados();
        t2.imprimeDados();

        // Fechamento do Scanner
        in.close();
    }

}
