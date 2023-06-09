
public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Fila filaInvertida = new Fila();

        Aluno a1 = new Aluno("Bruno", 1001);
        Aluno a2 = new Aluno("Lucas", 1002);
        Aluno a3 = new Aluno("André", 1003);
        Aluno a4 = new Aluno("Laura", 1004);
        
        System.out.println("Empilhando:");
        if(fila.add(a1)) {
            pilha.push(a1);
            System.out.println(pilha.toString());
        }
        if(fila.add(a2)) {
            pilha.push(a2);
            System.out.println(pilha.toString());
        }
        if(fila.add(a3)) {
            pilha.push(a3);
            System.out.println(pilha.toString());
        }
        if(fila.add(a4)) {
            pilha.push(a4);
            System.out.println(pilha.toString());
        }

        System.out.println("Desmpilhando e invertendo:");
        while(!pilha.isEmpty()){
            System.out.println(pilha.toString());
            Aluno a = pilha.pop();
            filaInvertida.add(a);
        }

        System.out.println("Fila Original:");
        System.out.println(fila.toString());
        System.out.println("Fila Invertida:");
        System.out.println(filaInvertida.toString());
    }
}
