package ListaA.carro;

public class Carro {
    int portas;
    String modelo, marca;
    double potencia;
    boolean ligado = false;

    public Carro(int portas, String modelo, String marca, double potencia) {
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Carro(int portas, String modelo, String marca) {
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void mostrarInformacoes(){
        System.out.printf("Marca: %s\nModelo: %s\nNº de portas: %d\nPotência: %.1f cavalos\n", marca, modelo, portas, potencia);
    }

    public void ligarCarro (){
        ligado = true;
    }

    public void desligarCarro (){
        ligado = false;
    }
}
