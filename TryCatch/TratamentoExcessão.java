package TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcessão {
    public static void main (String[] args){
        int Number1;
        int Number2;
        try {
            Scanner Scan = new Scanner(System.in);
            System.out.println("Insira o primeiro valor: ");
            Number1 = Scan.nextInt();
            System.out.println("Insira o segundo valor: ");
            Number2 = Scan.nextInt();
            System.out.println(Number1 + Number2);
            Scan.close();
        }
        catch(InputMismatchException e){
            System.out.println(e + "Insira um valor inteiro!");
        }
    }
}
