package Att2;

public class Pokemon {
    // Atributos
    String nome;
    int idade;
    int numeroPokemon;

    // Construtor
    public Pokemon(String nome, int idade, int numeroPokemon) {
        this.nome = nome;
        this.idade = idade;
        this.numeroPokemon = numeroPokemon;
    }

    // Método 1
    public void capturarPokemon() {
        System.out.println(nome + " capturou um novo Pokémon!");
        numeroPokemon++;
    }

    // Método 2
    public void batalhar() {
        System.out.println(nome + " está em uma batalha Pokémon!");
    }
    
    // Método 3
    public void informacoes() {
        System.out.println("Nome do Treinador: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Número de Pokémon capturados: " + numeroPokemon);
        System.out.println(" ");
    }
    
        // Métodos de acesso
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public int getNumeroPokemon() {
        return numeroPokemon;
    }
}
