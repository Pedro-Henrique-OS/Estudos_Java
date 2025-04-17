package tarefas.exercicio18vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        int[] vetorIdade = new int[quantidade];
        String [] vetorNomes = new String[quantidade];

        int idade = 0;
        String nome = null;
        int posicao = 0;


        for (int i = 0; i<vetorIdade.length;i++){
            System.out.printf("Dados da %da pessoa: ",(i+1));
            System.out.println();
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            vetorNomes[i] = nome;
            vetorIdade[i] = idade;
        }
        int maisVelho = 0;

        for (int i = 0; i<vetorIdade.length;i++){

            if (vetorIdade[i]>maisVelho){
                maisVelho = vetorIdade[i];
                posicao = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: "+ vetorNomes[posicao]);

        sc.close();
    }
}
