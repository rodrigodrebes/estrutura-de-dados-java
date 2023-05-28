package teste;

public class aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-5678", "contato@gmail.com");
        Contato c2 = new Contato("Contato 2", "99999-99999", "contato2@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);

        System.out.println(vetor.tamanho());
        int pos = vetor.busca(c2);
        if (pos> -1){
            System.out.println("Elemento existe no vetor");
        }else {
            System.out.println("Elemento não existe no vetor");
        }

    }
}
