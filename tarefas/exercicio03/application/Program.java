package tarefas.exercicio03.application;
import java.util.Locale;
import java.util.Scanner;
import tarefas.exercicio03.entities.Funcionario;

public class Program {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Salario bruto: ");
        funcionario.salarioruto = sc.nextDouble();

        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Qual a porcentagem para aumentar o salário?");
        double porcetagem = sc.nextDouble();
        funcionario.aumentoSalario(porcetagem);

        System.out.println(funcionario);
        sc.close();
    }
}
