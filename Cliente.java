import java.util.ArrayList;

public class Cliente{

    public int id;
    public String nome;
    public String cpf;
    public int telefone;
    public String endereço;
    public ArrayList<Pizza> pizza;

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(
        int id,
        String nome, 
        int telefone,
        String cpf,
        String endereço
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereço = endereço;
        this.pizza = new ArrayList<Pizza>();

        clientes.add(this);

    }

    public static Cliente verificaId (int id) throws Exception{
        for (Cliente cliente : clientes){
            if (cliente.id == id){
                return cliente;
            }
        }

        throw new Exception("Cliente não encontrado");
    }

}
