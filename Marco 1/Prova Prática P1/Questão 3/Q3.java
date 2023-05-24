import java.util.Scanner;

public class Q3 {
  public static int calcular(int n) {
    if(n == 0) {
      return 0;
    }
    if(n == 1) {
      return 1;
    }
    return calcular(n - 1) + calcular(n - 2);
  }

  public static void main(String[] args) throws Exception {
    int n, fibonacci;

    try(Scanner e = new Scanner(System.in)) {
      System.out.print("Posição do Número na sequência de Fibonacci: ");
      n = e.nextInt();
    }
    
    fibonacci = calcular(n);
    System.out.print("O "+n+ "º termo da série de Fibonacci é: " + fibonacci);
  }
}
