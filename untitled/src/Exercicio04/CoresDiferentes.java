package Exercicio04;

public class CoresDiferentes {
    String Luz1 = "Verde";
    String Luz2 = "Azul";
    String Luz3 = "Branco";

    public void interruptor1() {
        System.out.println("\u001B[32m Luz acessa. \u001B[0m");
    }

    public void interruptor2() {
        System.out.println("\u001B[34m Luz acessa. \u001B[0m");
    }

    public void interruptor3() {
        System.out.println("Luz acessa.");
    }


}
