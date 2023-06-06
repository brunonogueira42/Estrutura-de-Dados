
public class PontoCartesiano {
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public double Euclidiana(PontoCartesiano ponto1, PontoCartesiano ponto2) {
        double quadx, quady, soma, raiz;

        quadx = (ponto1.getX() - ponto2.getX()) * (ponto1.getX() - ponto2.getX());
        quady = (ponto1.getY() - ponto2.getY()) * (ponto1.getY() - ponto2.getY());
        soma = quadx + quady;
        raiz = Math.sqrt(soma); // Queria fazer sem usar o método Math.sqrt, mas não consegui.

        return raiz;
    }

    public String toString() {
        return "("+x+","+y+")";
    }
}
