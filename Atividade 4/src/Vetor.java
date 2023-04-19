public class Vetor {
    private Object vetor[] = new Object[5];
	private int tam = 0;
	
	public void adiciona(Object objeto) {
		this.vetor[tam] = objeto;
		tam++;
	}
	
	public int tamanho() {
		return tam;
	}
	
	public boolean contem(Object objeto) {
		for(int i=0; i < this.tam; i++) {
			if(this.vetor[i] == objeto) {
				return true;
			}
		}
		return false;
	}

    public String toString() {
        String str = "";

        for(int i=0; i < tam; i++) {
            str += "\n"+(i+1)+": "+vetor[i];
		}
        return str;
    }
}
