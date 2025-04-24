package tarefas.exercicio20vetor;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        int masculino = 0;
        int feminino = 0;
        double somaFeminina = 0;

        double maiorAltura = 0;

        double[] altura = new double[quantidade];
        char[] genero = new char[quantidade];

        for(int i=0;i<altura.length;i++){
            double alturaPessoa ;
            char generoPessoa ;

            System.out.printf("Altura da %da pessoa:",(i+1));
            alturaPessoa =sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da pessoa: ",(i+1));
            generoPessoa = sc.next().charAt(0);
            altura[i] = alturaPessoa;
            genero[i] = generoPessoa;
            if(generoPessoa == 'm'){
                genero[i] = generoPessoa;
                masculino+=1;
            }
            else if(generoPessoa == 'f'){
                feminino+=1;
                genero[i] = generoPessoa;
                somaFeminina+=alturaPessoa;
            }
            else {
                System.out.println("INVALIDO");
            }
            }
        double menorAltura = altura[0];
        for (int i =0; i<altura.length;i++){

            if (altura[i]>maiorAltura){
                maiorAltura = altura[i];
            }
        }

        for (int i =0; i<altura.length;i++){

            if (altura[i]<menorAltura){
                menorAltura = altura[i];
            }
        }

        System.out.println("menor altura = "+ menorAltura);
        System.out.println("maior altura = "+ maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n",somaFeminina/feminino);
        System.out.println("Número de homens = "+masculino);

        sc.close();
    }
}
