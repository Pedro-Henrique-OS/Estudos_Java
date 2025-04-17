package tarefas.exercicio10vetor;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Informe a quantidade de numeros que deseja. OBS(ate o 10): ");
        n = sc.nextInt();
        sc.nextLine();
        int[]vect = new int[n];
        for (int i=0;i< vect.length; i++){
            System.out.println("Digite um numero: ");
            int numero = sc.nextInt();
            vect[i] = numero;


        }
        System.out.println("Numeros negativos: ");
        for (int i = 0 ; i<vect.length; i++){
            if(vect[i]<0){

                System.out.println(vect[i]);
            }
        }



        sc.close();
    }

}
