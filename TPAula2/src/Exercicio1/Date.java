package Exercicio1;

import java.util.Scanner;

public class Date {

    Scanner in = new Scanner(System.in);

    int dia;
    int mes;
    int ano;

    public Date() {

    }

    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void cadastraDados() {
        System.out.print("Insira o dia: ");
        this.dia = in.nextInt();

        System.out.print("Insira o mês: ");
        this.mes = in.nextInt();

        System.out.print("Insira o ano: ");
        this.ano = in.nextInt();
    }

    public void imprimeData() {
        System.out.println("Data inserida: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
}
