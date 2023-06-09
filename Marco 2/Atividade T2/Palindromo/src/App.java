
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha;
        String frase;
        boolean b;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite um frase:");
            frase = s.nextLine();
        }

        //O método ignora letras maiúsculas, espaços em branco, acentos e pontuação
        // Exemplos:
        // Arara
        // Subi         no ônibus.
        // Socorram-me! subi no ônibus em Marrocos.

        pilha = new Pilha(frase.length());
        b = pilha.palindromo(frase);

        System.out.println("\n'"+frase+"' é um palíndromo? "+b);
    }
}
