package tarefas.exercicio11vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media = 0.0;
        double soma = 0.0;

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i< vetor.length; i++){
            System.out.println("Digite um numero:");
            double numero = sc.nextDouble();
            vetor[i] = numero;
            soma += vetor[i];
        }
        media = soma/ vetor.length;

        System.out.println("VALORES: ");
        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }
        System.out.println();
        System.out.printf("Soma: %.2f ",soma);
        System.out.printf("Media: %.2f", media);

    }
}
