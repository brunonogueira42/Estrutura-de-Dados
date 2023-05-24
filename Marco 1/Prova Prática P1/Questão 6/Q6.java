
public class Q6 {
  public static void main(String[] args) throws Exception {
    LDE6 lista = new LDE6();
    int valor, cont;

    valor = 42;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    valor = 4;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    valor = 7;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    valor = 11;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    valor = 5+5;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    valor = 20;
    cont = lista.add_ordenado(valor);
    System.out.println("Para inserir o valor "+valor+" foram necessárias "+cont+" execuções");

    System.out.println(lista.inicioFim());
  }
}
