package Testes.PilhaEFila;

import EstruturaDeDados.Fila.Fila;

public class ExercicioFila {
    public static void main(String[] args) {
        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 10));
        filaImpressora.enfileira(new Documento("B", 20));
        filaImpressora.enfileira(new Documento("C", 30));
        filaImpressora.enfileira(new Documento("D", 40));

        while(!filaImpressora.estaVazia()){
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento " + doc.getNome());
            try{
                Thread.sleep(200*doc.getNumFolhas());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos documentos foram impressos");
    }
}
