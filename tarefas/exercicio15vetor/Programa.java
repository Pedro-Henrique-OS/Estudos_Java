package tarefas.exercicio15vetor;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int quantidadeValores = sc.nextInt();

        int [] vetorA = new int[quantidadeValores];
        int [] vetorB = new int[quantidadeValores];
        int [] somaVetores = new int[quantidadeValores];

        int valor = 0;

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i< vetorA.length;i++){
            valor = sc.nextInt();
            vetorA[i] = valor;

        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i< vetorB.length;i++){
            valor = sc.nextInt();
            vetorB[i] = valor;

        }


        System.out.println("VETOR RESULTANTE: ");
        for(int i = 0; i< somaVetores.length;i++){
            somaVetores[i] = vetorA[i] + vetorB[i];
            System.out.println(somaVetores[i]);
        }

        sc.close();
    }
}
