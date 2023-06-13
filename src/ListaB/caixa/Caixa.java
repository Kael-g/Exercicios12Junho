package ListaB.caixa;

public class Caixa {
    double saldo;

    public Caixa (){
        saldo = 1000.00;
    }

    public void credito (double valor){
        saldo += valor;
    }

    public void debito (double valor){
        saldo -= valor;
    }
}
