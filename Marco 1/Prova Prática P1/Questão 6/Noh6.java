
public class Noh6 {
  private int info;
  private Noh6 ant;
  private Noh6 prox;

  public Noh6 (int info) {
    this.info = info;
    this.ant = null;
    this.prox = null;
  }

  public int getInfo() { return info; }
  public Noh6 getProximo() { return prox; }
  public Noh6 getAnterior() { return ant; }

  public void setProximo(Noh6 n) { this.prox = n; }
  public void setAnterior(Noh6 n) { this.ant = n; }
}
