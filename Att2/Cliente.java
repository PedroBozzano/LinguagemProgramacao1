package Att2;

public class Cliente {
    // Atributos
    int id;
    String nome;
    String endereco;

    // Construtor
    public Cliente(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método 1
    public void fazerCompra() {
        System.out.println(nome + " está fazendo uma compra.");
    }

    // Método 2
    public void atualizarEndereco(String novoEndereco) {
        endereco = novoEndereco;
        System.out.println("Endereço de " + nome + " atualizado para: " + novoEndereco);
    }

    // Método 3
    public void informacoes() {
        System.out.println("ID do Cliente: " + id);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Endereço do Cliente: " + endereco);
        System.out.println(" ");
    }

    // Métodos de acesso
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
