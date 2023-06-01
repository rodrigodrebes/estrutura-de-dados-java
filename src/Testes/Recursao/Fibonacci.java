package Testes.Recursao;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o número que deseja verificar: ");
        int n = numero.nextInt();

        System.out.println("O "+n+"º número Fibonacci é: "+ fibonacci(n));

        int soma=0;
        for (int i=0; i<=n; i++){
            soma += fibonacci(i);
        }
        System.out.println("A soma dos " + n + " primeiros números de Fibonacci é: "+soma);

    }
    public static int fibonacci(int n){

        if (n == 0){
            return 0;
        } else if(n ==1){
            return 1;
        }
    else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

}
