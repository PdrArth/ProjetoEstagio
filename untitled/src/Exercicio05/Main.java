package Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite algo");
        String digitar = ler.nextLine();
        String Inverso = "";

        for (int i = digitar.length() - 1; i >= 0; i--) {
            Inverso += digitar.charAt(i);
        }

        System.out.println("String original: " + digitar);
        System.out.println("String invertida: " + Inverso);

    }
}
