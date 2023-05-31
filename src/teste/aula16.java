package teste;

import EstruturaDeDados.Pilha.Pilha;

public class aula16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        pilha.empilha(1);
        System.out.println(pilha.tamanho());

        System.out.println(pilha.topo());
    }
}
