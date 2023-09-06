package Att2;

public class Receita {
        // Atributos
        String nome;
        String descricao;
        String[] ingredientes;
    
        // Construtor
        public Receita(String nome, String descricao, String[] ingredientes) {
            this.nome = nome;
            this.descricao = descricao;
            this.ingredientes = ingredientes;
        }
    
        // Método 1
        public void exibirDetalhes() {
            System.out.println("Nome da receita: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Ingredientes:");
    
            for (String ingrediente : ingredientes) {
                System.out.println(" - " + ingrediente);
            }
        }
    
        // Método 2
        public void adicionarIngrediente(String novoIngrediente) {
            String[] novoIngredientes = new String[ingredientes.length + 1];
            System.arraycopy(ingredientes, 0, novoIngredientes, 0, ingredientes.length);
            novoIngredientes[ingredientes.length] = novoIngrediente;
            ingredientes = novoIngredientes;
            System.out.println("Ingrediente adicionado: " + novoIngrediente);
        }
    
        // Método 3
        public void informacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Descrição: " + descricao);
            System.out.println("Ingredientes:");
            System.out.println(" ");
            for (String ingrediente : ingredientes) {
                System.out.println(" - " + ingrediente);
            }
        }
    
        // Métodos de acesso
        public String getNome() {
            return nome;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public String[] getIngredientes() {
            return ingredientes;
        }
}
