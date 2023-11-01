import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Att91 {
    public static void main(String[] args) {
        
        Random gerador = new Random();
        List<Integer> VET = new ArrayList<>();
        int contagem = 0;
        List<Integer> posicoes = new ArrayList<>();
        for(int i=0;i<10;i++){
            VET.add(gerador.nextInt(5));
        }
        System.out.println("Vetor: "+VET);
        for(int i=0;i<10;i++){
            for(int y=0;y<10;y++){
                if (VET.get(i).equals(VET.get(y))) {
                    contagem++;
                    posicoes.add(i);
                }
            }
        }
        System.out.println("O vetor possuí "+contagem+" repetidos.");
        System.out.println("E suas posições são: "+posicoes);
    }
}
