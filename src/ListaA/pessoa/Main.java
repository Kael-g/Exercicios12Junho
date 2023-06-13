package ListaA.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa juca = new Pessoa("juca",17,88,1.7);

        juca.mostrarAtributos();

        System.out.println("\nEscolha uma opção:\n1 - Engordar\n2 - Emagrecer\n3 - Envelhecer\n4 - Crescer\n0 - Sair");
        int opcao = input.nextInt();
        switch (opcao){
            case 0:
                System.out.println("Nenhuma alteração realizada.");
                break;
            case 1:
                System.out.println("Quantos quilos?");
                juca.engordar(input.nextDouble());
                break;
            case 2:
                System.out.println("Quantos quilos?");
                juca.emagrecer(input.nextDouble());
                break;
            case 3:
                System.out.println("Quantos anos?");
                juca.envelhecer(input.nextInt());
                break;
            case 4:
                System.out.println("Quantos centímetros?");
                juca.crescer(input.nextDouble());
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println();
        juca.mostrarAtributos();

    }
}
