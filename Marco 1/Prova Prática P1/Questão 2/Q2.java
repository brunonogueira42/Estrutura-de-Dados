public class Q2 {
  float valor[];

  public void selectionSort() {
    for (int i = valor.length; i >= 1; i--) {
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
}
