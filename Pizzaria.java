import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {

        int local = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("===========================");
            System.out.println("Digite a operação desejada");
            System.out.println("1 - Cadastro de Clientes");
            System.out.println("2 - Listagem de Clientes");
            System.out.println("3 - Cadastro de Comanda");
            System.out.println("4 - Listagem de Comanda");
            System.out.println("5 - Cadastro do Tamanho");
            System.out.println("6 - Listagem do Tamanho");
            System.out.println("7 - Cadastro de Sabores");
            System.out.println("8 - Listagem de Sabores");
            System.out.println("9 - Saída");
            System.out.println("===========================");
            local = scanner.nextInt();
            switch (local) {

        
                
            case 1:
            try{
                System.out.println("Digite o ID: ");
                int id = scanner.nextInt();
                System.out.println("Digite seu nome:" );
                String nome = scanner.next();
                System.out.println("Digite seu CPF: ");
                String cpf = scanner.next();
                System.out.println("Digite seu telefone para contato: ");
                int telefone = scanner.nextInt();
                System.err.println("Digite seu endereço: ");
                String endereço = scanner.next();

                Cliente cliente = new Cliente(id, nome, telefone, cpf, endereço);
                    System.out.println(
                    "Id: " + cliente.id + "\n"
                    + "Nome: " + cliente.nome + "\n"
                    + "CPF: " + cliente.cpf + "\n"
                    + "Telefone: "  + cliente.telefone + "\n"
                    + "Endereço: " + cliente.endereço 
            ); 
            } catch (Exception error){
                System.out.println("Ocorreu um erro ao cadastrar o cliente." + error.getMessage());  
            }
            break;

            case 2: 
                for (Cliente cliente : Cliente.clientes){
                    System.err.println(
                    "Id: " + cliente.id + "\n"
                    + "Nome: " + cliente.nome + "\n"
                    + "CPF: " + cliente.cpf + "\n"
                    + "Telefone: "  + cliente.telefone + "\n"
                    + "Endereço: " + cliente.endereço 
            );
                    System.out.println("\n");
            }
            break;

            case 3:
                try{
                    System.out.println("Digite o ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o número da Comanda: ");
                    int numero = scanner.nextInt();
                    System.out.println("Digite a data: ");
                    String data = scanner.next();

                    Comanda comanda = new Comanda(id, numero, data);
                    System.out.println(
                        "Id: " + comanda.id + "\n"
                        + "Número: " + comanda.numero + "\n"
                        + "Data: " + comanda.data 
            );
            } catch (Exception error){
                    System.out.println("Ocorreu um erro ao cadastrar a comanda." + error.getMessage());
            }
            break;

            case 4: 
                for (Comanda comanda : Comanda.comandas) {
                    System.out.println(
                    "Id: " + comanda.id + "\n"
                    + "Número: " + comanda.numero + "\n"
                    + "Data: " + comanda.data 
            );
            } 
            break;

            case 5: 
                try {
                    System.out.println("Digite o ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o tamanho desejado da Pizza: ");
                    String tamanho = scanner.next();

                    Pizza pizza = new Pizza(id, tamanho);
                    System.out.println(
                        "Id: " + pizza.id + "\n"
                        + "Tamanho: " + pizza.tamanho 
            );
            }catch (Exception error) {
                    System.out.println("Ocorreu um erro ao cadastrar a pizza!" + error.getMessage());
            }   
            break;

            case 6: 
                for (Pizza pizza : Pizza.pizzas)  {
                    System.out.println(
                    "Id: " + pizza.id + "\n"
                    + "Tamanho: " + pizza.tamanho
            );
            }
            break;

            case 7: 
                try{
                    System.out.println("Digite o ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o Sabor: ");
                    String descricao = scanner.next();
                    System.out.println("Digite os Adicionais: ");
                    String detalhamento = scanner.next();

                    Sabor sabor = new Sabor(id, descricao, detalhamento);
                    System.out.println(
                        "Id: " + sabor.id + "\n"
                        + "Sabor: " + sabor.descricao + "\n"
                        + "Adicionais: " + sabor.detalhamento
            );
            }catch (Exception error){
                    System.out.println("Ocorreu um erro ao cadastrar o sabor!" + error.getMessage());
            } 
            break;
                            
            case 8: 
                for (Sabor sabor : Sabor.sabores) {
                 System.out.println(
                    "Id: " + sabor.id + "\n"
                    + "Sabor: " + sabor.descricao + "\n"
                    + "Adicionais: " + sabor.detalhamento
            );    
            }
            break;

            case 9:
            System.out.println("Muito Obrigado!!");
            break;
           

            default: 
                System.out.println("Operação Inválida");
            break;

        }

    } while (local != 0);

        scanner.close();
    
    }

}
