package Exercicio4;

import javax.swing.JOptionPane;

public class Vendedor {
    // Atributos da Classe
    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    // Métodos Construtores

    // Com parâmetros
    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    // Sem parâmetros
    public Vendedor() {

    }

    // Métodos de Acesso (Getters & Setters)
    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Dados do Vendedor" +
                "\nNome: " + this.nome +
                "\nVendas: " + this.vendas +
                "\nSalário " + this.salario +
                "\nFaltas: " + this.falta);
    }

    public float calculaComissao() {
        if (vendas > 1000 && vendas < 2000) {
            return vendas * 0.10f;
        } else if (vendas >= 2000) {
            return vendas * 0.15f;
        } else {
            return 0;
        }
    }

    public void calcularSalario() {
        float descontoFalta = this.salario / 30 * falta;

        this.salario = this.salario + calculaComissao() - descontoFalta;
    }
}
