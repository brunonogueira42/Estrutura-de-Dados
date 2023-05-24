
public class Q5 {
  public static void main(String[] args) throws Exception {
    LDE lista = new LDE();

    lista.insereInicio(42); //par
    lista.insereInicio(4); //par
    lista.insereFim(20); //par
    lista.insereFim(11);
    lista.insereInicio(5+5); //par
    lista.insereFim(7);

    int pares = lista.nroPares();

    System.out.println(lista.inicioFim());
    System.out.println("Quantidade de números pares: "+pares);
  }
}