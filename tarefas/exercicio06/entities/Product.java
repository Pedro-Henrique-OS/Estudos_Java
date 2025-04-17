package tarefas.exercicio06.entities;

public class Product {
    private String name;
    private double price;
    public int quantity;

    // podem ser criados alguns tipos de construtores 1- padrão / 2 - o que coloca todos os valores e o 3- que coloco apenas alguns e todos podem ser utilizados
    // construtor padrão 1 -- Serve quando você quer criar um objeto vazio primeiro e preencher depois.
    public Product(){

    }

    // Aqui utilizei um construtor 2 utilizando todos -- Quando você já tem todos os dados e quer criar o produto de uma vez.
    public Product(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    // E nesse utilizando uma sobre carga, vou usar o name e price -- Quando você ainda não tem a quantidade em estoque, por exemplo.
    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
