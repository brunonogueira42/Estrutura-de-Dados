
public class Q2 {
  public static void main(String[] args) throws Exception {
    float vetor[] = {4,2,6,3,7,1,5,9,8,4};
    Ordenacao ordenacao = new Ordenacao(vetor);

    ordenacao.selectionSort();
    System.out.println(ordenacao.toString());
  }
}
