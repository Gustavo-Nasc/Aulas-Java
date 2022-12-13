package Exercicio1;

public class Triangle {
    double base;
    double altura;

    public Triangle() {

    }

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        double area = this.base * this.altura;

        return area;
    }

    public String imprimeDados() {
        return "Os dados s�o: Altura = " + this.altura + "; Base = " + this.base + "; �rea = " + this.calculaArea();
    }
}
