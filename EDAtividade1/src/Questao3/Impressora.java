package Questao3;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Impressora {

    public static void main(String[] args) {
        // Instanciando uma nova Fila de Arquivos, do tipo de Documento, um Objeto
        Fila<Documento> filaArquivosImpressao = new Fila<>();

        // Variavel condicional, para o laço
        String condicional;

        do {
            condicional = JOptionPane.showInputDialog(
                    "Selecione uma das Opções:"
                            + "\n1 - Adicionar Arquivo para Impressão"
                            + "\n2 - Realizar Impressão"
                            + "\n3 - Visualizar próximo Arquivo a ser impresso"
                            + "\n4 - Visualizar Fila de Impressão"
                            + "\n5 - Visualizar Quantidade de Arquivos"
                            + "\n0 - Desligar Impressora"
            );

            if (condicional.equals("1")) {
                // Instanciando um novo Documento a ser impresso
                Documento doc = new Documento();

                // Leitura das variáveis necessárias para a criação de um Documento
                String nomeArquivo = JOptionPane.showInputDialog("Insira o Nome do Arquivo:");
                double tamanhoArquivo = Double.parseDouble(
                        JOptionPane.showInputDialog("Insira o Tamanho do Arquivo (em KB):")
                );
                String tipoArquivo;
                do {
                    tipoArquivo = JOptionPane.showInputDialog(
                            "Selecione o Tipo de Arquivo:"
                                    + "\n1 - Excel (.xlsx)"
                                    + "\n2 - Word (.docx)"
                                    + "\n3 - PDF (.pdf)"
                                    + "\n4 - Imagem (.jpg)"
                                    + "\n5 - Imagem (.png)"
                    );

                    if (!(tipoArquivo.equals("1") || tipoArquivo.equals("2") || tipoArquivo.equals("3") || tipoArquivo.equals("4") || tipoArquivo.equals("5"))) {
                        JOptionPane.showMessageDialog(null, "Tipo de Arquivo inválido, tente novamente!");
                    }
                } while(!(tipoArquivo.equals("1") || tipoArquivo.equals("2") || tipoArquivo.equals("3") || tipoArquivo.equals("4") || tipoArquivo.equals("5")));

                // Inserindo os valores lidos para o objeto
                doc.setNomeArquivo(nomeArquivo);
                doc.setTamanhoArquivo(tamanhoArquivo);
                doc.setTipoArquivo(tipoArquivo);

                // Inserindo o objeto na Fila de Arquivos de Impresão
                filaArquivosImpressao.stackUp(doc);

                // E logo após, exibindo a mensagem de sucesso
                JOptionPane.showMessageDialog(null, "Documento adicionado com sucesso!");
            } else if (condicional.equals("2")) {
                if (filaArquivosImpressao.peek() == null) {
                    JOptionPane.showMessageDialog(null, "Não existem Arquivos a serem impressos");
                } else {
                    JOptionPane.showMessageDialog(null, "Informações do Arquivo:\n"
                            + filaArquivosImpressao.unStack()
                            + "\n\nArquivo Impresso com êxito!"
                    );
                }
            } else if (condicional.equals("3")) {
                if (filaArquivosImpressao.peek() == null) {
                    JOptionPane.showMessageDialog(null, "Não existem Arquivos a serem impressos");
                } else {
                    JOptionPane.showMessageDialog(null, "Próximo item a ser impresso:\n\n" + filaArquivosImpressao.peek());
                }
            } else if (condicional.equals("4")) {
                if (filaArquivosImpressao.peek() == null) {
                    JOptionPane.showMessageDialog(null, "Não existem Arquivos a serem impressos");
                } else {
                    JOptionPane.showMessageDialog(null, "Arquivos na fila de impressão:\n\n" + filaArquivosImpressao.toString());
                }
            } else if (condicional.equals("5")) {
                JOptionPane.showMessageDialog(null, "Quantidade de Arquivos na fila de impressão: " + filaArquivosImpressao.size());
            } else if (condicional.equals("0")) {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar! Power off");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
            }
        } while(!condicional.equals("0"));
    }

}
