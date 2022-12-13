package Exercicio2;

public class Carro {
    // Abstração de um Carro
    String descricao; // Nome do Carro, como: Corolla, Civic
    String marca; // Marca do Carro, como: Toyota, Civic
    String cor; // Cor do Carro, como: Vermelho, Branco, Cinza
    int numPortas; // Quantidade de portas do Carro
    String placa; // Placa do Carro

    // Getters e Setters

    // Descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Portas
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    // Placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}