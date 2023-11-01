import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att83 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> inversa = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<20;i++){
            int valor = scan.nextInt();
            lista.add(valor);
        }
        for(int i=0;i<20;i++){
            inversa.add(lista.get(19-i));
        }
        System.out.println("Inversa: "+inversa);
        scan.close();
    }
}
