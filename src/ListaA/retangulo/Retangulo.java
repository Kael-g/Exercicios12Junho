package ListaA.retangulo;

public class Retangulo {
    double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void mudaBase(double valor){
        this.base = valor;
    }

    public void mudaAltura(double valor){
        this.altura = valor;
    }

    public double retornaBase(){
        return base;
    }

    public double retornaAltura(){
        return altura;
    }

    public double calculaArea(){
        return base*altura;
    }

    public double calculaPerimetro(){
        return base*2 + altura*2;
    }
}
