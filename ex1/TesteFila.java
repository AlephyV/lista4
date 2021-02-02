

import java.util.Scanner;

public class TesteFila {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila filaBanco = new Fila();
        
        while(true) {
            System.out.println("Por favor, escolha uma das opções:\n1 para incluir um cliente na fila;\n2 para atender o próximo cliente;\n3 para consultar o próximo cliente da fila; ou\n4 para consultar quantos clientes existem na fila.");
            
            int escolha = sc.nextInt();
            
            switch(escolha) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.next();
                    filaBanco.incluir(nome);
                break;
                case 2:
                    filaBanco.remover();
                break;
                case 3:
                    filaBanco.proximo();
                break;
                case 4:
                    filaBanco.quantidadeClientes();
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
            
        }
    }
    
}

