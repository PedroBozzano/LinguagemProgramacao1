package Att2;

public class Aula {
    //Atributos
    String Materia;
    int Sala;
    String Periodo;

    //Construtor
    public Aula (String Materia, int Sala, String Periodo){
        this.Materia = Materia;
        this.Sala = Sala;
        this.Periodo = Periodo;
    }

    //Método 1
    public void PeriodoMateria(){
        System.out.println("A " + Materia + " é do período da " + Periodo);
    }

    //Método 2
    public void SalaMateria(){
        System.out.println("A "+ Sala + " está passando " + Materia);
    }

    //Método 3
    public void InfoMateria(){
        System.out.println("Se a " + Materia + " está passando na sala " + Sala + ", então a sala " + Sala + " está tendo aula no período da " + Periodo);
        System.out.println(" ");
    }

    //Método de Acesso
    public String getMateria(){
        return Materia;
    }

    public int getSala(){
        return Sala;
    }

    public String getPeriodo(){
        return Periodo;
    }

}
