
public class App {
    public static void main(String[] args) throws Exception {
        int tam = 1000, valor = 42;
        long inicio, fim, tempo;
        Vetor vetor = new Vetor(tam);
        boolean b;

        for(int i = 0; i < tam; i++) {
            vetor.adiciona(i); // Vetor de tamanho 1000 com valores ordenados de 0 a 999
        }

        inicio = System.nanoTime();
        b = vetor.iterativo(valor);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\n==Iterativo==");
        System.out.println("O vetor possui o valor "+valor+"? "+b);
        System.out.println("Tempo de Execução: "+tempo);

        inicio = System.nanoTime();
        b = vetor.recursiva(valor);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("\n==Recursiva==");
        System.out.println("O vetor possui o valor "+valor+"? "+b);
        System.out.println("Tempo de Execução: "+tempo);
    }
}
