package program;

import java.util.Scanner;

import entities.Aluno;
import structure2.listaSimples;

public class Programa2 {

	public static void here() {
		
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║       TAD - Outros/Testes      ║");
			System.out.println("║________________________________║");
			System.out.println("║                                ║");
			System.out.println("║   (1). CRUD - Lista simples    ║");
			System.out.println("║                                ║");
			System.out.println("║   (2). Voltar				     ║");
			System.out.println("║                                ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				first();
				break;
			}
			case 2: {
				Programa.main(null);;
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
	
	
	public static void first() {
		
		listaSimples listaSimples = new listaSimples();

	    listaSimples.add(new Aluno("Gustavo"));
	    listaSimples.add(new Aluno("Juliana"));
	    listaSimples.add(new Aluno("Carlito"));
	    listaSimples.add(new Aluno("Nina"));

	    listaSimples.print();

	    listaSimples.remove(2);

	    listaSimples.print();

	    Aluno alunoGustavo = new Aluno("Gustavo");
	    int index = listaSimples.indexOf(alunoGustavo);
	    if (index != -1) {
	        System.out.println("O aluno Gustavo está na posição: " + index);
	    } else {
	        System.out.println("O aluno Gustavo não foi encontrado na lista.");
	    }

	    boolean removido = listaSimples.remove(alunoGustavo);
	    if (removido) {
	        System.out.println("O aluno Gustavo foi removido da lista.");
	    } else {
	        System.out.println("O aluno Gustavo não foi encontrado para remoção.");
	    }

	    listaSimples.print();

	    // Testando o método get com blocos try-catch
	    try {
	        System.out.println(listaSimples.get(8));
	    } catch (IndexOutOfBoundsException ex) {
	        System.out.println("Índice fora dos limites: " + ex.getMessage());
	    }

	    try {
	        System.out.println(listaSimples.get(2));
	    } catch (IndexOutOfBoundsException ex) {
	        System.out.println("Índice fora dos limites: " + ex.getMessage());
	    }
		
	}
	
}
