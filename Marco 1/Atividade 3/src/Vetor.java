public class Vetor {
    private int tam;
    private Aluno[] alunos;
    private int cont;

    public Vetor(int tam) {
        this.tam = tam;
        this.alunos = new Aluno[tam];
        this. cont = 0;
    }

    public int tamanho() { return tam; }

    public void adiciona(Aluno aluno) {
        if(cont >= tam) {
            System.out.println("ERRO - Vetor Cheio");
        }
        else{
            alunos[cont] = aluno;
            cont++;
        }
    }

    public boolean contem(Aluno aluno) {
        for(int i = 0; i < cont; i++) {
            if(alunos[i].getNome().equals(aluno.getNome())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String dados = "";
        for(int i = 0; i < cont; i++) {
            dados += alunos[i].toString()+"\n";
        }
        return dados;
    }
}
