public class Noh {
    private Object info;
    private Noh ant;
    private Noh prox;

    public Noh (Object info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public Object getInfo() { return info; }
    public Noh getProximo() { return prox; }
    public Noh getAnterior() { return ant; }

    public void setProximo(Noh n) { this.prox = n; }
    public void setAnterior(Noh n) { this.ant = n; }
}