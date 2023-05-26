
public class LSE9 implements ILista9 {
  private Noh9 inicio;

  public LSE9() {
    this.inicio = null;
  }

  public void insereInicio(int info) { 
    Noh9 novo = new Noh9(info);

    if(inicio == null) {
      inicio = novo;
    }
    else {
      novo.setProximo(inicio);
      inicio = novo;
    }
  }

  public void insereFim(int info) { 
    Noh9 novo = new Noh9(info);

    if(inicio == null){
      inicio = novo;
    }
    else {
      Noh9 ultimo = null;
        
      for(Noh9 i = inicio; i != null; i = i.getProximo()) {
        ultimo = i;
      }

      ultimo.setProximo(novo);
    }
  }

  public boolean estahVazia() { 
    if(inicio == null) {
      return true;
    }

    return false;
  }

  public boolean remove(int info) { 
    Noh9 ant = null, p = inicio;

    while(p != null && p.getInfo() != info) {
      ant = p;
      p = p.getProximo();
    }

    if(p == null) {
      return false;
    }
    if(ant == null) {
      inicio = p.getProximo();
    }
    else {
      ant.setProximo(p.getProximo());
    }

    return true;
  }

  public int tamanho() { 
    int tam = 0;

    for(Noh9 i = inicio; i != null; i = i.getProximo()) {
      tam++;
    }
    
    return tam;
  }

  public String toString() {
    String str = "\n";
    Noh9 obj = inicio;

    while(obj != null) {
      str += "- "+obj.getInfo()+"\n";
      obj = obj.getProximo();
    }

    return str;
  }

  public void bubbleSort() {
    Noh9 atual, proximo;
    int aux;
    
    if(estahVazia() || inicio.getProximo() == null) {
      return; 
    }

    for(int i = 0; i < this.tamanho(); i++) {
      atual = inicio;
      proximo = inicio.getProximo();

      for(int j = 0; j < this.tamanho() - 1; j++) {
        if(atual.getInfo() > proximo.getInfo()) {
          aux = atual.getInfo();
          atual.setInfo(proximo.getInfo());
          proximo.setInfo(aux);
        }

        atual = proximo;
        proximo = proximo.getProximo();
      }
    }
  }
}
