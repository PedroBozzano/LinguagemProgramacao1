package ListaExerc1;
import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade");
        int ano = scanner.nextInt();
        System.out.println("Digite o mês");
        int mês = scanner.nextInt();
        System.out.println("Digite o dia");
        int dia = scanner.nextInt();

        int idadedias = ano*365 + mês*30 + dia;
        System.out.println("Idade: "+idadedias+" dias.");
        scanner.close();
    }
}
