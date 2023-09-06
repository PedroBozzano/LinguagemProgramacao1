package Att2;

public class Teste {
    public static void main(String[] args) {
        System.out.println("_____ Teste de Classe: Casa _____");
        Casa casa = new Casa(500, 5, "Bege");
        casa.comodos();
        casa.vizinhos();
        casa.informacoes();

        System.out.println("_____ Teste de Classe: Animes _____");
        Animes animes = new Animes("Naruto", 600, 5);
        animes.nomeAnime();
        animes.totalEpisodios();
        animes.mediaEpisodiosTemporadas();
        
        System.out.println("_____ Teste de Classe: Pessoa _____");
        Pessoa pessoa = new Pessoa(65, 1.85, "Pedro");
        pessoa.apresentação();
        pessoa.imc();
        pessoa.mensagem();

        System.out.println("_____ Teste de Classe: Pokemon _____");
        Pokemon pokemon = new Pokemon("Pedro", 25, 15);
        pokemon.batalhar();
        pokemon.capturarPokemon();
        pokemon.informacoes();
        
        System.out.println("_____ Teste de Classe: Cliente _____");
        Cliente cliente = new Cliente(10, "Julia", "Rua 7");
        cliente.atualizarEndereco("Rua 9");
        cliente.fazerCompra();
        cliente.informacoes();

        System.out.println("_____ Teste de Classe: Produto _____");
        Produto produto = new Produto(250, "Parafuso", 19.50);
        produto.exibirDetalhes();
        produto.informacoes();
        produto.atualizarPreco(25.50);
        produto.getCodigo();

        System.out.println("_____ Teste de Classe: Receita _____");
        Receita receita = new Receita("Bolo", "Bolo de Chocolate",new String[]{"Ovo", "Farinha", "Leite"});
        receita.adicionarIngrediente("Fermento");
        receita.exibirDetalhes();
        receita.informacoes();
    
        System.out.println("______ Teste de Classe: Aula ______");
        Aula aula = new Aula("Matemática", 7, "Manhã");
        aula.PeriodoMateria();
        aula.SalaMateria();
        aula.InfoMateria();

        System.out.println("_____ Teste de Classe: Estacionamento _____");
        Estacionamento estacionamento = new Estacionamento("Gol", "Paulo Arantes", 9);
        estacionamento.DonoCarro();
        estacionamento.VagaCarro();
        estacionamento.Dados();

        System.out.println("_____ Teste de Classe: Hospital _____");
        Hospital hospital = new Hospital("Cauan Vinícius", "Julio Freitas", 15);
        hospital.ResponsavelMedico();
        hospital.InfosPaciente();
        hospital.ControleSala();
    }

}

