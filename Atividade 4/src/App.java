public class App {
    public static void main(String[] args) throws Exception {
        LSE lista = new LSE();
        Aluno aluno = new Aluno("Bruno", 20, 9.8);

        System.out.println(lista.estahVazia());
        System.out.println(lista.tamanho());

        lista.insereInicio(42);
        lista.insereInicio(aluno);
        lista.insereFim(aluno);
        lista.insereFim("Testando a lista");
        lista.insereInicio(5+5);
        lista.insereFim(7.77777);

        lista.remove(aluno);
        lista.remove(10);

        System.out.println(lista.toString());

        System.out.println(lista.estahVazia());
        System.out.println(lista.tamanho());
    }
}
