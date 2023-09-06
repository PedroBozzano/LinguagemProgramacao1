package Att2;

public class Hospital {
    //Atributos
    String Paciente;
    String Medico;
    int Sala;

    //Construção
    public Hospital (String Paciente, String Medico, int Sala){
        this.Paciente = Paciente;
        this.Medico = Medico;
        this.Sala = Sala;
    }

    //Método 1
    public void InfosPaciente(){
        System.out.println("Paciente: "+Paciente);
        System.out.println("Sala: "+Sala);
    }

    //Método 2
    public void ResponsavelMedico(){
        System.out.println("A sala "+Sala+" é de responsábilidade do doutor "+Medico);
    }

    //Método 3

    public void ControleSala(){
        System.out.println("A sala" + Sala+" tem 3 paciêntes");
    }

    //Método de acesso
    public String getPaciente(){
        return Paciente;
    }

    public String getMedico(){
        return Medico;
    }

    public int getSala(){
        return Sala;
    }
}
