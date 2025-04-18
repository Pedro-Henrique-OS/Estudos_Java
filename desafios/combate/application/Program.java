package desafios.combate.application;
import java.util.Scanner;
import java.util.Locale;
import desafios.combate.entities.Champion;

public class program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome1,nome2;
        int vidaInicial1,ataque1,armadura1;
        int vidaInicial2,ataque2,armadura2;
        int quantidade;


        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.println("Nome:");
        nome1 = sc.nextLine();
        System.out.println("Vida inicial:");
        vidaInicial1 = sc.nextInt();
        System.out.println("Ataque:");
        ataque1 = sc.nextInt();
        System.out.println("Armadura:");
        armadura1 = sc.nextInt();
        sc.nextLine();

        Champion champion1 = new Champion(nome1,vidaInicial1,ataque1,armadura1);

        System.out.println(champion1);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.println("Nome:");
        nome2 = sc.nextLine();
        System.out.println("Vida inicial:");
        vidaInicial2 = sc.nextInt();
        System.out.println("Ataque:");
        ataque2 = sc.nextInt();
        System.out.println("Armadura:");
        armadura2 = sc.nextInt();
        Champion champion2 = new Champion(nome2,vidaInicial2,ataque2,armadura2);

        System.out.println("Quantos turnos você deseja executar?");
        quantidade = sc.nextInt();

        for(int i = 1;i<=quantidade;i++){

            System.out.println("Round: "+i);
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println(champion1);
            System.out.println(champion2);
            if(champion1.getLife()<=0 || champion2.getLife()<=0){
                System.out.println("FIM DE JOGO!");
                i = quantidade;
            }

        }




    }
}
