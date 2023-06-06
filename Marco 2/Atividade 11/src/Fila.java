
public class Fila implements IFila {
  private int cont;
  private int inicio;
  private Object fila[];

  public Fila (int tam) {
    this.cont = 0;
    this.inicio = 0;
    this.fila = new Object[tam];
  }

  public boolean add(Object info) {
    if (this.cont == fila.length) {
      System.out.println("ERRO - Fila cheia.");
      return false;
    }

    int fim = (this.inicio + this.cont) % this.fila.length;
    this.fila[fim] = info;
    this.cont++;
    return true;
  }

  public boolean remove() {
    if (this.isEmpty()){ 
      System.out.println("ERRO - Fila vazia.");
      return false;
    }

    this.inicio = (this.inicio + 1) % this.fila.length;
    this.cont--;
    return true;
  }

  public boolean isEmpty() {
    if(cont == 0) {
      return true;
    }
    return false;
  }

  public int size() {
    return cont;
  }

  public String toString() {
    int aux = inicio;
    String str = "";

    if(this.isEmpty()) {
      return "ERRO - Fila vazia.";
    }

    for(int i = 0; i < cont; i++) {
      str += fila[aux]+", ";
      aux = (aux + 1) % this.fila.length;
    }

    return str;
  }
}
