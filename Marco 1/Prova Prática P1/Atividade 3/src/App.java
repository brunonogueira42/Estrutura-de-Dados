import java.util.Scanner;

public class App {
    public static int calcular(int n) {
        if(n <= 1) {
          return n;
        }
        return calcular(n - 1) + calcular(n - 2);
      }

    public static void main(String[] args) throws Exception {
        Scanner e = new Scanner(System.in);
        int n, fibonacci;

        System.out.print("Posição do Número na sequência de Fibonacci: ");
        n = e.nextInt();
        fibonacci = calcular(n);
        System.out.print("O "+n+ "º termo da série de Fibonacci é: " + fibonacci);
    }
}
