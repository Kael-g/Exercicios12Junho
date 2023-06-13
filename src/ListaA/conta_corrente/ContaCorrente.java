package ListaA.conta_corrente;

public class ContaCorrente {
    int numero_conta;
    String nome_correntista;
    double saldo;

    public ContaCorrente(int numero_conta, String nome_correntista, double saldo) {
        this.numero_conta = numero_conta;
        this.nome_correntista = nome_correntista;
        this.saldo = saldo;
    }
    public ContaCorrente(int numero_conta, String nome_correntista) {
        this.numero_conta = numero_conta;
        this.nome_correntista = nome_correntista;
        this.saldo = 0;
    }

    public void depositoConta(double valor){
        saldo += valor;
    }
    public void saqueConta(double valor){
        saldo -= valor;
    }

    public void mostraInformacoes(){
        System.out.printf("Nome do correntista: %s\nNúmero da conta: %d\nSaldo: R$ %.2f\n", nome_correntista, numero_conta, saldo);
    }
}

