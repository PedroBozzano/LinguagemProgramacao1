import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Att89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        int contagem=0;
        for(int i=0;i<15;i++){
            int valor1 = sc.nextInt();
            v1.add(valor1);
        }
        for(int i=0;i<15;i++){
        int valor2 = sc.nextInt();
        v2.add(valor2);
        }
        for(int i=0;i<15;i++){
            if(v1.get(i).equals(v2.get(i))){
                contagem++;
            }
        }
        System.out.println("Vetor 1 possuí "+contagem+" valor dentro de Vetor 2 na mesma posição.");
        sc.close();
    }
}
