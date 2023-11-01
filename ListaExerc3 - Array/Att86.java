import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Att86 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            int valor = sc.nextInt();
            lista.add(valor);
        }
        lista.sort(null);
        System.out.println(lista);
        sc.close();
    }
}
