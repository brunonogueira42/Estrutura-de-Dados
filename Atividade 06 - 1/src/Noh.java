public class Noh {
    private int info;
    private Noh ant;
    private Noh prox;

    public Noh (int info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public int getInfo() { return info; }
    public Noh getProximo() { return prox; }
    public Noh getAnterior() { return ant; }

    public void setProximo(Noh n) { this.prox = n; }
    public void setAnterior(Noh n) { this.ant = n; }
}