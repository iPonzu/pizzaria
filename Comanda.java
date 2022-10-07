import java.util.ArrayList;

public class Comanda {
    
    public int id;
    public int numero;
    public String data;
    public ArrayList<Pizza> pizza;

    public static ArrayList<Comanda> comandas = new ArrayList<Comanda>();

    public Comanda(
        int id,
        int numero,
        String data
    ){
        this.id = id;
        this.numero = numero;
        this.data = data;
        this.pizza = new ArrayList<Pizza>();

        comandas.add(this);
    }
    public static Comanda verificaId (int id) throws Exception{
        for (Comanda comanda : comandas){
            if (comanda.id == id){
                return comanda;
            }
        }

        throw new Exception("Comanda não encontrado");
    }
}
