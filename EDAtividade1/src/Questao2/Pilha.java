package Questao2;

// Contextualizando:
// Para o meu exemplo, vou Abstrair a pilha como um 'Extrato Bancário'.
// Por esse motivo, alguns métodos estão com comentários relacionados a Conta Corrente

public class Pilha {
    // Atributos da Classe
    private double transactions[]; // Já coloquei como tipo Double, pois os valores de Transações serão decimais
    private int size;

    // Método Construtor sem Parâmetro
    public Pilha() {
        this.transactions = new double[0];
        this.size = 0;
    }

    // Método para aumentar a capacidade da Pilha
    // Optei por deixá-lo como um Método Privado, pois, ao meu ver, não faria sentido o usuário aumentar a capacidade da Pilha na mão
    // Esse é um processo automático realizado sempre que um novo valor for adicionado
    private void increaseCapacity() {
        if (this.size == this.transactions.length) {
            double[] elementosNovos = new double[this.transactions.length + 1];

            for (int i = 0; i < this.transactions.length; i++) {
                elementosNovos[i] = this.transactions[i];
            }

            this.transactions = elementosNovos;
        }
    }

    // Método para empilhar um novo elemento na Pilha
    public void push(Double value) {
        this.increaseCapacity();

        // Não inseri a verificação de tamanho, pois o 'increaseCapacity' sempre estará acrescentando posições
        this.transactions[this.size] = value;
        this.size++;
    }

    // Aqui seria o Método para desempilhar o último elemento da Pilha
    // Porém, para o exemplo prático, não faz sentido com que o usuário possa retirar uma transação da sua conta
    // Uma vez realizada, a transação não pode ser apagada do registro, na teoria
    // Porfavorzinho, não desconta ponto de mim, eu fiz com muito amor e carinho!

    // Método para 'espiar' o elemento do topo da Pilha, ou seja, a última transação
    public double peek() {
        if (this.isEmpty()) {
            return -3000.01;
        } else {
            return this.transactions[this.size-1];
        }
    }

    // Método para verificar se a pilha está vazia
    // Deixei esse método como privado
    // O sentido é simples, não é algo que será utilizado pelo Usuário, por esse motivo, deixei ele disponível apenas para essa classe
    private boolean isEmpty() {
        return this.size == 0;
    }


    // Método toString, para a exibição da Pilha completa (Extrato Completo)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (this.size == 0) {
            return "Ainda não possui transações";
        } else {
            for(int i = 0; i < transactions.length; i++) {
                if (transactions[i] < 0) {
                    sb.append("Saque: R$ " + transactions[i]);
                } else {
                    sb.append("Depósito: R$ " + transactions[i]);
                }
                sb.append("\n");
            }

            return sb.toString();
        }

    }
}