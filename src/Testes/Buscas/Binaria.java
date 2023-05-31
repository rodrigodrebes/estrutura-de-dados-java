package Testes.Buscas;

import java.util.Scanner;

// Vetor PRECISA estar ordenado;
// O(log n)
public class Binaria {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i<vetor.length; i++){
            vetor[i] = i*2;
        }

        System.out.println("Qual número buscado?: ");
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();


        boolean achou = false;

        int inicio = 0;

        int fim = vetor.length-1;

        int meio;

        while(inicio <= fim){
            meio = (int) ((inicio + fim) /2);

            if(vetor[meio] == buscado){
                achou=true;
                break;
            } else if(vetor[meio]< buscado){
                inicio = meio + 1;
            }else {
                fim = meio - 1;
            }
        }
        if(achou){
            System.out.println("Achou!");
        }else{
            System.out.println("Não achou...");
        }

    }
}
