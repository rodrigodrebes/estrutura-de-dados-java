package Testes.ListaEncadeada;
import EstruturaDeDados.Lista.ListaEncadeada;
public class aula26e27 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        System.out.println(lista);
        System.out.println("Tamanho: "+ lista.getTamanho());
    }

}
