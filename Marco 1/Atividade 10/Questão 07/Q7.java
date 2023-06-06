
public class Q7 {
  public static void main(String[] args) throws Exception {
    LSE7 lista = new LSE7();
      
    lista.insereInicio(42);
    lista.insereInicio(4);
    lista.insereFim(11);
    lista.insereFim(7);
    lista.insereInicio(5+5);
    lista.insereFim(20);
    
    //lista = 10, 4, 42, 11, 7, 20
    lista.imprime_rec(0);
  }
}
