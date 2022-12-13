package Exercicio1;

// Importando o Scanner da lib (biblioteca)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Objeto Scanner a partir da importaçãoo
        Scanner in = new Scanner(System.in);

        // Criando objetos a partir da Classe Funcionario
        Funcionario f1 = new Funcionario(); // Método Construtor sem parâmetros
        Funcionario f2 = new Funcionario(303, 3000, "Supervisor"); // Método Construtor com parâmetros

        System.out.println("Insira o Número do Crachá do Funcionário:");
        int cracha = in.nextInt(); // Declarando uma nova variável (atributo) e obtendo o valor a partir do Scanner

        System.out.println("Insira o Salário do Funcionário " + cracha + ":");
        float salario = in.nextFloat();

        System.out.println("Insira o Cargo do Funcionário " + cracha + ":");
        String cargo = in.next();

        // Setando os valores a partir do Método de Acesso(Pode receber ou pegar o valor
        // desejado) Set
        f1.setCracha(cracha);
        f1.setSalario(salario);
        f1.setCargo(cargo);

        // Utilizando os Métodos de Acesso (Get) para exibir as informa��es
        System.out.println("Funcionário de Crachá " + f1.getCracha() + " - " + f1.getCracha() + "; Sal�rio: "
                + f1.getSalario() + "; Cargo: " + f1.getCargo());
        System.out.println("Funcionário de Crachá " + f2.getCracha() + " - " + f2.getCracha() + "; Sal�rio: "
                + f2.getSalario() + "; Cargo: " + f2.getCargo());

        System.out.println(); // Pula linha

        System.out.println("Insira uma porcentagem a ser aumentada no Salário do Funcionário " + f1.getCracha() + ":");
        float porcentagem = in.nextFloat();

        f1.calculaAumentoPorcentagem(porcentagem); // Método que calcula o acréscimo ao Salário a patir da porcentagem

        System.out.println("Insira quantos anos o Funcionário " + f1.getCracha() + " trabalha na empresa:");
        int tempo = in.nextInt();

        f1.calculaAumentoTempo(tempo); // Método que calcula o acréscimo ao salário a patir dos anos trabalhados

        System.out.println("O novo Salário do Funcionário " + f1.getCracha() + " é: " + f1.getSalario());

        in.close();
    }

}
