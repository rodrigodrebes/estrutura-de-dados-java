package teste.vetoresEarrays;

import EstruturaDeDados.Contato;
import EstruturaDeDados.Vetor.Lista;

public class aula11 {

    public static void main(String[] args) {

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato@gmail.com");

        // Generics
        Lista<String> vetor = new Lista<String>(1);

        // Generics
        Lista<Contato> vetor2 = new Lista<Contato>(1);

        vetor.adiciona("Olá");

        vetor2.adiciona(c1);

        System.out.println(vetor);
        System.out.println(vetor2);

        }

    }

