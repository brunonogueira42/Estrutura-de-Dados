
public class Q10 {
  public static void main(String[] args) throws Exception {
    int[] vetor1 = {3, 7, 1, 4, 9, 2};
    int[] vetor2 = {3, 7, 1, 4, 9, 2};
    int[] vetor3 = {3, 7, 1, 4, 9, 2};
    Ordenacao10 bubble = new Ordenacao10(vetor1);
    Ordenacao10 selection = new Ordenacao10(vetor2);
    Ordenacao10 insertion = new Ordenacao10(vetor3);

    System.out.println("=======Bubble Sort========");
    System.out.println("\nVetor antes: "+bubble.toString()+"\n");
    bubble.bubbleSort();
    System.out.println("\nVetor depois: "+bubble.toString()+"\n");

    System.out.println("======Selection Sort======");
    System.out.println("\nVetor antes: "+selection.toString()+"\n");
    selection.selectionSort();
    System.out.println("\nVetor depois: "+selection.toString()+"\n");

    System.out.println("======Insertion Sort======");
    System.out.println("\nVetor antes: "+insertion.toString()+"\n");
    insertion.insertionSort();
    System.out.println("\nVetor depois: "+insertion.toString()+"\n");
  }
}