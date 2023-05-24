
public class Ordenacao {
  private float valor[];

  public Ordenacao(float valor[]) {
    this.valor = valor;
  }

  public void selectionSort() {
    for (int i = valor.length - 1; i >= 1; i--) {
      int maior = this.posMaior(i);
      if (maior != i) 
        this.troca (i, maior);
    }
  }

  /* Métodos auxiliares: */
  private int posMaior(int fim) {
    int maior = fim;
    for (int i = fim-1; i >= 0; i--)
      if (valor[i] > valor[maior])
        maior = i;
      return maior;
  }

  private void troca(int a, int b) {
    float aux;
    aux = valor[a];
    valor[a] = valor[b];
    valor[b] = aux;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < valor.length; i++) {
      str += valor[i] + "\n";
    }
    return str;
  }
}
