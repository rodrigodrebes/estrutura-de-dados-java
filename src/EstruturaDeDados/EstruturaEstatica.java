package EstruturaDeDados;

import java.util.Arrays;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public int tamanho(){
        return this.tamanho;
    }
    public String toString() {
        return Arrays.toString(elementos);
    }

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }
    protected boolean adiciona(T elemento){
        this.aumentacapacidade();
        if(this.tamanho <this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento){
        if(!(posicao>= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentacapacidade();

        // mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    protected void aumentacapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos=elementosNovos;
        }
    }


    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }


    public Object busca(int posicao){
        if(!(posicao>= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        } else{
            return this.elementos[posicao];
        }
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
}
