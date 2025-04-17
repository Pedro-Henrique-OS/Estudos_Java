package tarefas.exercicio05.application;
import java.util.Locale;
import java.util.Scanner;
import tarefas.exercicio05.entities.Cambio;

public class Programa {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual valor do dolar? ");
        Cambio.valorDolar = sc.nextDouble();


        System.out.println("Quantos dolares deseja comprar? ");
        double quantidadeComprada = sc.nextDouble();

        System.out.printf("quantidade comprada: %.2f , foi pago: %.2f", quantidadeComprada,Cambio.conversorDeMoeda(quantidadeComprada) );
    }
}
