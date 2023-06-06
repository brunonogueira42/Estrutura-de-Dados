
public class Fila implements IFila {
  private Noh inicio;
  private Noh fim;
    
  public Fila() { 
    this.inicio = null;
    this.fim = null;
  }

  public boolean add(Object info) {
    Noh novo = new Noh(info);

    if(this.isEmpty()) {
      inicio = novo;
    }
    else {
      fim.setProximo(novo);
    }

    fim = novo;
    return true;

  }

  public boolean remove() {
    if(!isEmpty()) {
      if(inicio == fim) {
        inicio = null;
        fim = null;
      } 
      else{
        inicio = inicio.getProximo();
      }
      return true;
    }
    return false;
  }

  public boolean isEmpty() {
    if(inicio == null) {
      return true;
    }
    return false;
  }

  public int size() {
    int tam = 0;

    for(Noh i = inicio; i != null; i = i.getProximo()) {
      tam++;
    }
    return tam;
  }

  public String toString() {
    String str = "";
    Noh obj = inicio;

    while(obj != null) {
      str += obj.getInfo()+", ";
      obj = obj.getProximo();
    }

    return str;
  }
}
