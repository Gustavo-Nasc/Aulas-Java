package Exercicio3;

public class CaixaDialogo {
    // Abstração de uma Caixa de Diálogo
    String mensagem;
    String emissor;
    String receptor;
    String dataEnvio;

    // Getters e Setters

    // Mensagem
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // Emissor
    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    // Receptor
    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    // Data envio
    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}