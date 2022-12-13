package Questao3;

// Contextualizando:
// Como nesse exercício estamos trabalhando com Fila, utilizarei como exemplo uma Fila de Documentos a serem impressos
// O Documento é um Objeto, por isso, criei uma Classe chamada Documento

public class Fila<T> {
    private T documents[];
    private int size;

    public Fila() {
        this.documents = (T[]) new Object[0];
        this.size = 0;
    }

    // Método para aumentar a capacidade da Fila
    // Optei por deixá-lo como um Método Privado, pois, ao meu ver, não faria sentido o usuário aumentar a capacidade da Fila na mão
    // Esse é um processo automático realizado sempre que um novo valor for adicionado
    private void increaseCapacity() {
        if (this.size == this.documents.length) {
            T[] elementosNovos = (T[]) new Object[this.documents.length + 1];

            for (int i = 0; i < this.documents.length; i++) {
                elementosNovos[i] = this.documents[i];
            }

            this.documents = elementosNovos;
        }
    }

    // Método para enfileirar um novo elemento na Fila
    public void stackUp(T document) {
        this.increaseCapacity();

        // Não inseri a verificação de tamanho, pois o 'increaseCapacity' sempre estará acrescentando posições
        this.documents[this.size] = document;
        this.size++;
    }

    // Método que retira o primeiro elemento da Fila (First In - First Out)
    public T unStack() {
        if (this.isEmpty()) {
            return null;
        } else {
            final int POS = 0;

            T document = this.documents[POS];

            for (int i = POS; i < this.size - 1; i++) {
                documents[i] = documents[i+1];
            }
            this.size--;

            return document;
        }
    }

    // Método para 'espiar' o primeiro elemento da Fila, ou seja, o primeiro a ser impresso
    public T peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.documents[0];
        }
    }

    // Método que retorna o tamanho da Fila
    public int size() {
        return this.size;
    }

    // Método para verificar se a Fila está vazia
    // Deixei esse método como privado
    // O sentido é simples, não é algo que será utilizado pelo Usuário, por esse motivo, deixei ele disponível apenas para essa classe
    private boolean isEmpty() {
        return this.size == 0;
    }

    // Função que retorna a fila em String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.documents[i] + "\n\n");
        }

        if (this.size > 0) {
            sb.append(this.documents[this.size - 1]);
        }

        return sb.toString();
    }

}
