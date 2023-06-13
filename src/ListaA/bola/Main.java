package ListaA.bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bola bola1 = new Bola("amarelo","adidas","couro sintetico", 70, 0);
        Bola bola2 = new Bola("laranja", "nike","borracha", 75, 10);

        System.out.println("------- Bola 1 -------");
        bola1.mostraCor();
        System.out.println("Escolha uma nova cor para a bola 1:");
        bola1.trocaCor(input.next());
        bola1.mostraCor();

    }
}
