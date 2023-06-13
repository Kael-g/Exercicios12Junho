package ListaA.quadrado;

public class Quadrado {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public void mudaLado(double lado){
        this.lado = lado;
    }

    public double retornaLado(){
        return lado;
    }

    public double calculaArea(){
        return lado*lado;
    }
}
