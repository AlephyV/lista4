package lista4;

import java.util.LinkedList;

public class PilhaEncadeada {
    public LinkedList pilhaEncadeada;
    
    public PilhaEncadeada() {
        this.pilhaEncadeada = new LinkedList();
    }
  
    public void push(int n) {
    	this.pilhaEncadeada.addFirst(n);
    }
}
