package Questao3;

import java.text.DecimalFormat;

public class Documento {
    // Atributos principais de um Documento
    private String nomeArquivo;
    private double tamanhoArquivo;
    private String tipoArquivo;

    public Documento() {

    }

    // Getters e Setters do Documento
    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    // Função que será responsável pela formatação geral do Documento
    public String toString() {
        // Nova instância do StringBuilder, que será responsável pela formatação do Documento
        StringBuilder formatadorDocumento = new StringBuilder();

        // Nova instância do DecimalFormat, que será responsável pela formatação do tamanho do arquivo, que é um número decimal
        DecimalFormat formatadorTamanhoArquivo = new DecimalFormat("###.###");

        String extensaoArquivo = "";

        // Formatar o nome do arquivo, de acordo com o que foi inserido pelo usuário
        switch(this.getTipoArquivo()) {
            case "1":
                extensaoArquivo = ".xlsx";
            case "2":
                extensaoArquivo = ".docx";
            case "3":
                extensaoArquivo = ".pdf";
            case "4":
                extensaoArquivo = ".jpg";
            case "5":
                extensaoArquivo = ".png";
        }

        // Após formatado, ele é adicionado ao Formatador
        formatadorDocumento.append(this.getNomeArquivo() + extensaoArquivo);

        // Variável que receberá o valor do tamanho do arquivo
        double tamanhoArquivo;

        // Variável que receberá o tipo de Byte (KB ou MB), o padrão será KB
        String tamanhoByte = " KB";

        // Logo após, é hora de formatar o Tamanho do Arquivo
        if(this.getTamanhoArquivo() >= 1000) {
            // O tamanho é fornecido em KB, logo, se ele for maior do que 1000KB, esse arquivo se torna 1MB
            tamanhoArquivo = this.getTamanhoArquivo() / 1000;
            tamanhoByte = " MB";
        } else {
            // Caso contrário, ele receberá o tamanho em KB
            tamanhoArquivo = this.getTamanhoArquivo();
        }

        // E então, ele é concatenado no 'formatadorDocumento'
        formatadorDocumento.append(" - " + formatadorTamanhoArquivo.format(tamanhoArquivo) + tamanhoByte);

        // A próxima etapa é inserir

        return formatadorDocumento.toString();
    }

}
