package Testes.PilhaEFila;

import EstruturaDeDados.Fila.Fila;

public class ExercicioFilaAtendimento {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int max_Prioridade =3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");

        prioridade.enfileira("Pessoa P1");
        prioridade.enfileira("Pessoa P2");
        prioridade.enfileira("Pessoa P3");
        prioridade.enfileira("Pessoa P4");
        prioridade.enfileira("Pessoa P5");

        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");
        regular.enfileira("Pessoa 7");
        regular.enfileira("Pessoa 8");

        while(!regular.estaVazia() || !prioridade.estaVazia()){
            int count = 0;
            while (!prioridade.estaVazia() && count < max_Prioridade) {
               atendePessoa(prioridade);
                count++;

            }
            if(!regular.estaVazia()){
               atendePessoa(regular);
            }
            if (prioridade.estaVazia()){
                while(!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }


    }

    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida");
    }

}
