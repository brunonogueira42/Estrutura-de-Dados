
import java.util.Scanner;

public class Q12 {
  private static int recSoma(int m, int n, int sen) {
    if(m > n) {
      return 0;
    }

    if(sen > m) {
      return m + recSoma(m + 1, n, sen);
    }

    return recSoma(m + 1, n, sen);
  }

  public static void main(String[] args) throws Exception {
    int m, n, sen, soma;

    try(Scanner e = new Scanner(System.in)) {
      System.out.print("Valor de m: ");
      m = e.nextInt();

      System.out.print("Valor de n: ");
      n = e.nextInt();

      System.out.print("Valor de sen: ");
      sen = e.nextInt();
    }

    soma = recSoma(m, n, sen);
    System.out.println("Resultado: "+soma);
  }
}
