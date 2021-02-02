

import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Pilha navegador = new Pilha();
        
        while(true) {
            System.out.println("Por favor, escolha uma das opções:\n1 para navegar para outra página;\n2 para consultar qual a página atual;\n3 para voltar para a página anterior; ou\n4 para avançar para a próxima página.");
            int opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Digite o endereço da página: ");
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
                    System.out.println("Opção inválida!");
                break;
            }
        }
        
    }
}

