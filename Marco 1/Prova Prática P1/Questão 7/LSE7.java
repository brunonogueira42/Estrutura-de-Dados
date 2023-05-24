
public class LSE7 implements ILista7 {
  private Noh7 inicio;

  public LSE7() {
    this.inicio = null;
  }

  public void insereInicio(int info) { 
    Noh7 novo = new Noh7(info);

    if(inicio == null) {
      inicio = novo;
    }
    else {
      novo.setProximo(inicio);
      inicio = novo;
    }
  }

  public void insereFim(int info) { 
    Noh7 novo = new Noh7(info);

    if(inicio == null){
      inicio = novo;
    }
    else {
      Noh7 ultimo = null;
        
      for(Noh7 i = inicio; i != null; i = i.getProximo()) {
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
    Noh7 ant = null, p = inicio;

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

    for(Noh7 i = inicio; i != null; i = i.getProximo()) {
      tam++;
    }
    
    return tam;
  }

  public String toString() {
    String str = "\n";
    Noh7 obj = inicio;

    while(obj != null) {
      str += "- "+obj.getInfo()+"\n";
      obj = obj.getProximo();
    }

    return str;
  }

  public void imprime_rec(int exe) {
    Noh7 obj = inicio;

    for(int i = 0; i < exe; i++) {
      obj = obj.getProximo();
    }

    if(obj != null) {
      System.out.println(obj.getInfo());
      imprime_rec(exe + 1);
    }
  }
}
