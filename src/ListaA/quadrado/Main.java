package ListaA.quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------- QUADRADO ---------");
        System.out.println("Digite o valor dos lados: ");
        double lado = input.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
        int opcao = menu(quadrado.retornaLado());
        boolean sair = false;
        do {
            switch (opcao){
                case 0:
                    System.out.println("------- FIM QUADRADO -------");
                    sair = true;
                    break;
                case 1:
                    System.out.println("Digite o novo tamanho dos lados:");
                    if ((lado = input.nextDouble()) < 0){
                        System.out.println("Valor inválido.");
                    } else {
                        quadrado.mudaLado(lado);
                    }
                    opcao = menu(quadrado.retornaLado());
                    break;
                case 2:
                    System.out.println("Área:\t" + quadrado.calculaArea()+"cm²");
                    opcao = menu(quadrado.retornaLado());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    opcao = menu(quadrado.retornaLado());
                    break;

            }
        } while (!sair);

    }

    public static int menu(double lado){
        System.out.println("Os lados do quadrado medem "+ lado + "cm. O que deseja fazer?\n1 - Mudar valor dos lados\n2 - Calcular área\n0 - Sair");
        return new Scanner(System.in).nextInt();
    }
}
