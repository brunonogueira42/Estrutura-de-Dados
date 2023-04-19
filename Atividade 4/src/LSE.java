public class LSE implements ILista {
    private Noh inicio;

    public LSE () {
        this.inicio = null;
    }

    public void insereInicio(Object info) { 
        Noh novo = new Noh(info);

        if(inicio == null) {
            inicio = novo;
        }
        else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object info) { 
        Noh novo = new Noh(info);

        if(inicio == null){
            inicio = novo;
        }
        else {
            Noh ultimo = null;
            
            for(Noh i=inicio; i != null; i=i.getProximo()) {
                ultimo = i;
            }

            ultimo.setProximo(novo);
        }
    }

    public boolean estahVazia() { 
        if(inicio == null) {
            return true;
        }

        return false;
    }

    public boolean remove(Object info) { 
        Noh ant = null, p = inicio;

        while(p!=null && p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }

        if(p==null) {
            return false;
        }
        if(ant==null) {
            inicio = p.getProximo();
        }
        else {
            ant.setProximo(p.getProximo());
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

    public String toString() {
        String str = "\n";
        Noh obj = inicio;

        while (obj != null) {
            str += "- "+obj.getInfo()+"\n";
            obj = obj.getProximo();
        }

        return str;
    }
}
