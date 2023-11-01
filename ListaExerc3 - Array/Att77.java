public class Att77 {
    
    public static void main (String[] args){
        int aux;
        int[] vetor = {5,1,4,2,7,8,3,6};
        for (int i=7; i>=4; i=i-1){
            aux = vetor[i];
            vetor[i] = vetor [8-i+1];
            vetor [8-i+1] = aux;
            }
        vetor [2] = vetor[0];
        vetor[vetor[2]] = vetor[vetor[1]];

        for (int y=0; y <vetor.length; y = y+1){
            System.out.println(vetor[y]);
        }
    }
}
