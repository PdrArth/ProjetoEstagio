package Exercicio02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> Fibonacci = new ArrayList<>();
        int primeiro = 1;
        int segundo = 0;
        int soma = 0;
        int numero = 0;
        boolean valido = true;
        while (valido) {
            try {
                System.out.println("Digite um numero ");
                numero = ler.nextInt();
                valido = false;
                for (int i = 0; i < numero; i++) {
                    soma = primeiro + segundo;
                    primeiro = segundo;
                    segundo = soma;
                    Fibonacci.add(soma);
                }
                if (Fibonacci.contains(numero)) {
                    System.out.println("Numero digitado presente");

                } else {
                    System.out.println("Numero ausente");

                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida ");
                ler.nextLine();
                valido = true;
            }

        }

//soma = 0 + 1 = soma - 1
        //soma = 1 + 1 = soma - 2
        //soma = 1 + 2 = soma - 3
        //soma =  2 + 3 soma - 5
        //soma = 3 + 5 = soma - 8
        //soma = 5 + 8 = soma - 13
    }
}
