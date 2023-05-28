
public class Noh8 {
  private int info;
  private Noh8 ant;
  private Noh8 prox;

  public Noh8 (int info) {
    this.info = info;
    this.ant = null;
    this.prox = null;
  }

  public int getInfo() { return info; }
  public Noh8 getProximo() { return prox; }
  public Noh8 getAnterior() { return ant; }

  public void setProximo(Noh8 n) { this.prox = n; }
  public void setAnterior(Noh8 n) { this.ant = n; }
}
