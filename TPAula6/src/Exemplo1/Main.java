package Exemplo1;

public class Main {

    public static void main(String[] args) {
        // Instanciando novos objetos 'Formas'
        Triangulo triangulo = new Triangulo(4 / 1, 8 / 1);
        Quadrado quadrado = new Quadrado(4 / 1);

        triangulo.mostra();

        quadrado.mostra();
    }

}
