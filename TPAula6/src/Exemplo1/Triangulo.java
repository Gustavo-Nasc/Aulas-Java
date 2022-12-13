package Exemplo1;

import javax.swing.JOptionPane;

public class Triangulo extends FormaGeometrica {
    // Atributos da Classe
    private float base;
    private float altura;

    // Método Construtor com Parâmetro
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos de Acesso (Getters e Setters)
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Override para a função de Cálculo de Área
    @Override
    public float area() {
        return this.altura * this.base;
    }

    // Override para a função de Cálculo de Perímetro
    public float perimetro() {
        return this.altura * 2 + this.base * 2;
    }

    // Override para a função de Mostrar resultados
    public void mostra() {
        JOptionPane.showMessageDialog(
                null,
                "Valor da Base = " + this.base +
                        "\nValor da Altura = " + this.altura +
                        "\nValor da Área = " + area() +
                        "\nValor do Perímetro = " + perimetro());
    }
}