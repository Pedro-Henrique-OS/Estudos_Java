package tarefas.exercicio17vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media =0;
        int aux = 0;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();

        int[] vetor = new int[quantidade];

        for(int i=0;i<vetor.length;i++){
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
            if(vetor[i]%2==0){
                soma += vetor[i];
                aux+= 1;
            }
        }
        media = soma/aux;
        if(media > 0){
            System.out.println("MEDIA DOS PARES = "+ media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR ");
        }


        sc.close();
    }
}
