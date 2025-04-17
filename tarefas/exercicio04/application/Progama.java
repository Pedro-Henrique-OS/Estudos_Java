package tarefas.exercicio04.application;
import java.util.Locale;
import java.util.Scanner;
import tarefas.exercicio04.entities.Aluno;

public class Progama {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String situacaoEscolar;


        Aluno aluno = new Aluno();

        System.out.println(" Nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("n1: ");
        aluno.n1 = sc.nextDouble();

        System.out.println("n2: ");
        aluno.n2 = sc.nextDouble();
        System.out.println("n3: ");
        aluno.n3 = sc.nextDouble();

        System.out.println(aluno.media());

        if (aluno.media() >= 60){

            System.out.println("NOTA FINAL = " + aluno.media() + "\n" + "Aprovado");
        }
        else {

            System.out.println("NOTA FINAL = " + aluno.media() + "\n" + "Reprovado");
            System.out.printf("FALTARAM %.2f PONTOS%n", aluno.pontosFaltantes());
        }
    }
}



