import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Att78 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for(int i =0; i < 10; i++){
            String nome = scan.nextLine();
            nomes.add(nome.toUpperCase());
        }

        System.out.println("Digite o nome que deseja consultar:");
        String consulta = scan.nextLine();
        for(String nome : nomes){
            if (nome.equals(consulta.toUpperCase())) {
                System.out.println("Achei! :)");
                return;
            }

        scan.close();
        }
        System.out.println("Não Achei :(");
    }
}

