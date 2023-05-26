
public class Q9 {
  public static void main(String[] args) throws Exception {
    LSE9 lista = new LSE9();
      
    lista.insereInicio(42);
    lista.insereInicio(4);
    lista.insereFim(11);
    lista.insereFim(7);
    lista.insereInicio(5+5);
    lista.insereFim(20);

    System.out.println("Lista antes do Método da Bolha:");
    System.out.println(lista.toString());

    lista.bubbleSort();

    System.out.println("Lista depois do Método da Bolha:");
    System.out.println(lista.toString());
  }
}
