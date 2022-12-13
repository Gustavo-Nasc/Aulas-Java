package Exemplo2;

// Criando uma Classe Abstrata (Uma Classe Abstrata é uma classe de referêcia)
public abstract class Publicacao {
    // Atributos da Classe
    private String titulo;
    private String dataPublicacao;

    // Método Construtor com parâmetros
    public Publicacao(String titulo, String dataPublicacao) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }

    // Métodos de Acesso (Getters e Setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    // Método Abstrato
    public abstract void imprimir();
}