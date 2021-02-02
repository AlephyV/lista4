

public class Pilha {
    public String[] pilha;
    public int posicaoPilha;
    public int quantidadePaginas;
    public int tamanho = 100;
    
    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new String[tamanho];
    }   
    
    
    public void proxima() {
        if(!isVazia()) {
            if(this.posicaoPilha+1 < this.quantidadePaginas ) {
                System.out.println("Avan�ando da p�gina " + getAtual());
                this.posicaoPilha++;
                System.out.println("Para a p�gina " + getAtual());
            } else {
                System.out.println("N�o existe pr�xima!");
            }
        } else {
            System.out.println("A pilha est� Vazia!");
        }
    }
    
    public int tamanho() {
        if (this.isVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }   
    
    public void desempilhar() {
        if(isVazia()) {
            System.out.println("A pilha est� Vazia!");
        } else {
            System.out.println("Voltando da p�gina " + getAtual());
            this.posicaoPilha--;
            System.out.println("Para a pagina " + getAtual());
        }
        
    }
    
    public void empilhar(String pagina) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.quantidadePaginas++;
            this.pilha[++this.posicaoPilha] = pagina;
        }
    }  
    
        
    public boolean isVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    } 
    
    public String getAtual() {
        if(!isVazia()) {
            return this.pilha[this.posicaoPilha];
        }
        return "P�gina em branco";
    } 
    
    
}

