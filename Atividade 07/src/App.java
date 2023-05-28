
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {;
        int tam = 1000, rec, ite;
        long inicioRec, fimRec, tempoRec, inicioIte, fimIte, tempoIte;
        Random r = new Random();
        Vetor vetor = new Vetor(tam);

        for(int i = 0; i < tam; i++) {
            vetor.adiciona(r.nextInt());
        }

        inicioRec = System.nanoTime();
        rec = vetor.recursivo();  
        fimRec = System.nanoTime();

        inicioIte = System.nanoTime();
        ite = vetor.iterativo();
        fimIte = System.nanoTime();

        tempoRec = (fimRec - inicioRec);
        tempoIte = (fimIte - inicioIte);

        System.out.println("\n==Recursivo==");
        System.out.println("Maior Valor: "+rec);
        System.out.println("Tempo de Execução: "+tempoRec);
        System.out.println("\n==Iterativo==");
        System.out.println("Maior Valor: "+ite);
        System.out.println("Tempo de Execução: "+tempoIte);
    }
}
