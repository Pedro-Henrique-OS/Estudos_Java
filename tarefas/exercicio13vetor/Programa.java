package tarefas.exercicio13vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeNumeroPar = 0;
        System.out.println("Quantos numeros deseja adicionar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];
        for(int i=0;i< vect.length;i++){
            System.out.printf(" %d escolhido é ",(i+1));
            int numero = sc.nextInt();
            vect[i] = numero;

            }
        System.out.println("Numeros Pares");
        for(int i = 0; i< vect.length;i++){
            if(vect[i]%2 == 0) {
                quantidadeNumeroPar += 1;
                System.out.print( vect[i] + " ");
            }
        }
        System.out.println("Quantidade numeros pares = "+quantidadeNumeroPar);
    }

}
