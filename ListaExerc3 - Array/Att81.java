import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att81 {
    public static void main(String[] args) {
        
        List<Integer> Q = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<20;i++){
            int valor = scan.nextInt();
            if(valor > 0){
                Q.add(valor);
            }
            else{
                System.out.println("Digite valor positivo!");
            }
        }
        int menor = Q.get(0);
        for (int i=0; i<20; i++){
     
            if (Q.get(i)< menor){
                menor = Q.get(i);
            }
        }
        int posicao = 0;
        for(int i=0; i<20; i++){
            if(Q.get(i)==menor){
                posicao = posicao + 1;
            }
        }
        System.out.println("Menor elemento: "+menor);
        System.out.println("Sua posição: "+posicao);
        scan.close();
    }
}

