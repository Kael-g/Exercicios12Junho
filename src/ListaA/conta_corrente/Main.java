package ListaA.conta_corrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int numero_conta, opcao;
        ContaCorrente nova_conta;
        double valor = 0;

        System.out.println("----------- Nova Conta -----------");
        System.out.println("Digite o nome do titular: ");
        nome = input.nextLine();
        System.out.println("Digite o número da conta: ");
        numero_conta = input.nextInt();
        System.out.println("Fazer um depósito inicial? [ S / N ]");
        if ((input.next()).equalsIgnoreCase("S")){
            System.out.println("Valor do depósito inicial: ");
            for (valor = input.nextDouble(); valor < 0; valor = input.nextDouble()){
                System.out.println("O depósito não pode ser negativo. Digite um valor válido: ");
            }
            nova_conta = new ContaCorrente(numero_conta, nome, valor);
        } else {
            nova_conta = new ContaCorrente(numero_conta, nome);
        }

        System.out.println("Conta criada com sucesso!\n");
        opcao = menu();
        boolean sair = false;
        do {
            switch (opcao) {
                case 0:
                    sair = true;
                    System.out.println("Volte sempre!");
                    break;
                case 1:
                    nova_conta.mostraInformacoes();
                    opcao = menu();
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    if ((valor = input.nextDouble()) < 0) {
                        System.out.println("O depósito não pode ser negativo.");
                    } else {
                        nova_conta.depositoConta(valor);
                    }
                    opcao = menu();
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    if ((valor = input.nextDouble()) > nova_conta.saldo || valor < 0) {
                        System.out.printf("Valor inválido. O saldo da conta é de R$ %.2f\n", nova_conta.saldo);
                    } else {
                        nova_conta.saqueConta(valor);
                    }
                    opcao = menu();
                    break;
                default:
                    System.out.println("Opção inválida");
                    opcao = menu();

            }
        } while (!sair);

    }

    public static int menu(){
        System.out.println("\n1 - Ver informações da conta\n2 - Depósito\n3 - Saque\n0 - Sair");
        return new Scanner(System.in).nextInt();
    }
}
