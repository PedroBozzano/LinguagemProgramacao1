package ListaExerc1;
import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu salário:");
        float sal = scanner.nextFloat();
        System.out.println("Escreva o reajuste em porcentagem:");
        float porc = scanner.nextFloat()/100;
        float novosal = sal + (sal*porc);
        System.out.println("Novo salário de: R$"+novosal);
        scanner.close();
        }
}
