
public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(5);

        System.out.println("Vazio? "+fila.isEmpty());
        System.out.println("Tamanho: "+fila.size());
        
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.remove();
        fila.remove();
        fila.add("Bruno");
        fila.remove();
        fila.add(42);

        System.out.println("Vazio? "+fila.isEmpty());
        System.out.println("Tamanho: "+fila.size());

        System.out.println(fila.toString());
    }
}
