public class VetorAlunos implements IVetorAlunos {
    private Aluno alunos[] = new Aluno[5];
	private int totalAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.alunos[totalAlunos] = aluno;
		totalAlunos++;
	}
	
	public int tamanho() {
		return totalAlunos;
	}
	
	public boolean contem(String nome) {
		for(int i=0; i < this.totalAlunos; i++) {
			if(this.alunos[i].getNome().contains(nome)) {
				return true;
			}
		}
		return false;
	}

    public String toString() {
        String str = "";

        for(int i=0; i < totalAlunos; i++) {
            str += "\nAluno "+(i+1)+"\n";
            str += alunos[i].toString();
		}
        return str;
    }
}
