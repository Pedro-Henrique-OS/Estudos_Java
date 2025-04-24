package tarefas.exercicio21listas.application;

import tarefas.exercicio21listas.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarioList = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.printf("Emplyoee #%d:",(i+1));
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String nome = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id,nome,salary);
            funcionarioList.add(funcionario);


        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int identificador = sc.nextInt();
        sc.nextLine();
       double porcentagem;

        for (Funcionario funcionario : funcionarioList){
            if(funcionario.getId()==identificador){
                System.out.println("Enter the percentage: ");
                 porcentagem = sc.nextDouble();
                funcionario.increaseSalary(porcentagem);

            }
            else {
                System.out.println("This id does not exist!");


            }
        }

        for (Funcionario funcionario : funcionarioList){
            System.out.println(funcionario);
        }
    }
}
