package tarefas.exercicio19vetor;



import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int quantidade = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[quantidade];
        double[] n1 = new double[quantidade];
        double[] n2 = new double[quantidade];

        String nome = null;
        double nota1 = 0;
        double nota2 = 0;
        double media =0;

        for(int i=0;i<n1.length;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ",(i+1));
            nome = sc.nextLine();
            nota1 = sc.nextDouble();
            sc.nextLine();
            nota2 = sc.nextDouble();
            sc.nextLine();

            nomes[i] = nome;
            n1[i] = nota1;
            n2[i] = nota2;


        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0;i<n1.length;i++){
            if((n1[i]+n2[i])/2 >= 6){
                System.out.println(nomes[i]);
            }
        }

        sc.close();


    }
}
