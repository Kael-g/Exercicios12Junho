package ListaB.jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------- NOVO JARDIM ---------");
        System.out.println("Digite o nome do jardim:");
        String nome = input.next();
        System.out.println("Digite a quantidade de plantas que há no Jardim " + nome);
        int plantas = input.nextInt();
        System.out.println("Digite a área em metros quadrados do jardim:");
        double area_total = input.nextDouble();
        System.out.println("Digite a quantidade em gramas de adubo:");
        double adubo = input.nextDouble();
        System.out.println("Digite a área em metros quadrados com grama do jardim:");
        double area_grama = input.nextDouble();
        System.out.println("Digite o valor de 1kg de adubo:");
        double valor_adubo = input.nextDouble() / 1000;
        System.out.println("Digite o valor por metro quadrado do corte de grama:");
        double valor_corte = input.nextDouble();

        Jardinagem jardim = new Jardinagem(nome, plantas, area_total, adubo, area_grama, valor_adubo, valor_corte);

        jardim.mostraInfos();

        System.out.println("\nAdubar a grama? [ S / N ]");
        if ((input.next()).equalsIgnoreCase("S")) {
            System.out.printf("Quantidade de adubo necessária: %.0fg\n", jardim.usarAdubo());
            System.out.printf("Custo: R$ %.2f\n", jardim.precoAdubo());
        }

        System.out.printf("\nCortar a grama por R$ %.2f? [ S / N ]\n", jardim.precoCorteGrama());
        if ((input.next()).equalsIgnoreCase("S")) {
            System.out.print("Grama cortada.");
        }
    }
}
