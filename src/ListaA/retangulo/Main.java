package ListaA.retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------- RETANGULO ---------");
        System.out.println("Digite o valor da base: ");
        double base = input.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        int opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
        boolean sair = false;
        do {
            switch (opcao){
                case 0:
                    System.out.println("------- FIM RETÂNGULO -------");
                    sair = true;
                    break;
                case 1:
                    System.out.println("Digite o novo tamanho da base:");
                    if ((base = input.nextDouble()) < 0){
                        System.out.println("Valor inválido.");
                    } else {
                        retangulo.mudaBase(base);
                    }
                    opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
                    break;
                case 2:
                    System.out.println("Digite o novo tamanho da altura:");
                    if ((altura = input.nextDouble()) < 0){
                        System.out.println("Valor inválido.");
                    } else {
                        retangulo.mudaAltura(altura);
                    }
                    opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
                    break;
                case 3:
                    System.out.println("Perímetro:\t" + retangulo.calculaPerimetro()+"cm");
                    opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
                    break;
                case 4:
                    System.out.println("Área:\t" + retangulo.calculaArea()+"cm²");
                    opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    opcao = menu(retangulo.retornaBase(), retangulo.retornaAltura());
                    break;

            }
        } while (!sair);

    }

    public static int menu(double b, double a){
        System.out.println("Retângulo "+ b +"cm X "+ a +"cm. O que deseja fazer?\n1 - Mudar tamanho da base\n2 - Mudar tamanho da altura\n3 - Calcular perímetro\n4 - Calcular área\n0 - Sair");
        return new Scanner(System.in).nextInt();
    }
}
