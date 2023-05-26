
public class Noh7 {
  private int info;
  private Noh7 prox;

  public Noh7 (int info) {
    this.info = info;
    this.prox = null;
  }

  public int getInfo() { return info; }
  public Noh7 getProximo() { return prox; }

  public void setProximo(Noh7 n) { this.prox = n; }
}
