package Testes.VetoresEArrays;

import java.util.ArrayList;

public class aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        // adicionar
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        // adicionar em index específico
        arrayList.add(1, "B");

        System.out.println(arrayList);

        // pesquisa
        boolean existe = arrayList.contains("A");
        if(existe){
            System.out.println("Elemento existe!");
        }

        // posição
        int posicao = arrayList.indexOf("D");
        if (posicao>-1){
            System.out.println("Elemento existe");
        }else{
            System.out.println("Elemento não existe!!!");
        }

        // .get busca o elemento no index
        System.out.println(arrayList.get(2));

        // método de remover pelo index ou elemento
        arrayList.remove("A");
        System.out.println(arrayList);

        // tamanho da lista
        System.out.println(arrayList.size());


    }
}
