package Exercicio03;

import java.util.Scanner;

public class LogicaB {
    public void respostab() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de interações que deseja");
        int cont = ler.nextInt();
        int numero1 = 2;
        int soma = 0;
        int numero2 = numero1;

        for (int i = 0; i < cont; i++) {
            soma = numero1 + numero2;
            numero1 = soma;
            numero2 = numero1;

        }
        System.out.println("Respota da letra b) " +soma);
    }

}
