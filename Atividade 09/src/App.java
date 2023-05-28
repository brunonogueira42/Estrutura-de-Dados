
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int tam = 1000;
        Random r = new Random();
        long inicio, fim, tempo;

        Vetor vetor = new Vetor(tam);
        Vetor bubble = new Vetor(tam);
        Vetor selection = new Vetor(tam);
        Vetor insertion = new Vetor(tam);

        for(int i = 0; i < tam; i++) {
            vetor.adiciona(r.nextInt());
        }

        bubble = vetor;
        selection = vetor;
        insertion = vetor;

        inicio = System.nanoTime();
        bubble.bubbleSort();
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\n===Bubble Sort====");
        System.out.println("Tempo de Execução: "+tempo);

        inicio = System.nanoTime();
        selection.selectionSort();
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\n==Selection Sort==");
        System.out.println("Tempo de Execução: "+tempo);

        inicio = System.nanoTime();
        insertion.insertionSort();
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\n==Inserction Sort==");
        System.out.println("Tempo de Execução: "+tempo);
    }
}
