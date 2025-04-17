package tarefas.exercicio08vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Primeira vez  criando um vetor em java
        // programa deve ler a quantidade de usuarios que iram participar, depois pegar altura de cada um e no final dar a media de altura.

        int n = sc.nextInt();
        double[] vect = new double[n]; // explicando: tipo no caso double []- cria o vetor = new double[] - tipo dos dados e quantidade
        for (int i = 0; i<n; i++){
            vect[i]  = sc.nextDouble();
        }
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum += vect[i];
        }
        double media = sum/3;
        System.out.printf("a media foi: %.2f%n",media);

        sc.close();
    }
}
