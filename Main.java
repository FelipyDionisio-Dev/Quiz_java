import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);


    cabecalho cabecalhoObj = new cabecalho(
            "UNIVERSIDADE ALFREDO NASCER",
            "Felipy Dionizio",
            "BRENO PIMENTA",
            "Questionário sobre Programação"
    );

    cabecalhoObj.exibirCabecalho();


    Questao[] questoes = new Questao[15];

    questoes[0] = new Questao("1. O que significa a sigla POO?", "Programação Orientada a Objetos", "Programação Operacional Objetiva", "Processo Orientado a Objetos", "Programaçao Organizada Oficial", "Processamento Objetivo Online", "A");
    questoes[1] = new Questao("2. Qual palavra é usada para criar um objeto em Java?", "class", "void", "new", "public", "this", "C");
    questoes[2] = new Questao("3. Java é considerado uma linguagem:", "Somente compilada", "Somente interpretada", "Compilada e interpretada", "Somente visual", "Nenhuma das alternativas", "C");
    questoes[3] = new Questao("4. Qual estrutura é usada para repetir várias vezes?", "if", "else", "for", "switch", "case", "C");
    questoes[4] = new Questao("5. Qual tipo de dado é usado para texto em Java?", "int", "double", "char", "String", "boolean", "D");
    questoes[5] = new Questao("6. Qual símbolo é usado para finalizar comandos em Java?", ":", ".", ";", ",", "#", "C");
    questoes[6] = new Questao("7. O método principal de um programa Java é:", "start()", "main()", "run()", "java()", "program()", "B");
    questoes[7] = new Questao("8. Qual palavra define uma classe em Java?", "new", "class", "public", "private", "static", "B");
    questoes[8] = new Questao("9. Qual destes é um tipo inteiro?", "String", "boolean", "double", "int", "char", "D");
    questoes[9] = new Questao("10. O comando usado para mostrar algo na tela é:", "System.in.println()", "System.out.println()", "print.ln()", "mostrar()", "escrever()", "B");
    questoes[10] = new Questao("11. Qual estrutura é usada para tomar decisão?", "for", "while", "if", "do", "repeat", "C");
    questoes[11] = new Questao("12. Um objeto é criado a partir de uma:", "variável", "classe", "biblioteca", "tela", "função", "B");
    questoes[12] = new Questao("13. Qual palavra indica que um método não retorna valor?", "int", "return", "static", "void", "null", "D");
    questoes[13] = new Questao("14. Scanner é usado para:", "desenhar na tela", "ler dados do usuário", "fazer contas", "criar objetos", "apagar variáveis", "B");
    questoes[14] = new Questao("15. Qual operador é usado para comparação de igualdade em Java?", "=", "!=", "==", "&&", "++", "C");

    int acertos = 0;


    for (int i = 0; i < questoes.length; i++) {
      System.out.println("Questão " + (i + 1) + " de " + questoes.length);
      if (questoes[i].aplicarQuestao(leia)) {
        acertos++;
      }
    }








    System.out.println("============================================");
    System.out.println("            QUIZ FINALIZADO!                ");
    System.out.println("ALUNO: " + "Felipy Dionizio");
    System.out.println("VOCÊ ACERTOU: " + acertos + " de 15");


    double nota = (acertos / 15.0) * 100;
    System.out.printf("DESEMPENHO: %.1f%%\n", nota);
    System.out.println("============================================");

    leia.close();
  }
}