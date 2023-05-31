package teste.PilhaEFila;

import java.util.Stack;

public class torreDeHanoi {
    public static void main(String[] args) {

        Stack<Integer> original = new Stack<Integer>();
        Stack<Integer> dest = new Stack<Integer>();
        Stack<Integer> aux = new Stack<Integer>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, dest, aux);

    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux){

        if(n>0){
            torreDeHanoi(n-1, original, aux, dest);
            dest.push(original.pop());
            System.out.println("--------");
            System.out.println("Original: "+  original);
            System.out.println("Destino: "+ dest);
            System.out.println("Auxiliar: "+ aux);
            torreDeHanoi(n-1, aux, dest, original);
        }
    }
}
