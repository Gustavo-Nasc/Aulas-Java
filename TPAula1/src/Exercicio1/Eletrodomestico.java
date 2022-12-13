package Exercicio1;

public class Eletrodomestico {
    // Abstração de um Eletrodoméstico
    String descricao; // Nome do Eletrodoméstico, como: SmartTV, Geladeira
    String marca; // Marca a qual o Eletrodoméstico pertence, como: Samsung
    String modelo; // A linha a qual o Eletrodoméstico faz parte, como: OLED65C1
    boolean ligado; // O Status do Eletrodoméstico: ligado (true) ou desligado (false)
    int voltagem; // A vontagem do Eletrodoméstico

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

    // Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Ligado
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Voltagem
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

}