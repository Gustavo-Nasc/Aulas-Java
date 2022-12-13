package Exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Júlio", 20, 2000);

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o nome do usuário:");
        String nome = in.next();

        System.out.println("Insira a idade do usuário:");
        int idade = in.nextInt();

        System.out.println("Insira a renda do usuário:");
        double renda = in.nextDouble();

        p1.setNome(nome);
        p1.setIdade(idade);
        p1.setRenda(renda);

        System.out.println("Usu�rio 1: " + p1.getNome() + ", " + p1.getIdade() + ", " + p1.getRenda());
        System.out.println("Usu�rio 2: " + p2.getNome() + ", " + p2.getIdade() + ", " + p2.getRenda());

        in.close();
    }
}
