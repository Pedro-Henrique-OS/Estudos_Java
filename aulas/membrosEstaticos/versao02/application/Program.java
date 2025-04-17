package aulas.membrosEstaticos.versao02.application;

import java.util.Locale;
import java.util.Scanner;
import aulas.membrosEstaticos.versao02.entities.Calculator;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.print("Enter radius: ");
        calculator.raio = sc.nextDouble();



        System.out.printf("Circunferencia: %.2f%n", calculator.cincurferencia(calculator.raio));
        System.out.printf("Volume: %.2f%n",calculator.volume(calculator.raio) );
        System.out.printf("PI value: %.2f%n", calculator.PI);
        sc.close();
    }


}
