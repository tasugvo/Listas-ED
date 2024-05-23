package Cenaries;

import java.util.Scanner;

import Executable.Program0;

public class cManager {
	
	public static void Main() {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔═════════════════════════════╗");
			System.out.println("║   				          ║");
			System.out.println("║   (1). Caixas 		  	  ║");
			System.out.println("║   (2). Listas       		  ║");
			System.out.println("║   (3). Pilhas e Listas      ║");
			System.out.println("║   (4). Arvores      		  ║");
			System.out.println("║                             ║");
			System.out.println("║       (5). Voltar     	  ║");
			System.out.println("║                             ║");
			System.out.println("╚═════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				Caixas();
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				Program0.main(null);
				break;
			}
			
			default:
				System.out.println("\n	Tente Novamente!	\n");
				selecao = 0;
				break;
			}
			selecao = 0;
		}
		sc.close();
		
	}
	
	
	public static void Caixas() {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔═════════════════════════════╗");
			System.out.println("║   				          ║");
			System.out.println("║   (1). Caixa Simples 		  ║");
			System.out.println("║   (2). Caixa Multipla       ║");
			System.out.println("║   (3). Caixa Ilimitada      ║");
			System.out.println("║   (4). Caixa de Alunos      ║");
			System.out.println("║                             ║");
			System.out.println("║       (5). Voltar     	  ║");
			System.out.println("║                             ║");
			System.out.println("╚═════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				Main();
				break;
			}
			
			default:
				System.out.println("\n	Tente Novamente!	\n");
				selecao = 0;
				break;
			}
			selecao = 0;
		}
		sc.close();
		
	}
	
	
	
	
	
	
	
	
}
