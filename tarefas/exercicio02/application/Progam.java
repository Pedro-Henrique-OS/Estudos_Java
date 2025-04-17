package tarefas.exercicio02.application;

import java.util.Scanner;
import java.util.Locale;
import tarefas.exercicio02.entities.Retangulo;


public class Progam {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();


        System.out.println("Entre com a largura e altura do retângulo: ");
        retangulo.heigth = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        double area = retangulo.area();


        System.out.print(retangulo);
    }
}
