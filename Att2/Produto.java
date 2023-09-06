package Att2;

public class Produto {
    // Atributos
    int codigo;
    String nome;
    double preco;

    // Construtor
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Método 1
    public void exibirDetalhes() {
        System.out.println("Código do produto: " + codigo);
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: $" + preco);
    }

    // Método 2
    public void atualizarPreco(double novoPreco) {
        preco = novoPreco;
        System.out.println("Preço do produto atualizado para $" + novoPreco);
        System.out.println(" ");
    }

    // Método 3
    public void informacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: $" + preco);
    }

    // Métodos de acesso
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
