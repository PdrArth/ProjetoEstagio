package Exercicio03;

import java.util.Scanner;

public class LogicaE {
    public void respostae() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de interações que deseja");
        int cont = ler.nextInt();
        int primeiro = 1;
        int segundo = 0;
        int soma = 0;
        for (int i = 0; i < cont; i++) {
            soma = primeiro + segundo;
            primeiro = segundo;
            segundo = soma;

        }
        System.out.println("Respota da letra e) " +soma);

    }
}


