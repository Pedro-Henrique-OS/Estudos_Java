package tarefas.exercicio09vetor;
import tarefas.exercicio09vetor.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        Produto [] vect = new Produto[n];


        for (int i = 0; i<n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double valor = sc.nextDouble();
            vect[i] = new Produto(nome, valor);
            System.out.println("oi : " + vect[i]);
        }
        double soma = 0.0;
        for (int i=0; i<n;i++){
            soma += vect[i].getValor();
        }
        double media = soma/n;
        System.out.println("A media é: "+ media);
        sc.close();
    }
}
