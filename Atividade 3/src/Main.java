
public class Main {

	public static void main(String[] args) {

		//Vetor de Alunos
		System.out.println("Vetor de Alunos");

		VetorAlunos vetAlunos = new VetorAlunos();

		System.out.println("Tamanho do vetor: " + vetAlunos.tamanho());

		vetAlunos.adiciona(new Aluno("Bruno", 20, 8.5));
		vetAlunos.adiciona(new Aluno("Teste"));
		vetAlunos.adiciona(new Aluno("Luiz", 20, 8.5));

		System.out.println("Tamanho do vetor: " + vetAlunos.tamanho());

		System.out.println(vetAlunos.contem("Bruno"));
		System.out.println(vetAlunos.contem("Bruna"));

		System.out.println(vetAlunos.toString());

		//Vetor que armazena qualquer objeto
		System.out.println("\nVetor que armazena qualquer objeto");

		Vetor vet = new Vetor();

		System.out.println("Tamanho do vetor: " + vet.tamanho());

		vet.adiciona(42);
		vet.adiciona("Teste");
		vet.adiciona(new Aluno("Bruno", 20, 8.5));

		System.out.println("Tamanho do vetor: " + vet.tamanho());

		System.out.println(vet.contem(42));
		System.out.println(vet.contem("Teste"));
		System.out.println(vet.contem(40));

		System.out.println(vet.toString());
	}
}
