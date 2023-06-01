package Testes.Arvore;

import EstruturaDeDados.Arvore.Arvore;

public class ArvoreBinaria {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();

        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.emOrdem(arvore.getRaiz());

    }
}
