package tarefas.exercicio14vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int [] vetor = new int[n];
        for (int i = 0; i< vetor.length;i++){
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        int maiorValor = 0;
        int posicao =0;
        for (int i = 0; i< vetor.length; i++){
            if(vetor[i]>maiorValor){
                maiorValor = vetor[i];
                posicao = i;
            }
        }

    System.out.println("MAIOR VALOR = " + maiorValor );
        System.out.println("POSICAO DO MAIOR VALOR : "+ posicao);




        sc.close();
    }
}
