package Exemplo1;

import javax.swing.JOptionPane;

public class Quadrado extends FormaGeometrica {
    // Atributos da Classe
    private float lado;

    // Método Construtor com Parâmetro
    public Quadrado(float lado) {
        this.lado = lado;
    }

    // Métodos de Acesso (Getters e Setters)
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    // Override para sobrescrever a função de Cálculo de Área
    @Override
    public float area() {
        return lado * lado;
    }

    // Override para sobrescrever a função de Cálculo de Perímetro
    @Override
    public float perimetro() {
        return lado * 4;
    }

    // Override para sobrescrever a função de Mostra
    @Override
    public void mostra() {
        JOptionPane.showMessageDialog(
                null,
                "Valor do Lado = " + this.lado +
                        "\nValor da Área = " + area() +
                        "\nValor do Perímetro = " + perimetro());
    }
}