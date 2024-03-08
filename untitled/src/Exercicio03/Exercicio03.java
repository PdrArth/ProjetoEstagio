package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        var valido = true;
        Scanner ler = new Scanner(System.in);
        while (valido) {
            System.out.println("Escolha qual resposta voce deseja.");
            System.out.println("""
                                    Digite [a] para a resposta em codigo a pergunta A
                                    Digite [b] para a resposta em codigo a pergunta B
                                    Digite [c] para a resposta em codigo a pergunta C
                                    Digite [d] para a resposta em codigo a pergunta D
                                    Digite [e] para a resposta em codigo a pergunta E
                    """);
            System.out.print("Escolha: ");
            var resposta = ler.nextLine();
            if (resposta.equalsIgnoreCase("a")) {
                LogicaA logicaA = new LogicaA();
                logicaA.resposta();
                valido = false;
            } else if (resposta.equalsIgnoreCase("b")) {
                LogicaB logicaB = new LogicaB();
                logicaB.respostab();
                valido = false;
            } else if (resposta.equalsIgnoreCase("c")) {
                LogicaC logicaC = new LogicaC();
                logicaC.respostac();
                valido = false;
            } else if (resposta.equalsIgnoreCase("d")) {
                LogicaD logicaD = new LogicaD();
                logicaD.respostad();
                valido = false;
            } else if (resposta.equalsIgnoreCase("e")) {
                LogicaE logicae = new LogicaE();
                logicae.respostae();
                valido = false;
            } else {
                System.out.println("Letra invalida");
                System.out.println("Deseja ir novamente [1] para sim [2] para nao");
                int novamente = ler.nextInt();
                if(novamente == 1){
                    valido = true;
                    ler.nextLine();
                }
               else{ valido = false;
            }
        }
    }
    }
}
