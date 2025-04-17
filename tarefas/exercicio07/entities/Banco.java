package tarefas.exercicio07.entities;

public class Banco {
    private  int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public Banco(){

    }

    public Banco(int numeroDaConta,String nomeDoTitular,double saldo){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public Banco(int numeroDaConta,String nomeDoTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;

    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }


    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }





    public void depositar(double valor){
         saldo += valor;
    }

    public void saque(double valor){
       saldo -= (valor + 5) ;
    }

    @Override
    public String toString() {
        return "Account " + numeroDaConta +
                ", Holder: " + nomeDoTitular +
                ", Balance: $ " + String.format("%.2f", saldo);
    }
}
// AINDA FALTA ARRUMAR, A LOGICA ESTA CORRETA MAS O ENCAPSULAMENTO PRECISA DE AJUSTES TO INDO TREINARRRRRRR