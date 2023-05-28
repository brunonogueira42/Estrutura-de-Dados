
public class App {
    public static void main(String[] args) throws Exception {
        Vetor alunos = new Vetor(3);
        Aluno aluno;

        aluno = new Aluno("Bruno", 20, 10);
        alunos.adiciona(aluno);

        aluno = new Aluno("Gabriel");
        alunos.adiciona(aluno);

        aluno = new Aluno("Lucas", 22, 8.6);
        alunos.adiciona(aluno);

        System.out.println(alunos.toString());
    }
}
