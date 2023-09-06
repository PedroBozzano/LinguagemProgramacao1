package Att2;

public class Casa {
    //Atributos
    int numeroCasa;
    int comodos;
    String cor;

    //Construtor
    public Casa (int numeroCasa, int comodos, String cor){
        this.numeroCasa = numeroCasa;
        this.comodos = comodos;
        this.cor = cor;
    }

    //Método 1
    public void vizinhos(){
        System.out.println("O número da casa é: N°"+numeroCasa);
        int vizinho1 = numeroCasa+10;
        int vizinho2 = numeroCasa-10;
        System.out.println("Seus vizinhos são "+vizinho1+" e "+ vizinho2);
    }

    //Método 2
    public void comodos(){
        System.out.println("Sua casa é "+numeroCasa+" e possui "+comodos+" cômodos");
    }

    //Método 3
    public void informacoes(){
        System.out.println("N°: "+numeroCasa);
        System.out.println("Cor: "+cor);
        System.out.println("Cômodos: "+comodos);
        System.out.println(" ");
    }

    //Métodos de acesso
    public int getNumeroCasa(){
        return numeroCasa;
    }
    public int getComodos(){
        return comodos;
    }
    public String getCor(){
        return cor;
    }
}
