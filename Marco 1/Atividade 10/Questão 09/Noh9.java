
public class Noh9 {
  private int info;
  private Noh9 prox;

  public Noh9(int info) {
    this.info = info;
    this.prox = null;
  }

  public int getInfo() { return info; }
  public Noh9 getProximo() { return prox; }

  public void setProximo(Noh9 n) { this.prox = n; }
  public void setInfo(int info) { this.info = info; }
}
