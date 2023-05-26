
public class Q8 {
  public static void main(String[] args) throws Exception {
    LDE8 lista1 = new LDE8();
    LDE8 lista2 = new LDE8();  

    lista1.insereFim(1);
    lista1.insereFim(2);
    lista1.insereFim(3);
    lista1.insereFim(4);

    lista2.insereFim(5);
    lista2.insereFim(6);
    lista2.insereFim(7);
    lista2.insereFim(8);

    lista1.concat(lista2);
    System.out.println(lista1.toString());
  }
}
