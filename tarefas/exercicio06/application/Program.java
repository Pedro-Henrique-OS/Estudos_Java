package tarefas.exercicio06.application;

import java.util.Locale;
import java.util.Scanner;
import tarefas.exercicio06.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();



        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,price,quantity);
        System.out.println();

        product.setName("Computador"); // aqui eu tive que criar um metodo para poder acessar o name ja que ele estava privado. isso pra alterar o valor agora vou pegar o get para ler
        System.out.println("nome : "+ product.getName()); // aqui  eu chamei apenas o nome

        product.setPrice(500);
        System.out.println("Valor : "+ product.getPrice());
    // valores estao sendo alterados
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();
    }

}
