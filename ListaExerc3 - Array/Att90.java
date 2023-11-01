import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Att90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        int contagem=0;
        for(int i=0;i<5;i++){
            int valor1 = sc.nextInt();
            vetor.add(valor1);
        }
        int verificador = sc.nextInt();
        for(int i=0;i<5;i++){
            if(vetor.get(i).equals(verificador)){
                contagem++;
            }
        }
        System.out.println("Valor "+verificador+" aparece "+contagem+" vezes no vetor.");
        sc.close();
    }
}
