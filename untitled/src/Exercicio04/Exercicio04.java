package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        System.out.println("Voces esta em uma sala com 3 interruptores,cada um conectado a uma lâmpada em uma sala diferente.");
        System.out.println("Escolha qual caminho quer seguir");
        System.out.println("Digite 1 para Salas com lampadas com cores diferentes");
        System.out.println("Digite 2 para Salas com lampadas iguais");
        int caminho = ler.nextInt();
        if (caminho == 1) {
            while (cont < 2) {
                CoresDiferentes cores = new CoresDiferentes();
                System.out.println("Qual dos 3 interruptores deseja ligar?");
                int interruptores = ler.nextInt();
                if (interruptores == 1) {
                    cores.interruptor1();
                    System.out.println("Vou a sala 1");
                    System.out.println(cores.Luz1);
                } else if (interruptores == 2) {
                    cores.interruptor2();
                    System.out.println("Vou a sala 2");
                    System.out.println(cores.Luz2);
                } else if (interruptores == 3) {
                    cores.interruptor1();
                    System.out.println("Vou a sala 3");
                    System.out.println(cores.Luz3);
                }
                cont++;
            }
            System.out.println("O interruptor 1 eh da sala 1 pela cor verde");
            System.out.println("O interruptor 2 eh da sala 2 pela cor azul");
            System.out.println("O interruptor 3 eh da sala 3 pela cor branca");
        }
        if (caminho == 2) {
            while (cont < 2) {
                CoresIguais coresIguais = new CoresIguais();
                System.out.println("Qual dos 3 interruptores deseja ligar?");
                int interruptores = ler.nextInt();
                if (interruptores == 1) {
                    coresIguais.ligar1();
                } else if (interruptores == 2) {
                    coresIguais.ligar2();
                } else if (interruptores == 3) {
                    coresIguais.ligar3();
                }
                cont++;
            }
            System.out.println("O lampanda da sala 1 estava bem quente com isso o interruptores1 eh da sala 1 ");
            System.out.println("O lampanda da sala 2 estava morna com isso o interruptores2 eh da sala 2 ");
            System.out.println("O lampanda da sala 3 estava fira com isso o interruptores3 eh da sala 3 ");
        }
    }
}
