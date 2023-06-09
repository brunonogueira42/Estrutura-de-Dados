
public class Pilha implements IPilha {
  private Noh topo;

  public Pilha() {
    this.topo = null;
  }

  public boolean push(Aluno aluno) {
    Noh novo = new Noh(aluno);

    if(this.isEmpty()) {
      topo = novo;
    }
    else {
      novo.setProximo(topo);
      topo = novo;
    }
    
    return true;
  }

  public Aluno pop() {
    Aluno aluno = null;

    if(!this.isEmpty()) {
      aluno = topo.getAluno();
      topo = topo.getProximo();
    }

    return aluno;
  }

  public Aluno top() {
    if(this.isEmpty()) {
      System.out.println("ERRO: Pilha vazia.");
      return null;
    }

    return topo.getAluno();
  }

  public boolean isEmpty() {
    return topo == null;
  }

  public int size() {
    int count = 0;
    Noh aux = topo;

    while (aux != null) {
      count++;
      aux = aux.getProximo();
    }

    return count;
  }

  public String toString() {
    String str = "";

    if(isEmpty()) {
      return "ERRO: Pilha vazia.";
    }

    for(Noh aux = topo; aux != null; aux = aux.getProximo()) {
      str += aux.getAluno().toString()+"\n";
    }

    return str;
  }
}
