package EstruturaDeDados.Arvore;

public class Elemento<T>{

    private T valor;
    private Elemento<T> esquerda;
    private Elemento<T> direita;

    public Elemento(T novoValor){
        this.valor = novoValor;
        this.esquerda=null;
        this.direita=null;
    }
    public T getValor(){
        return valor;
    }

    public void setValor(T valor){
        this.valor =valor;
    }

    public Elemento<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento<T> novoElemento){
       this.esquerda=esquerda;
    }

    public Elemento<T> getDireita(){
        return this.direita;
    }

    public void setDireita(Elemento<T> novoElemento){
        this.direita=direita;
    }

}
