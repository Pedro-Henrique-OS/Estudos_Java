package tarefas.exercicio12vetor.application;

import tarefas.exercicio12vetor.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double alturaMedia = 0.0;
        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa [] vetor = new Pessoa[n]; // aqui eu criou um vetor do tipo pessoa
        for(int i =0; i< vetor.length;i++){
            System.out.printf("Dados da %da pessoa",(i+1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vetor[i] = new Pessoa(nome,idade,altura);
            alturaMedia += vetor[i].getAltura();
        }

        double menor16 = 0;

// Primeiro, calcula a quantidade de pessoas com menos de 16
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                menor16 += 1;
            }
        }

// Calcula e imprime a altura média
        alturaMedia = alturaMedia / vetor.length;
        System.out.printf("Altura média: %.2f%n", alturaMedia);

// Calcula e imprime a porcentagem
        double porcentagem = (menor16 / vetor.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

// Agora imprime os nomes das pessoas com menos de 16
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }

    }
}
