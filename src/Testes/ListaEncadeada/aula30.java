package Testes.ListaEncadeada;

import EstruturaDeDados.Lista.ListaEncadeada;

public class aula30 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();
    }
}
