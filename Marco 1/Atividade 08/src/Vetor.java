
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

  public boolean iterativo(int valor) {
    int meio, inicio = 0, fim = cont - 1;

    for(int i = 0; i < cont; i++) {
      meio = (inicio + fim)/2;

      if(vetor[meio] == valor) {
        return true;
      }
      else if(vetor[meio] > valor) {
        fim = meio - 1;
      }
      else {
        inicio = meio + 1;
      }
    }
    return false;
  }

  public boolean recursiva(int valor) {
    return recursivaAux(valor, 0, cont - 1);
  }

  public boolean recursivaAux(int valor, int inicio, int fim) {
    if(inicio > fim){
      return false;
    }

    int meio = (inicio + fim)/2;

    if(vetor[meio] == valor) {
      return true;
    }
    else if(vetor[meio] > valor) {
      return recursivaAux(valor, inicio, meio - 1);
    }
    else {
      return recursivaAux(valor, meio + 1, fim);
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
