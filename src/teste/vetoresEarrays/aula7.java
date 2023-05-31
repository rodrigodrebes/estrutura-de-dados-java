package teste.vetoresEarrays;

import EstruturaDeDados.Vetor.Vetor;

public class aula7 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("B"); // 0
        vetor.adiciona("C"); // 1
        vetor.adiciona("E"); // 2
        vetor.adiciona("F"); // 3
        vetor.adiciona("G"); // 4

        System.out.println(vetor);

        vetor.adiciona(0, "A");

        System.out.println(vetor);
    }
}
