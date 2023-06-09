public class App {
    public static void main(String[] args) throws Exception {
        LDE lista = new LDE();

        System.out.println(lista.estahVazia());
        System.out.println(lista.tamanho());

        lista.insereInicio(42);
        lista.insereInicio(4);
        lista.insereFim(20);
        lista.insereFim(11);
        lista.insereInicio(5+5);
        lista.insereFim(7);

        lista.remove(7);
        lista.remove(10);

        System.out.println(lista.inicioFim());
        System.out.println(lista.fimInicio());

        System.out.println(lista.estahVazia());
        System.out.println(lista.tamanho());

        System.out.println(lista.toString());
    }
}
