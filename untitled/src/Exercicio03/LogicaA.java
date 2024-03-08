package Exercicio03;


import java.util.Scanner;

public class LogicaA {
    public void resposta(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de interações que deseja");
        int cont = ler.nextInt();
       int numero1 = 1;
       int soma = 0;
       int numero = 2;
       for(int i = 0; i < cont; i++){
           soma = numero1 + numero;
           numero1 = soma;
       }
        System.out.println("Respota da letra a) " +soma);

    }
}
