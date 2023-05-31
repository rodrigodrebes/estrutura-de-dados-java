package EstruturaDeDados.Lista;

public class ListaEncadeada<T> {
    // cada elemento é um nó (célula)
    // cada nó contém uma referência ao próximo elemento (ponteiro)

    private No<T> inicio;

    private No<T> ultimo;

    // primitivos começam com 0
    private int tamanho;
    public void adiciona(T elemento){

        No<T> celula = new No<T>(elemento);
        if(this.tamanho==0){
            this.inicio=celula;
        }else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void limpa(){
        for(No<T>atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual=proximo;
        }
    }
    @Override
    public String toString() {

      if(this.tamanho==0){
          return"[]";
      }

      StringBuilder builder = new StringBuilder("[");

      No<T> atual = this.inicio;

      for(int i = 0; i <this.tamanho-1; i++){
          builder.append(atual.getElemento()).append(",");
          atual = atual.getProximo();
      }
      builder.append(atual.getElemento()).append("]");
      return builder.toString();
    }

}
