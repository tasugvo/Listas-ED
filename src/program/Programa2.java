package program;

import java.util.Scanner;

import entities.Aluno;
import structure2.listaEncadeada;
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
			System.out.println("║   (1). CRUD - Lista com Array  ║");
			System.out.println("║   (2). CRUD - Lista Encadeada  ║");
			System.out.println("║                                ║");
			System.out.println("║   (3). Voltar				     ║");
			System.out.println("║                                ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				first();
				break;
			}
			case 2:{
				second();
				break;
			}
			case 3: {
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
	
	public static void second() {
		
		listaEncadeada lista = new listaEncadeada();
        
        // Adiciona elementos à lista
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        
        // Testa o método get
        System.out.println("Elemento no índice 2: " + lista.get(2));
        
        // Testa o método indexOf
        System.out.println("Índice do elemento 'C': " + lista.indexOf("C"));
        
        // Testa a remoção por índice
        lista.remove(1); // Remove o elemento no índice 1
        
        // Testa a remoção por elemento
        lista.remove("D"); // Remove o elemento "D"
        
        // Imprime a lista após as operações
        System.out.println("Lista após operações:");
        lista.print();
        
        // Indução a erro: tentativa de acesso a um índice inválido
        try {
            lista.get(10); // Tenta acessar um índice que não existe
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
		
        // Indução a erro: tentativa de remover um elemento que não existe
        boolean removed = lista.remove("E"); // Tenta remover um elemento que não existe
        if (!removed) {
            System.out.println("Erro na remoção por elemento: o elemento 'E' não foi encontrado na lista.");
        }
		
	}
	
}
