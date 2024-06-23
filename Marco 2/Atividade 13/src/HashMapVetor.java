
public class HashMapVetor<K, V> {
  private Aluno[] vetor;

  public HashMapVetor() {
    this.vetor = new Aluno[20];
  }

  private int hash(int chave) {
    return chave % this.vetor.length;
  }

  public Aluno get(int chave) {
    int hash = hash(chave);
    return this.vetor[hash];
  }

  public void put(int chave, Aluno valor) {
    int hash = hash(chave);
    this.vetor[hash] = valor;
  }

  public Aluno remove(int chave) {
    int hash = hash(chave);
    Aluno aluno = this.vetor[hash];
    this.vetor[hash] = null;
    return aluno;
  }
}
