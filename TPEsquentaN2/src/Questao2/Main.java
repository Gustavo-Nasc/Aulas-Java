// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

package Questao2;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();

        // TODO: Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada
        int i;

        String vetor[] = new String[palavra.length()];

//        for (i = 0; i < vetor.length - 1; i++) {
//        	vetor[i] = palavra.charAt(i);
//        }

//        for (i = 0; i < vetor.length - 1; i++); {
//        	System.out.println(vetor[i]);
//        }

        System.out.println(palavra.charAt(0));


    }
}