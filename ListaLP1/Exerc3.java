package ListaExerc1;

public class Exerc3 {
    public static void main(String[] args) {
        float a1 = (4/2) + (2/4);
        float a2 = 4/2+2/4;
        if (a1 == a2) {
            System.out.println("Primeiro par SIM");            
        }
        else{
            System.out.println("Primeiro par NÃO");
        }

        float b1 = 4/(2+2)/4;
        float b2 = 4/2+2/4;
        if (b1 == b2) {
            System.out.println("Segundo par SIM");            
        }
        else{
            System.out.println("Segundo par NÃO");
        }

        float c1 = (4+2)*2-4;
        float c2 = 4+2*2-4;
        if (c1 == c2) {
            System.out.println("Terceiro par SIM");            
        }
        else{
            System.out.println("Terceiro par NÃO");
        }
    }
}
