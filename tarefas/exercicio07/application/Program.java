package tarefas.exercicio07.application;
import java.util.Locale;
import java.util.Scanner;
import tarefas.exercicio07.entities.Banco;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.print("Enter account number: ");
        int numeroDaConta = sc.nextInt();


        sc.nextLine();


        System.out.print("Enter account holder: ");
        String nomeDoTitular = sc.nextLine();



        Banco banco;

        System.out.println("Is there na initial deposit (y/n)? ");
        char resposta = sc.nextLine().charAt(0);
        if(resposta == 'y'){
            System.out.println("Enter initial deposit value: ");
            valor = sc.nextDouble();
             banco = new Banco(numeroDaConta,nomeDoTitular,valor);
        }
        else {
             banco = new Banco(numeroDaConta,nomeDoTitular);
        }



        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println("Enter a deposit value: ");
        valor = sc.nextDouble();
        banco.depositar(valor);
        sc.nextLine();

        System.out.println("Account data: ");
        System.out.println(banco);

        System.out.println("Enter a withdraw value: ");
        valor = sc.nextDouble();
        banco.saque(valor);
        sc.nextLine();

        System.out.println("Account data: ");
        System.out.println(banco);

    }
}
