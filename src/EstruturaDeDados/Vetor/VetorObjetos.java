package EstruturaDeDados.Vetor;
import java.util.Arrays;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
    }

    // adiciona elementos no vetor (aula 3)
    public boolean adiciona(Object elemento){
        this.aumentacapacidade();
      if(this.tamanho <this.elementos.length){
          this.elementos[this.tamanho] = elemento;
          this.tamanho++;
          return true;
      }
      return false;
}

    // retorna o tamanho do vetor(aula4)
    public int tamanho(){
        return this.tamanho;
}


    // toString printa(aula4)
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

    // get todos elementos;
    public Object[] getElementos() {
        return elementos;
    }

    // método que retorna o elemento por posição(aula5)
    public Object busca(int posicao){
        if(!(posicao>= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        } else{
            return this.elementos[posicao];
        }
    }

    // busca sequencial por elemento (retorna se existe ou não) (aula6)
    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
    return -1;
    }

    // overload de adiciona para adicionar um elemento em qualquer posição do vetor (aula7)
    // 0 1 2 3 4 5 6 = tamanho é 5
    // B C E F G + +
    public void adiciona(int posicao, Object elemento){
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

    }

    // aumenta capacidade do vetor (aula 8)
    private void aumentacapacidade(){
        if (this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos=elementosNovos;
        }
    }

    // remove elemento específico do vetor (aula 9)
    // B G D E F --> Posição a ser removida é 1 (G)
    // 0 1 2 3 4 --> Tamanho é 5
    //vetor[1] = vetor[2]
    //vetor[2] = vetor[3]
    //vetor[3] = vetor[4]
    public void remove(int posicao){
        if(!(posicao>= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i=posicao; i<this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--; // como irá remover um elemento, o tamanho diminui

    }


}
