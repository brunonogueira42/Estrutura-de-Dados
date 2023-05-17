public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;

    public LDE () {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int info) { 
        Noh novo = new Noh(info);

        if(inicio == null) {
            inicio = novo;
            fim= novo;
        }
        else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(int info) { 
        Noh novo = new Noh(info);

        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public boolean estahVazia() { 
        if(inicio == null && fim == null) {
            return true;
        }

        return false;
    }

    private Noh busca(int info) {
        Noh p = inicio;

        while (p!=null && p.getInfo() != info) {
            p = p.getProximo();
        }

        return p;
    }
    
    public boolean remove(int info) {
        Noh p = busca(info);

        while(p!=null && p.getInfo() != info) {
            p = p.getProximo(); 
        }

        if(p==null) {
            return false;
        }
        if(p == inicio) {
            inicio = p.getProximo();
            if(inicio != null) {
                inicio.setAnterior(null);
            }
            else {
                fim = null;
            }
        } 
        else if(p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();
        } 
        else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }

        return true;
    }

    public int tamanho() { 
        int tam = 0;

        for(Noh i=inicio; i != null; i=i.getProximo()) {
            tam++;
        }
        
        return tam;
    }

    public String inicioFim() {
        String str = "\n";
        Noh obj = inicio;

        while(obj != null) {
            str += "- "+obj.getInfo()+"\n";
            obj = obj.getProximo();
        }

        return str;
    }

    public String fimInicio() {
        String str = "\n";
        Noh obj = fim;

        while(obj != null) {
            str += "- "+obj.getInfo()+"\n";
            obj = obj.getAnterior();
        }

        return str;
    }

    public String toString() {
        String str = "\n";
        
        str += "Lista do Início ao Fim:";
        str += inicioFim();

        str += "Lista do Fim ao Início:";
        str += fimInicio();

        return str;
    }
}
