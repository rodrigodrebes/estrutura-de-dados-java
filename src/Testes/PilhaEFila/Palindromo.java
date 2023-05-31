package Testes.PilhaEFila;

import java.util.Stack;

public class Palindromo {

    public static void main(String[] args) {
        String palava = "ADA";
        String palavra2= "Maria";

        System.out.println(testaPalindromo(palavra2));

        System.out.println(testaPalindromo(palava));
    }
    public static boolean testaPalindromo(String palavra){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i<palavra.length(); i++){
            stack.push(palavra.charAt(i));
        }

        String palavraInvbersa ="";
        while(!stack.isEmpty()){
            palavraInvbersa += stack.pop();
        }
        if (palavraInvbersa.equals(palavra)){
            return true;
        }
        return false;
    }

}
