package ListaB.caixa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa();
        String opcao;
        System.out.println("------- NOVO CAIXA (Saldo: R$ 1.000,00) -------");
        System.out.println("Quantos lançamentos deseja fazer?");
        int lancamentos;
        for (lancamentos = input.nextInt(); lancamentos < 0; lancamentos = input.nextInt()){
            System.out.println("Valor inválido. Por favor, digite um valor válido");
        }

        for (int i = 0; i < lancamentos; i++){
            System.out.printf("%dº lançamento\nCrédito ou Débito? [ C / D ]\n", i+1);
            switch (opcao = input.next()){
                case "C":
                case "c":
                    System.out.println("Valor do crédito: ");
                    caixa.credito(input.nextDouble());
                    break;
                case "D":
                case "d":
                    System.out.println("Valor do débito: ");
                    caixa.debito(input.nextDouble());
                    break;
                default:
                    System.out.println("Opção inválida");
                    i--;
            }
        }

        System.out.printf("Saldo final: R$ %s", df.format(caixa.saldo));
    }
}
