
public class Vetor {
  private int tam;
  private int[] vetor;
  private int cont;

  public Vetor(int tam) {
    this.tam = tam;
    this.vetor = new int[tam];
    this.cont = 0;
  }

  public int tamanho() { return tam; }

  public void adiciona(int valor) {
    if(cont >= tam) {
      System.out.println("ERRO - Vetor Cheio");
    }
    else {
      vetor[cont] = valor;
      cont++;
    }
  }

  public int recursivo() {
    int i = 0, maior = 0;

    if (cont == 0) {
      System.out.println("ERRO - Vetor Vazio");
      return -1;
    }

    return recursivoAux(i, maior);
  }

  public int recursivoAux(int i, int maior) {
    if(i == tam) {
      return maior;
    }

    if(vetor[i] > maior) {
      maior = vetor[i];
    }

    return recursivoAux(i + 1, maior);
  }
  public int iterativo() {
    int maior = 0;

    if (cont == 0) {
      System.out.println("ERRO - Vetor Vazio");
      return -1;
    }

    for(int i = 0; i < cont; i++) {
      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }
    return maior;
  }

  public String toString() {
    String dados = "";
    for(int i = 0; i < cont; i++) {
      dados += vetor[i]+"\n";
    }
    return dados;
  }
}
