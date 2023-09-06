package Att2;

public class Animes {
    //Atributos
    String nomeAnime;
    int episodios;
    int temporadas;

    //Construtor
    public Animes(String nomeAnime, int episodios, int temporadas){
        this.episodios = episodios;
        this.nomeAnime = nomeAnime;
        this.temporadas = temporadas;
    }

    //Método 1
    public void nomeAnime(){
        System.out.println("Anime análisado é: "+nomeAnime);
    }
    //Método 2 
    public void totalEpisodios(){
        System.out.println("O "+nomeAnime+" possui "+episodios+" episódios");
    }

    //Método 3
    public void mediaEpisodiosTemporadas(){
        System.out.println("Ele possui "+temporadas+" temporadas");
        int media = episodios/temporadas;
        System.out.println("Isso é em média "+media+" episódios em cada temporada");
        System.out.println(" ");
    }

}
