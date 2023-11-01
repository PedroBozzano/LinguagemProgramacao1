import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att82 {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        List<Integer> M = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;
        for(int i=0; i<10;i++){
            int valor = scan.nextInt();
            A.add(valor);
        }
        x = scan.nextInt();
        for (int i=0;i<10;i++){
            int calculo = A.get(i) * x;
            M.add(calculo);
        }
        System.out.println(M);
        scan.close();
    }
}