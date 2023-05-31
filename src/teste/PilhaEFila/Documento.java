package teste.PilhaEFila;

public class Documento {
    private String nome;
    private int numFolhas;

    public Documento(String nome, int numFolhas){
        super();
        this.nome = nome;
        this.numFolhas=numFolhas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public int getNumFolhas() {
        return numFolhas;
    }
    public void setNumFolhas(int numFolhas){
        this.numFolhas = numFolhas;
    }
}
