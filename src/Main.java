import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criação do Scanner e da lista, para ler e armazenar as informações na mesma
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        
        //Criação do loop para repetir quantas vezes o usuário desejar
        while (true) {
            System.out.println("Deseja adicionar uma nova pessoa? (sim/não)");
            String resposta = scanner.nextLine();
            

            //validação para identificar a resposta do usuário, sem o ~ pois o java não o le propriamente
            if(resposta.equalsIgnoreCase("nao")){
                break;
            }

            // Criando e definindo os valores dos endereços
            Endereco endereco = new Endereco();
            System.out.println("Informe a rua:");
            String rua = scanner.nextLine();
            System.out.println("Informe o número:");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Informe a cidade:");
            String cidade = scanner.nextLine();
            endereco.setEndereco(rua, numero, cidade);

            // Criando e definindo os valores das pessoas
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe o nome da pessoa:");
            String nome = scanner.nextLine();
            System.out.println("Informe a idade da pessoa:");
            int idade = Integer.parseInt(scanner.nextLine());
            pessoa.setPessoa(nome, idade, endereco);

            
            pessoas.add(pessoa);
        }

       // Loop para exibir todas as informações da pessoa
        System.out.println("\nInformações das pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Endereço: ");
            System.out.println("Rua: " + pessoa.getEndereco().getRua());
            System.out.println("Número: " + pessoa.getEndereco().getNumero());
            System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
            System.out.println(); 
        }

        scanner.close();
    }

}
