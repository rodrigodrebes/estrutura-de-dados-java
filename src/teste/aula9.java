package teste;

import EstruturaDeDados.Vetor;

public class aula9 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); // 0
        vetor.adiciona("G"); // 1
        vetor.adiciona("D"); // 2
        vetor.adiciona("E"); // 3
        vetor.adiciona("F"); // 4
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento E");

        int pos = vetor.busca("E");
        vetor.remove(pos);
        System.out.println(vetor);

    }
}
