package Questao2;

// Importações
import java.text.DecimalFormat;
import java.util.Random;

public class ContaCorrente {
    // Atributos da Classe
    private String titular;
    private int numeroConta;
    private double saldo;

    // Classe Random, para gerar um número aleatório para a Conta Corrente
    Random random = new Random();

    // Classe Decimal format, para a formatação dos valores monetários do tipo 'double'
    DecimalFormat df = new DecimalFormat("#######.##");

    // Método Construtor com Parâmetro
    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.numeroConta = random.nextInt(10000, 99999); // Aqui é gerado um novo número para a Conta de forma automática
    }

    // Método de Retorno de todas as informações da conta
    public String getAccountData() {
        return
                "Titular: " + this.titular
                        + "\nSaldo: " + df.format(this.saldo)
                        + "\nNúmero da C/C: " + this.numeroConta
                ;
    }

    // Método de Depósito na conta
    public String deposit(double valor) {
        this.saldo+=valor;

        return
                "Depósito realizado com sucesso!"
                        + "\nSeu saldo atual é: " + df.format(this.saldo)
                ;
    }

    // Método de Saque na conta
    public String withdraw(double valor) {
        double saldo = this.saldo + valor;

        // Será informado ao usuário um limite de R$ 3.000,00.
        // Caso a variável criada (saldo) esteja nesse limite
        // O saldo da conta é atualizado e é exibido o novo saldo
        if (saldo >= -3000) {
            this.saldo = saldo;

            return
                    "Saque realizado com sucesso!"
                            + "\nSeu saldo atual é: R$ " + df.format(this.saldo)
                    ;
        } else {
            return "Não foi possível realizar o saque, limite atingido";
        }
    }

}