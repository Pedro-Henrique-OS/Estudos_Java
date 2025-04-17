package tarefas.exercicio05.entities;

public class Cambio {
   public  static  double valorDolar;
   public static double quantidadecomprada;
    public  static final double IOF = 1.06;

   public static double conversorDeMoeda(double quantidadecomprada){
       return valorDolar * IOF * quantidadecomprada;

   }
}
