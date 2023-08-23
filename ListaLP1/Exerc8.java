package ListaExerc1;
import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total de Votos:");
        float total = scanner.nextFloat();
        System.out.println("Total de Votos Brancos:");
        float brancos = scanner.nextFloat();
        System.out.println("Total de Votos Nulos:");
        float nulos = scanner.nextFloat();
        System.out.println("Total de Votos Válidos:");
        float validos = scanner.nextFloat();

        float pbrancos = (brancos/total)*100;
        float pnulos = (nulos/total)*100;
        float pvalidos = (validos/total)*100;

        if (pbrancos + pnulos + pvalidos != 100) {
            System.out.println("Algum dado está incongruente!");            
        }
        else{
            System.out.println(pbrancos+"% votos BRANCOS.");
            System.out.println(pnulos+"% votos NULOS.");
            System.out.println(pvalidos+"% votos VÁLIDOS.");
        }
        scanner.close();
    }
}
