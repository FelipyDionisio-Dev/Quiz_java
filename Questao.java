import java.util.Scanner;

public class Questao {
    String pergunta;
    String a, b, c, d, e;
    String respostaCorreta;


    public Questao(String p, String a, String b, String c, String d, String e, String res) {
        this.pergunta = p;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.respostaCorreta = res;
    }

    public boolean aplicarQuestao(Scanner leia) {
        System.out.println(pergunta);
        System.out.println("A) " + a + "\nB) " + b + "\nC) " + c + "\nD) " + d + "\nE) " + e);
        System.out.print("Sua resposta: ");

        String resposta = leia.nextLine();

        if (resposta.equalsIgnoreCase(respostaCorreta)) {
            System.out.println("Correto!\n");
            return true;
        } else {
            System.out.println("Errado! Era: " + respostaCorreta + "\n");
            return false;
        }
    }
}