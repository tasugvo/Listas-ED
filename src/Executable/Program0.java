package Executable;

import java.util.Scanner;
import Cenaries.cManager;

public class Program0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔═════════════════════════════╗");
			System.out.println("║      DataStructures         ║");
			System.out.println("║_____________________________║");
			System.out.println("║                             ║");
			System.out.println("║   (1). Cenarios	      ║");
			System.out.println("║   (2). Codigos              ║");
			System.out.println("║                             ║");
			System.out.println("║   (3). Fechar Programa      ║");
			System.out.println("║   (4). Sobre                ║");
			System.out.println("║                             ║");
			System.out.println("╚═════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				cManager.Main();
				break;
			}
			case 2: {
				//TODO
				break;
			}
			case 3: {
				System.exit(0);
				break;
			}
			case 4: {
				about();
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
	
	public static void about() {
		System.out.println("");
		System.out.println("╔════════════════════════════════╗");
		System.out.println("║              v1.3              ║");
		System.out.println("║                                ║");
		System.out.println("║   https://github.com/tasugvo   ║");
		System.out.println("║                                ║");
		System.out.println("║       by Gustavo Ricci         ║");
		System.out.println("║       open source code         ║");
		System.out.println("╚════════════════════════════════╝");
		System.out.println("");
	}

// Estrura em container mesmo, quero nem saber n to fazendo um novo windows	

}
