package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Triangle triangulo = new Triangle(5, 5);

        System.out.println("A área do Triângulo é: " + triangulo.calculaArea());
        System.out.println(triangulo.imprimeDados());

        Date nascimento = new Date();

        nascimento.cadastraDados();
        nascimento.imprimeData();

        Date aniversario = new Date(9, 9, 2022);

        aniversario.imprimeData();
    }

}
