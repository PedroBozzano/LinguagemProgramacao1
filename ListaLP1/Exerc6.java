package ListaExerc1;
import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a base: ");
        float base = scanner.nextFloat();
        System.out.println("Escreva a altura: ");
        float altura = scanner.nextFloat();

        float area = base * altura;
        System.out.println("A área é: "+ area);
        scanner.close();
    }
}
