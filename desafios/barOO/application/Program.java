package desafios.barOO.application;

import java.util.Locale;
import java.util.Scanner;
import desafios.barOO.entities.Bill;

public class Program {
    public static void main (String[]args ){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.println("Sexo: ");
        bill.gender = sc.nextLine().charAt(0);
        if (bill.gender != 'F'){


            if (bill.gender != 'M'){
                System.out.println("Valor invalido");

            }
        }


        System.out.println("Quantidade de cervejas:");
        bill.beer = sc.nextInt();

        System.out.println("Quantidade de refrigerantes:");
        bill.softDrink = sc.nextInt();

        System.out.println("Quantidade de espetinhos:");
        bill.barbecue = sc.nextInt();


        System.out.println("Relatório:");
        System.out.printf("Consumo = R$ %.2f \n Couvert = R$ %.2f \n Ingresso = R$ %.2f \n ",bill.feeding(),bill.cover(),bill.ticket());
        System.out.printf("Valor a pagar = R$ %.2f",bill.total());
    }
}
