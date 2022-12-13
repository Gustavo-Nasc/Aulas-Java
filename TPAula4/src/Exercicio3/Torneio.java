package Exercicio3;

public class Torneio {
    // Atributos da Classe
    private String nome;
    private int idade;

    // Método Construtor

    // Com parâmetro
    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Sem parâmetro
    public Torneio() {

    }

    // Métodos de Acesso (Getters e Setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificaCategoria() {
        String categoria;

        if (this.idade > 4 && this.idade < 8) {
            categoria = "Infantil";
        } else if (this.idade > 7 && this.idade < 11) {
            categoria = "Juvenil";
        } else if (this.idade > 10 && this.idade < 16) {
            categoria = "Adolescente";
        } else if (this.idade > 15 && this.idade < 31) {
            categoria = "Adulto";
        } else if (idade > 30) {
            categoria = "Sênior";
        } else {
            categoria = "Idade não se encaixa nas Categorias";
        }

        return categoria;
    }

    public void imprimeDados() {
        System.out.println(
                "Nome: " + this.nome + ", com idade de " + this.idade + ", da categoria " + this.verificaCategoria());
    }
}
