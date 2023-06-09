
public class Pilha implements IPilha {
  private Object[] pilha;
  private int cont;

  public Pilha(int tam) { 
    this.pilha = new Object[tam];
    this.cont = 0;
  }

  public boolean push(Object obj) {
    if(this.cont == pilha.length) {
      System.out.println("ERRO: Pilha cheia.");
      return false;
    }

    this.pilha[this.cont] = obj;
    this.cont++;
    return true;
  }

  public Object pop() {
    Object obj = null;

    if(this.isEmpty()) {
      System.out.println("ERRO: Pilha vazia.");
      return null;
    }

    obj = this.pilha[cont - 1];
    this.pilha[cont - 1] = null;
    this.cont--;
    return obj;
  }

  public Object top() {
    if(this.isEmpty()) {
      System.out.println("ERRO: Pilha vazia.");
      return null;
    }

    return this.pilha[cont - 1];
  }

  public boolean isEmpty() {
    return this.cont == 0;
  }
  
  public int size() {
    return this.cont;
  }

  public boolean palindromo(String frase) {
    frase = frase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    System.out.println("\nEmpilhando:");
    for(int i = 0; i < frase.length(); i++) {
      this.push(frase.charAt(i));
      System.out.println(this.printPalindromo());
    }

    System.out.println("\nDesempilhando e comparando:");
    for(int i = 0; i < frase.length(); i++) {
      System.out.println(this.printPalindromo());
      if(frase.charAt(i) != (char) this.pop()) {
        return false;
      }
    }

    return true;
  }

  private String printPalindromo() {
    String str = "";
    
    for (int i = cont - 1; i >= 0; i--) {
      System.out.print(pilha[i]);
    }

    return str;
  }
}
