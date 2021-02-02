

public class Fila {
    public int comeco;
    public int fim;
    public int quantidadeClientesElementos;
    public String fila[];
    public int tamanho = 100;
    
    public Fila() {
        this.comeco = 0;
        this.fim = -1;
        this.fila = new String[this.tamanho];
        this.quantidadeClientesElementos = 0;
    }
    
    
    
    public void incluir(String cliente){
        if (!this.isCompleta()){
        	
            if (this.comeco == -1){
                this.comeco = 0;
            }
            
            this.fim++;
            this.fila[this.fim] = cliente;
            this.quantidadeClientesElementos++;
            System.out.println("Cliente incluido com sucesso");
        }
    }
    
    public boolean isCompleta(){
        if (this.quantidadeClientesElementos == this.tamanho - 1){
            return true;
        }
        return false;
    }
    
    public boolean isVazia(){
        if (this.quantidadeClientesElementos == 0){
            return true;
        }
        return false;
    }
    
    
    public void proximo() {
        if(!isVazia()) {
            System.out.println("O Cliente " + this.fila[this.comeco] + " é o próximo");
        } else {
            System.out.println("Não há clientes na fila");
        }
    }
    
    public void quantidadeClientes() {
        System.out.println(this.quantidadeClientesElementos + " clientes esperando na fila");
    }
    
    public void remover(){
        if (!isVazia() ){
            System.out.println("Cliente " + this.fila[this.comeco] + " foi atendido");
            this.comeco++;
            this.quantidadeClientesElementos--;
        } else {
            System.out.println("Não há clientes na fila");
        }
    }
}
    
