package Exercicio2;

public class Triangulo {
    // Atributos da Classe
    private double base;
    private double altura;

    // Métodos Construtores

    // Sem parâmetros
    public Triangulo() {
    }

    // Com parâmetros
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos de Acesso (Getters e Setters)
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        double area = this.base * this.altura / 2;

        return area;
    }

    public void imprimeDados() {
        System.out.println("Base (" + this.base + ") x Altura (" + this.altura + ") = �rea (" + calculaArea() + ")");
    }
}
