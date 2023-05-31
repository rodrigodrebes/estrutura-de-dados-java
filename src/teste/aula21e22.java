package teste;

import EstruturaDeDados.Fila.Fila;

public class aula21e22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);

        System.out.println(fila.espiar());

        System.out.println(fila.desenfileira());

        System.out.println(fila);

        System.out.println(fila.desenfileira());

        System.out.println(fila);
    }
}
