public class Noh {
    private Object info;
    private Noh prox;

    public Noh (Object info) {
        this.info = info;
        this.prox = null;
    }

    public Object getInfo() { return info; }
    public Noh getProximo() { return prox; }

    public void setProximo(Noh n) { this.prox = n; }
}