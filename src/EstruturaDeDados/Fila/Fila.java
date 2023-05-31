package EstruturaDeDados.Fila;

import EstruturaDeDados.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {


    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

  public void enfileira(T elemento){

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
  }

  public T espiar(){
        return this.elementos[0];
  }

  public T desenfileira(){
        final int pos = 0;

        if(this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[pos];
        this.remove(pos);
        return elementoASerRemovido;
  }
}

