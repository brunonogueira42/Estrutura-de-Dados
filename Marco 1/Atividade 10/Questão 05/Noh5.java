
public class Noh5 {
  private int info;
  private Noh5 ant;
  private Noh5 prox;

  public Noh5 (int info) {
    this.info = info;
    this.ant = null;
    this.prox = null;
  }

  public int getInfo() { return info; }
  public Noh5 getProximo() { return prox; }
  public Noh5 getAnterior() { return ant; }

  public void setProximo(Noh5 n) { this.prox = n; }
  public void setAnterior(Noh5 n) { this.ant = n; }
}
