package Att2;

public class Estacionamento {
    //Atributos
    String Modelo;
    String Dono;
    int Vaga;

    //Construtor
    public Estacionamento (String Modelo, String Dono, int Vaga){
        this.Dono = Dono;
        this.Modelo = Modelo;
        this.Vaga = Vaga;
    }

    //Método 1
    public void DonoCarro(){
        System.out.println("O "+Dono+" é dono do "+ Modelo);
    }

    //Método 2
    public void VagaCarro(){
        System.out.println("O "+Modelo+" está na vaga "+Vaga);
    }

    //Método 3
    public void Dados(){
        System.out.println("Carro: "+Modelo);
        System.out.println("Dono: "+Dono);
        System.out.println("Vaga: "+Vaga);
        System.out.println(" ");
    }

    //Métodos de acesso
    public String getModelo(){
        return Modelo;
    }

    public int getvaga(){
        return Vaga;
    }

    public String getDono(){
        return Dono;
    }
}
