package tarefas.exercicio03.entities;

public class Funcionario {
    public String nome;
    public double salarioruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioruto - imposto;
    }
    public void aumentoSalario(double porcetagem){
       salarioruto += salarioruto * porcetagem /100;
    }

    public  String toString(){
        return "Funcionario: " + nome + " ,$ " + String.format("%.2f",salarioLiquido());

    }

}
