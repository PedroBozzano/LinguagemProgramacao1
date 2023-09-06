package Att2;

public class Pessoa {
    //Atributos
    double peso;
    double altura;
    String nome;
    double imc;

    //Construtor
    public Pessoa(float peso, double altura, String nome){
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
    }

    //Método 1
    public void apresentação(){
        System.out.println("Olá, "+nome+" tudo bem?");
        System.out.println("Iremos calcular seu IMC e passar se está dentro do peso ou fora do ideal.");
    }

    //Método 2
    public void imc(){
        imc = peso / (altura*altura);
        System.out.println("Seu IMC: "+imc);
    }

    //Método 3
    public void mensagem(){
        if (imc<17) {
            System.out.println("Você está muito abaixo do peso.");
        }

        if (imc>=17 && imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        }

        if (imc>=18.5 && imc < 25) {
            System.out.println("Você está com peso normal.");
        }
        
        if (imc>=25 && imc < 30) {
            System.out.println("Você está acima do peso.");
        }
        
        if (imc>=30 && imc < 35) {
            System.out.println("Você está com obesidade grau 1.");
        }
        
        if (imc>=35) {
            System.out.println("Você está com obesidade grau 2.");
        }
        System.out.println(" ");
    }
    
    //Método de acesso
    public String getNome(){
        return nome;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }
}
