package Cenaries;

import java.util.Scanner;

import Executable.Program0;

import Cenaries.Caixas;

//listas

//pilhas e filas

//arvores

public class cManager {
	
	public static void Main() {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔═════════════════════════════╗");
			System.out.println("║                             ║");
			System.out.println("║   (1). Caixas               ║");
			System.out.println("║   (2). Listas               ║");
			System.out.println("║   (3). Pilhas e Filas       ║");
			System.out.println("║   (4). Arvores      	      ║");
			System.out.println("║                             ║");
			System.out.println("║       (5). Voltar           ║");
			System.out.println("║                             ║");
			System.out.println("╚═════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				Caixas.Main();
				break;
			}
			case 2: {
				//TODO
				break;
			}
			case 3: {
				//TODO
				break;
			}
			case 4: {
				//TODO
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
	
}
