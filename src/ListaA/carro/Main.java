package ListaA.carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro carro;
        String marca, modelo;
        int portas;
        double potencia;

        System.out.println("------------ Novo Carro ------------");
        System.out.println("Marca: ");
        marca = input.next();
        System.out.println("Modelo: ");
        modelo = input.next();
        System.out.println("Número de portas: ");
        portas = input.nextInt();
        System.out.println("Deseja informar a potência? [ S / N ]");
        if ((input.next()).equalsIgnoreCase("S")){
            System.out.println("Digite a potência: ");
            potencia = input.nextDouble();
            carro = new Carro(portas, modelo, marca, potencia);
        } else {
            carro = new Carro(portas, modelo, marca);
        }

        System.out.println("Carro registrado com sucesso!");
        carro.mostrarInformacoes();

        System.out.println("\nDeseja ligar o carro? [ S / N ]");
        if ((input.next()).equalsIgnoreCase("S")) {
            carro.ligarCarro();
            System.out.println("Carro ligado!");
        }

        if (carro.ligado){
            System.out.println("\nDeseja desligar o carro? [ S / N ]");
            if ((input.next()).equalsIgnoreCase("S")) {
                carro.desligarCarro();
                System.out.println("Carro desligado!");
            }
        }
    }
}
