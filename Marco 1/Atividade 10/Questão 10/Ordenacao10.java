
public class Ordenacao10 {
  private int vetor[];

  public Ordenacao10(int vetor[]) {
    this.vetor = vetor;
  }

  public void bubbleSort() {
    int cont = 0;

    for(int i = 0; i < this.vetor.length; i++) {
      for(int j = 0; j < this.vetor.length - 1; j++) {
        if(this.vetor[j] > this.vetor[j+1]) {
          int aux = this.vetor[j];
          this.vetor[j] = this.vetor[j+1];
          this.vetor[j+1] = aux;

          cont++;
          System.out.println("Troca "+cont+": "+this.toString());
        }
      }
    }
  }

  public void selectionSort() {
    int cont = 0;

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

      cont++;
      System.out.println("Troca "+cont+": "+this.toString());
    }      
  }

  public void insertionSort() {
    int cont = 0;
    
    for(int i = 1; i < this.vetor.length; i++) {
      int chave = this.vetor[i];
      int j = i - 1;
      while(j >= 0 && chave < this.vetor[j]) {
        this.vetor[j + 1] = this.vetor[j];
        j--;
      }
      this.vetor[j + 1] = chave;

      cont++;
      System.out.println("Troca "+cont+": "+this.toString());
    }
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < vetor.length; i++) {
      str += vetor[i] + " ";
    }
    return str;
  }
}
