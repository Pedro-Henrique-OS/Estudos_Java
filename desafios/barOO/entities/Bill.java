package desafios.barOO.entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;


    public double feeding(){
       return beer * 5 + softDrink * 3 + barbecue * 7;
    }
    public double cover(){
        if(feeding() > 30){
            return 0;
        }
        else {
            return 4;
        }
    }

    public double ticket(){
        if(gender == 'F'){
            return 8;
        }
        else if(gender == 'M'){
            return 10;
        }
        else {
            return 0.0; // Se for colocado outra coisa alem de F e M
        }
    }

    public double total(){
        return feeding() + cover() + ticket();
    }
}
