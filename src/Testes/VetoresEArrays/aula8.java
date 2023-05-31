package Testes.VetoresEArrays;

import EstruturaDeDados.Vetor.Vetor;

public class aula8 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.adiciona("B"); // 0
        vetor.adiciona("C"); // 1
        vetor.adiciona("E"); // 2
        vetor.adiciona("F"); // 3
        vetor.adiciona("G"); // 4


        System.out.println(vetor);
    }
}
