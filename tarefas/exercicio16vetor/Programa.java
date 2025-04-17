package tarefas.exercicio16vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double n = 0;
        double media = 0;
        double soma = 0;

        double[] vetor = new double[quantidade];
        for(int i=0;i< vetor.length;i++){

        System.out.println("Digite um numero: ");
        n = sc.nextDouble();
        vetor[i] = n;
        soma +=vetor[i];

        }
        media = soma/vetor.length;
        System.out.println("MEDIA DO VETOR = "+ media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i=0;i< vetor.length;i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
