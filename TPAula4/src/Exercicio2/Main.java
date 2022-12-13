package Exercicio2;

// Importando o Scanner da lib (biblioteca do Java)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando um novo Scanner a partir da importação
        Scanner in = new Scanner(System.in);

        // Criando novos objetos a partir da Classe
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(10, 30);

        System.out.println("Insira a Base do Tri�ngulo:");
        double base = in.nextDouble();

        System.out.println("Insira a Altura do Tri�ngulo:");
        double altura = in.nextDouble();

        t1.setBase(base);
        t1.setAltura(altura);

        System.out.println(t1.calculaArea());
        System.out.println(t2.calculaArea());

        t1.imprimeDados();
        t2.imprimeDados();

        in.close();
    }

}
