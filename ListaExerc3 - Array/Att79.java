import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Att79 {
    public static void main(String[] args) {
        List<Float> notas = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <20; i++){
            float nota = scan.nextFloat();
            notas.add(nota);
        }
        float soma = 0;
        for (int i=0; i<20; i++){
            float valor = notas.get(i);
            soma = soma + valor;
        }
        float media = soma/20;
        int contagem = 0;
        for (int i=0;i<20;i++){
            if(notas.get(i)>=media){
                contagem++;
            }
        }
        System.out.println("A média da turma é: "+ media);
        System.out.println("Alunos acima da média da turma: "+contagem);
        scan.close();
    }
}