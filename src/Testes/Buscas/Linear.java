package Testes.Buscas;

import java.util.Scanner;

// O(n)
public class Linear {
    public static void main(String[] args) {

        int [] vetor = new int[5];

        for (int i=0; i<vetor.length; i++){

            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Digite o valor desejado: " );
        Scanner leitor = new Scanner(System.in);
        int buscado = leitor.nextInt();

        boolean achou = false;
        for(int i=0; i <vetor.length; i++){
            if(vetor[i] == buscado){
                achou = true;
                break;
            }
        }
        if(achou){
            System.out.println("Achou!");
        }else{
            System.out.println("Não achou...");
        }
    }
}
