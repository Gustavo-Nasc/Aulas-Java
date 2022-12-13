package Exercicio2;

import java.util.Scanner;

public class ContaCorrente {

    Scanner in = new Scanner(System.in);

    String nome;
    double saldo;
    double limite;
    String tipo;

    public ContaCorrente() {

    }

    public ContaCorrente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public ContaCorrente(String nome, double saldo, String tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void cadastroDados() {
        System.out.print("Insira o seu nome: ");
        this.nome = in.next();

        this.saldo = 0;

        this.limite = -1000;
    }

    public String imprimeDados() {
        return "O nome registrado é: " + this.nome + "; Seu saldo inicial é de: R$ " + this.saldo
                + "; O seu limite é de: R$  " + this.limite;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;

        System.out.println("Valor depositado! Seu novo saldo é de: R$ " + this.saldo);
    }

    public void sacar(double valor) {
        if ((this.saldo - valor) >= this.limite) {
            this.saldo = this.saldo - valor;
            System.out.println("Valor sacado! Seu novo saldo é de: R$ " + this.saldo);
        } else {
            System.out.println("Valor indisponível para saque. Seu saldo se manteve em: R$ " + this.saldo);
        }
    }
}
