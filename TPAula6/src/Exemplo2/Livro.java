package Exemplo2;

import javax.swing.JOptionPane;

// Criando Classe filha de Publicacao
public class Livro extends Publicacao {
    // Atributos da Classe
    private String editora;
    private String autores;

    // Método Construtor com parâmetro
    public Livro(String titulo, String dataPublicacao, String editora) {
        super(titulo, dataPublicacao);
        this.editora = editora;
    }

    // Métodos de Acesso (Getters e Setters)
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    // Override para o Método de Imprimir
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(
                null,
                "Título = " + getTitulo() +
                        "\nData de Publicação = " + getDataPublicacao() +
                        "\nEditora = " + this.editora +
                        "\nAutores = " + this.autores);
    }
}