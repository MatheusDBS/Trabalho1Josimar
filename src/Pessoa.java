class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    //Método para definir os valores da pessoa
    public void setPessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    //Métodos para obter os valores
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
