package Exercicio03;

import java.util.Scanner;

public class LogicaD {
    public void respostad(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de interações que deseja");
        int cont = ler.nextInt();
        int numero1 = 4;
        int numero2 = 12;
        int soma = 0;
        for(int i = 0; i < cont; i++) {
            soma = numero1 + numero2;
            numero1 = soma;
            numero2 = numero2 + 8;

        }
        System.out.println("Respota da letra d) " +soma);




    }

}
