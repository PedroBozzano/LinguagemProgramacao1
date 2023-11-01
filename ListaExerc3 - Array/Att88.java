import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Att88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        
        try {
            for(int i=0;i<20;i++){
                int valor = sc.nextInt();
                vetor.add(valor);
            }
            int verificador = sc.nextInt();
            for(int i=0;i<20;i++){
                if(vetor.get(i).equals(verificador)){
                    vetor.remove(i);
                }
            }
            System.out.println(vetor);
    
        } catch (Exception e) {
            System.out.println(vetor);
        }        sc.close();
    }
}
