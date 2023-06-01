package Testes.Arvore;

import EstruturaDeDados.Arvore.Arvore;

public class ArvoreBinaria {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();

        arvore.adicionar(25);
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(2);
        arvore.adicionar(55);
        arvore.adicionar(33);
        arvore.adicionar(20);

        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("\nPré-Ordem: ");
        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\nPós-Ordem: ");
        arvore.posOrdem(arvore.getRaiz());
    }
}
