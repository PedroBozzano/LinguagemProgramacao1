package ListaExerc1;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor: ");
        int valor = scanner.nextInt();
        int antecessor = valor - 1;

        System.out.println("O antecessor é: "+ antecessor);
        scanner.close();
    }
}
