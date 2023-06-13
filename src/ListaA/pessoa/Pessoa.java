package ListaA.pessoa;

public class Pessoa {
    String nome;
    int idade;
    double peso, altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int anos){
        for (int i = 1; i <= anos; i++){
            idade++;
            if (idade < 21){
                crescer(0.5);
            }
        }
    }

    public void engordar (double quilos){
        peso += quilos;
    }

    public void emagrecer (double quilos){
        peso -= quilos;
    }

    public void crescer (double centimetros){
        altura += centimetros/100;
    }

    public void mostrarAtributos(){
        System.out.printf("Nome: %s\nIdade: %d anos\nPeso: ", nome, idade);
        if (peso == 0){
            System.out.println("Não informado");
        } else {
            System.out.println(peso+ "kg");
        }
        System.out.printf("Altura: %.2fm", altura);
    }

}
