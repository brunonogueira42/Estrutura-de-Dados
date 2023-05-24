
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) throws Exception {
    int i, j, k, n, n1, n2, vetor1[], vetor2[], intersecao[];
    boolean existe;

    try(Scanner e = new Scanner(System.in)) {
      System.out.print("Tamanho do vetor 1: ");
      n1 = e.nextInt();
      vetor1 = new int[n1];

      System.out.println("Números do vetor 1: ");
      for(i = 0; i < n1; i++) {
        vetor1[i] = e.nextInt();
      }

      System.out.print("Tamanho do vetor 2: ");
      n2 = e.nextInt();
      vetor2 = new int[n2];

      System.out.println("Números do vetor 2: ");
      for(i = 0; i < n2; i++) {
        vetor2[i] = e.nextInt();
      }
    }

    n = n1;

    if(n2 > n1) {
      n = n2;
    }

    intersecao = new int[n];
    n = 0;

    for(i = 0; i < n1; i++) {
      for(j = 0; j < n2; j++) {
        if(vetor1[i] == vetor2[j]) {
          existe = false;

          for(k = 0; k < n; k++) {
            if(vetor1[i] == intersecao[k]) {
              existe = true;
            }
          }

          if(existe == false) {
            intersecao[n] = vetor1[i];
            n++;
          }
        }
      }
    }

    System.out.print("Insterseção dos Vetores: ");

    for(i = 0; i < n; i++) {
      System.out.print(intersecao[i]+" ");
    }
  }
}
