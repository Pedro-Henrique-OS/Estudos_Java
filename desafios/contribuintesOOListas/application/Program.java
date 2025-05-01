package desafios.contribuintesOOListas.application;

import desafios.contribuintesOOListas.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> listaContribuinte = new ArrayList<>();
        double rendaAnual,prestacaoServico,ganhoCapital,gastosMedicos,gastosEducacionais;

        System.out.println("Quantos contribuintes você vai digitar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<quantidade; i++){
            System.out.printf("Digite os dados do %do contribuinte: \n",(i+1));
            System.out.println("Renda anual com salário: ");
            rendaAnual = sc.nextDouble();
            System.out.println("Renda anual com prestação de serviço: ");
            prestacaoServico = sc.nextDouble();
            System.out.println("Renda anual com ganho de capital: ");
            ganhoCapital = sc.nextDouble();
            System.out.println("Gastos médicos: ");
            gastosMedicos = sc.nextDouble();
            System.out.println("Gastos educacionais: ");
            gastosEducacionais = sc.nextDouble();

            TaxPayer contribuinte = new TaxPayer(rendaAnual,prestacaoServico,ganhoCapital,gastosMedicos,gastosEducacionais);

            listaContribuinte.add(contribuinte);

        }


        for(int i=0; i<listaContribuinte.size();i++){
            System.out.printf("Resumo do %do contribuinte: \n",(i+1));
            System.out.printf("Imposto bruto total: %.2f\n", listaContribuinte.get(i).grossTax());
            System.out.printf("Abatimento: %.2f\n", listaContribuinte.get(i).taxRebate());
            System.out.printf("Imposto devido: %.2f\n", listaContribuinte.get(i).netTax());

        }
    }
}
