package ListaA.bola;

public class Bola {
    String cor, marca, material;
    double circunferencia, velocidade;

    public Bola(String cor, String marca, String material, double circunferencia, double velocidade) {
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
    }

    public void trocaCor (String cor){
        this.cor = cor;
    }

    public void mostraCor(){
        System.out.println("Cor: " + cor);
    }
}
