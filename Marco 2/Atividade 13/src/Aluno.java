
public class Aluno {
  private String nome;
  private int matricula;

  public Aluno(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() { return nome; }
  public int getMatricula() { return matricula; }

  public void setNome(String nome) { this.nome = nome; }
  public void setMatricula(int matricula) { this.matricula = matricula; }

  public String toString() {
    String str = "Nome: "+nome+" | Matrícula: "+matricula;
    return str;
  }
}
