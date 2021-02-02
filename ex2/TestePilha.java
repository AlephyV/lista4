

import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Pilha navegador = new Pilha();
        
        while(true) {
            System.out.println("Por favor, escolha uma das op��es:\n1 para navegar para outra p�gina;\n2 para consultar qual a p�gina atual;\n3 para voltar para a p�gina anterior; ou\n4 para avan�ar para a pr�xima p�gina.");
            int opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite o endere�o da p�gina: ");
                    String pagina = sc.next();
                    navegador.empilhar(pagina);
                break;
                case 2:
                    System.out.println(navegador.getAtual());
                break;
                case 3:
                    navegador.desempilhar();
                break;
                case 4:
                    navegador.proxima();
                break;
                default:
                    System.out.println("Op��o inv�lida!");
                break;
            }
        }
        
    }
}

