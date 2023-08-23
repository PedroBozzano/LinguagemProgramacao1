package ListaExerc1;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do custo fabricação carro:");
        double custofabricacarro = scanner.nextDouble();
        double partedistribuidor = custofabricacarro * 0.28;
        double parteimposto = custofabricacarro * 0.45;

        double valorfinal = custofabricacarro + partedistribuidor + parteimposto;
        System.out.println("Valor final do carro é de R$"+valorfinal);
        scanner.close();

    }
}