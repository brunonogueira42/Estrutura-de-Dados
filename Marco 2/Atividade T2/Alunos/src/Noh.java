
public class Noh {
  private Aluno aluno;
  private Noh prox;

  public Noh (Aluno aluno) {
    this.aluno = aluno;
    this.prox = null;
  }

  public Aluno getAluno() { return aluno; }
  public Noh getProximo() { return prox; }

  public void setProximo(Noh n) { this.prox = n; }
}
