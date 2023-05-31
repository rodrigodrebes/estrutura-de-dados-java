package Testes.VetoresEArrays;

import EstruturaDeDados.Vetor.Vetor;

public class aula4 {
    public static void main(String[] args){
        Vetor vetor = new Vetor(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        for(String elemento : vetor.getElementos()) {
            System.out.println(elemento);
        }

    }

}
