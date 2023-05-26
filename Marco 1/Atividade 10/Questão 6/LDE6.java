
public class LDE6 implements ILista6 {
  private Noh6 inicio;
  private Noh6 fim;

  public LDE6() {
    this.inicio = null;
    this.fim = null;
  }

  public void insereInicio(int info) { 
    Noh6 novo = new Noh6(info);

    if(inicio == null) {
      inicio = novo;
      fim = novo;
    }
    else {
      novo.setProximo(inicio);
      inicio.setAnterior(novo);
      inicio = novo;
    }
  }

  public void insereFim(int info) { 
    Noh6 novo = new Noh6(info);

    if(inicio == null){
      inicio = novo;
      fim = novo;
    }
    else {
      novo.setAnterior(fim);
      fim.setProximo(novo);
      fim = novo;
    }
  }

  public boolean estahVazia() { 
    if(inicio == null && fim == null) {
      return true;
    }

    return false;
  }

  private Noh6 busca(int info) {
    Noh6 p = inicio;

    while (p != null && p.getInfo() != info) {
      p = p.getProximo();
    }

    return p;
  }
  
  public boolean remove(int info) {
    Noh6 p = busca(info);

    while(p != null && p.getInfo() != info) {
      p = p.getProximo(); 
    }

    if(p == null) {
      return false;
    }
    if(p == inicio) {
      inicio = p.getProximo();
      if(inicio != null) {
        inicio.setAnterior(null);
      }
      else {
        fim = null;
      }
    } 
    else if(p.getProximo() == null) {
      p.getAnterior().setProximo(null);
      fim = p.getAnterior();
    } 
    else {
      p.getAnterior().setProximo(p.getProximo());
      p.getProximo().setAnterior(p.getAnterior());
    }

    return true;
  }

  public int tamanho() { 
    int tam = 0;

    for(Noh6 i = inicio; i != null; i = i.getProximo()) {
      tam++;
    }
      
    return tam;
  }

  public String inicioFim() {
    String str = "\n";
    Noh6 obj = inicio;

    while(obj != null) {
      str += "- "+obj.getInfo()+"\n";
      obj = obj.getProximo();
    }

    return str;
  }

  public String fimInicio() {
    String str = "\n";
    Noh6 obj = fim;

    while(obj != null) {
      str += "- "+obj.getInfo()+"\n";
      obj = obj.getAnterior();
    }

    return str;
  }

  public String toString() {
    String str = "\n";
      
    str += "Lista do Início ao Fim:";
    str += inicioFim();

    str += "Lista do Fim ao Início:";
    str += fimInicio();

    return str;
  }

  public int add_ordenado(int info) {
    Noh6 novo = new Noh6(info);
    int cont = 0;

    if(inicio == null) {
      inicio = novo;
      fim = novo;
      cont++;
    }
    else if (info <= inicio.getInfo()) {
      novo.setProximo(inicio);
      inicio.setAnterior(novo);
      inicio = novo;
      cont++;
    }
    else if (info >= fim.getInfo()) {
      novo.setAnterior(fim);
      fim.setProximo(novo);
      fim = novo;
      cont++;
    }
    else {
      Noh6 meio = inicio.getProximo();
      Noh6 aux;
      cont++;

      while (meio != null && info > meio.getInfo()) {
        meio = meio.getProximo();
        cont++;
      }

      aux = meio.getAnterior();

      novo.setProximo(meio);
      novo.setAnterior(aux);
      
      aux.setProximo(novo);
      meio.setAnterior(novo);
    }
    
    return cont;
  }
}
