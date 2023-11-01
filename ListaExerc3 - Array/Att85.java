import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Att85 {
    public static void main(String[] args) {
        Random gerarTemperatura = new Random();
        List<Integer> temperaturas = new ArrayList<>(365);
        float mediaAnual =0;
        int soma = 0;
        int menor = 0;
        int maior = 0;
        int contagem =0;
        for(int i=0;i<365;i++){
            temperaturas.add(gerarTemperatura.nextInt(-15,36));
            soma = soma + temperaturas.get(i);
            if(temperaturas.get(i)<menor){
                menor = temperaturas.get(i);
            }
            else if (temperaturas.get(i)> maior){
                maior = temperaturas.get(i);
            }
        }
        mediaAnual = soma/365;
        for(int i=0;i<365;i++){
            if(temperaturas.get(i)<mediaAnual){
                contagem++;
            }
        }
        System.out.println("Menor temperatura do ano: "+menor);
        System.out.println("Maior temperatura do ano: "+maior);
        System.out.println("Média anual: "+mediaAnual);
        System.out.println("Dias abaixo da temperatura média anual: "+contagem);
    }
}
