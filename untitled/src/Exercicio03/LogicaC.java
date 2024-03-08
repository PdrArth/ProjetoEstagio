package Exercicio03;

import java.util.Scanner;

public class LogicaC {
    public void respostac() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de interações que deseja");
        int cont = ler.nextInt();
        int numero1 = 1;
        int numero2 = 3;
        int soma = 0;

        for (int i = 0; i < cont; i++) {
            soma = numero1 + numero2;
            numero1 = soma;
            numero2 = numero2 + 2;

        }
        System.out.println("Respota da letra c) " +soma);
    }
}
