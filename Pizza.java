import java.util.ArrayList;

public class Pizza {

    public int id;
    public String tamanho;

    public static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public Pizza (
        int id, 
        String tamanho
    ) {
        this.id = id;
        this.tamanho = tamanho;

        pizzas.add(this);
    }
 
}   
