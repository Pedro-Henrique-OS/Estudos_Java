package tarefas.exercicio12vetor.entities;

public class Pessoa {
   private String nome;
   private int idade;
   private double altura;

   public Pessoa(String nome, int idade,double altura){
       this.nome = nome;
       this.idade = idade;
       this.altura = altura;
   }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
