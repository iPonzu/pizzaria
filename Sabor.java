import java.util.ArrayList;

public class Sabor {

    public int id;
    public String descricao;
    public String detalhamento;

    public static ArrayList<Pizza> pizzas;

    public static ArrayList<Sabor> sabores = new ArrayList<Sabor>();

    public Sabor(
        int id,
        String descricao, 
        String detalhamento
    ) {
        this.id = id;
        this.descricao = descricao;
        this.detalhamento = detalhamento;

        sabores.add(this);

    }
    public static Sabor verificaId (int id) throws Exception{
        for (Sabor sabor : sabores){
            if (sabor.id == id){
                return sabor;
            }
        }

        throw new Exception("Sabor não encontrado");
    }
}
