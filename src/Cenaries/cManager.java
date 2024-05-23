package Cenaries;

import java.util.Scanner;

import Executable.Program0;
import Structures.caixaMultipla;
import Structures.caixaInfinita;
import Structures.caixaAlunos;
import Structures.caixaSimples;

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
				Caixas();
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
	
	
	public static void Caixas() {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔═════════════════════════════╗");
			System.out.println("║                             ║");
			System.out.println("║   (1). Caixa Simples        ║");
			System.out.println("║   (2). Caixa Multipla       ║");
			System.out.println("║   (3). Caixa Ilimitada      ║");
			System.out.println("║   (4). Caixa de Alunos      ║");
			System.out.println("║                             ║");
			System.out.println("║       (5). Voltar           ║");
			System.out.println("║                             ║");
			System.out.println("╚═════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				caixaSimples CS = new caixaSimples();
				CS.Tests();
				break;
			}
			case 2: {
				caixaMultipla CM =  new caixaMultipla();
				CM.Tests();
				break;
			}
			case 3: {
				caixaInfinita CI = new caixaInfinita();
				CI.Tests();
				break;
			}
			case 4: {
				caixaAlunos CA = new caixaAlunos();
				CA.Tests();
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
