package Exercicio1;

public class Funcionario {
    // Atributos da Classe
    private int cracha;
    private float salario;
    private String cargo;

    // Métodos Construtores da Classe

    // Sem parâmetros
    public Funcionario() {
    }

    // Com parâmetros e inserindo os valores da Classe
    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos de Acesso (Getters e Setters)
    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calculaAumentoPorcentagem(float porcentagem) {
        this.salario = this.salario + (this.salario * porcentagem / 100);
    }

    public void calculaAumentoTempo(int tempo) {
        this.salario = (this.salario + (150 * tempo));
    }
}
