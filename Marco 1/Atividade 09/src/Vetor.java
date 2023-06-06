
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

  public void bubbleSort() {
    for(int i = 0; i < this.vetor.length; i++) {
      for(int j = 0; j < this.vetor.length - 1; j++) {
        if(this.vetor[j] > this.vetor[j+1]) {
          int aux = this.vetor[j];
          this.vetor[j] = this.vetor[j+1];
          this.vetor[j+1] = aux;
        }
      }
    }
  }

  public void selectionSort() {
    for(int i = 0; i < this.vetor.length; i++) {
      int menor = i;
      for(int j = i+1; j < this.vetor.length; j++) {
        if(this.vetor[j] < this.vetor[menor]) {
          menor = j;
        }
      }
      int aux = vetor[i];
      this.vetor[i] = this.vetor[menor];
      this.vetor[menor] = aux;
    }      
  }

  public void insertionSort() {
    for(int i = 1; i < this.vetor.length; i++) {
      int chave = this.vetor[i];
      int j = i - 1;
      while(j >= 0 && chave < this.vetor[j]) {
        this.vetor[j + 1] = this.vetor[j];
        j--;
      }
      this.vetor[j + 1] = chave;
    }
  }

  public String toString() {
    String dados = "";
    for(int i = 0; i < cont; i++) {
      dados += vetor[i]+"\n";
    }
    return dados;
  }
}
