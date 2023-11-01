import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att84 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> A = new ArrayList<>(N-1);
        List<Integer> B = new ArrayList<>(N-1);
        List<Integer> somas = new ArrayList<>(N-1);
        for(int i=0;i<(N);i++){
            int valorA = scan.nextInt();
            A.add(valorA);
        }
        for(int i=0;i<(N);i++){
            int valorB = scan.nextInt();
            B.add(valorB);
        }
        for (int i=0;i<(N);i++){
            int soma = A.get(i) + B.get(i);
            somas.add(soma); 
        }
        System.out.println("Somas: "+somas);
        scan.close();
    }
}
