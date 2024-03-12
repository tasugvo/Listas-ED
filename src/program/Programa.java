package program;

//mk1
import java.util.Random;
import java.util.Scanner;

import entities.Aluno;
import structure.caixaAlunos;
import structure.caixaInfinita;
import structure.caixaMultipla;
import structure.caixaSimples;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selecao = 0;
		boolean chave = true;

		while (chave) {
			System.out.println("");
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║          Listas-ED-1           ║");
			System.out.println("║________________________________║");
			System.out.println("║                                ║");
			System.out.println("║ Qual estrutura de dados deseja ║");
			System.out.println("║          acessar ?             ║");
			System.out.println("║                                ║");
			System.out.println("║   (1). TAD - Caixa simples     ║");
			System.out.println("║   (2). TAD - Caixa Multipla    ║");
			System.out.println("║   (3). TAD - Caixa Ilimitada   ║");
			System.out.println("║   (4). TAD - Caixa de Alunos   ║");
			System.out.println("║                                ║");
			System.out.println("║   (5). TAD - Outros            ║");
			System.out.println("║                                ║");
			System.out.println("║   (6). Fechar Programa         ║");
			System.out.println("║   (7). Sobre                   ║");
			System.out.println("║                                ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println("");
			selecao = sc.nextInt();

			switch (selecao) {
			case 1: {
				firstTAD();
				break;
			}
			case 2: {
				secondTAD();
				break;
			}
			case 3: {
				thirdTAD();
				break;
			}
			case 4: {
				fourtTAD();
				break;
			}
			case 5: {
				program.Programa2.here();
				break;
			}
			case 6: {
				chave = false;
				break;
			}
			case 7: {
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

	public static void firstTAD() {
		// TAD - Caixa simples
		Random random = new Random();
		caixaSimples Caixa1 = new caixaSimples();

		System.out.println("(Caixa 1) - O numero guardado é " + Caixa1.daNumero());
		Caixa1.guardeNumero(random.nextInt(20));
		System.out.println("(Caixa 1) - O numero guardado é " + Caixa1.daNumero());

		caixaSimples Caixa2 = new caixaSimples(random.nextInt(20));
		System.out.println("(Caixa 2) - O numero guardado é " + Caixa2.daNumero());
		Caixa2.guardeNumero(random.nextInt(20));
		System.out.println("(Caixa 2) - O numero guardado é " + Caixa2.daNumero());
	}

	public static void secondTAD() {
		// TAD - Caixa Multipla
		Scanner scc = new Scanner(System.in);
		int selecao = 0;

		System.out.println("╔════════════════════════════════╗");
		System.out.println("║         (1). Caso 1            ║");
		System.out.println("║         (2). Caso 2 - Erro     ║");
		System.out.println("╚════════════════════════════════╝");
		selecao = scc.nextInt();

		switch (selecao) {
		case 1: {
			/*
			 * Este algoritimo testa o tamanho da caixa emanda ela retorna um numero
			 * aleatorio que esta dentro dela, logo apos o codigo guarda uma sequencia de
			 * numeros e manda novamente ela checar o tamanho da caixa e retorna um numero
			 * aleatorio dentro dela
			 */
			caixaMultipla Caixa1 = new caixaMultipla();

			if (Caixa1.capaciEmpty()) {
				System.out.println("Caixa Vazia");
			} else {
				System.out.println("Um dos numeros guardados nesta caixa é " + Caixa1.daNumero());
			}

			// for(int i=0; i < 5; i++) {Caixa1.guardeNumero(random1.nextInt(10));} Aqui é
			// caso eu quisesse adicionar numeros aleatorios dentro da caixa
			for (int i = 0; i < 5; i++) {
				Caixa1.guardeNumero(i);
			}

			if (Caixa1.capaciEmpty()) {
				System.out.println("Caixa Vazia");
			} else {
				System.out.println("Um dos numeros guardados nesta caixa é " + Caixa1.daNumero());
			}
			break;
		}
		case 2: {
			// Erro proposital
			caixaMultipla Caixa2 = new caixaMultipla();

			if (Caixa2.capaciEmpty()) {
				System.out.println("Caixa Vazia");
			} else {
				System.out.println("Um dos numeros guardados nesta caixa é " + Caixa2.daNumero());
			}

			for (int i = 0; i < 100; i++) {
				Caixa2.guardeNumero(i);
			}

			if (Caixa2.capaciEmpty()) {
				System.out.println("Caixa Vazia");
			} else {
				System.out.println("Um dos numeros guardados nesta caixa é " + Caixa2.daNumero());
			}
			break;
		}
		default:
			System.out.println("Digite um valor valido na proxima tentativa");
			break;
		}

	}

	public static void thirdTAD() {
		// TAD - Caixa Ilimitada
		caixaInfinita Caixa1 = new caixaInfinita();

		if (Caixa1.capaciEmpty()) {
			System.out.println("Caixa Vazia");
		} else {
			System.out.println("Um dos numeros guardados nesta caixa é " + Caixa1.daNumero());
		}

		for (int i = 0; i < 100; i++) {
			Caixa1.guardeNumero(i);
		}

		if (Caixa1.capaciEmpty()) {
			System.out.println("Caixa Vazia");
		} else {
			System.out.println("Um dos numeros guardados nesta caixa é " + Caixa1.daNumero());
		}
	}

	public static void fourtTAD() {
		// TAD - Caixa de Alunos
		caixaAlunos Caixa1 = new caixaAlunos();

		if (Caixa1.capaciEmpty()) {
			System.out.println("Caixa Vazia");
		} else {
			System.out.println("Um dos alunos dentro da caixa é " + Caixa1.daAluno().getName());
		}

		Caixa1.guardeAluno(new Aluno("Gustavo"));
		Caixa1.guardeAluno(new Aluno("Juliana"));
		Caixa1.guardeAluno(new Aluno("Marcos"));
		Caixa1.guardeAluno(new Aluno("Natan"));
		Caixa1.guardeAluno(new Aluno("Adriana"));
		Caixa1.guardeAluno(new Aluno("Julio"));
		
		if (Caixa1.capaciEmpty()) {
			System.out.println("Caixa Vazia");
		} else {
			System.out.println("Um dos alunos dentro da caixa é " + Caixa1.daAluno().getName());
		}
	}

	public static void about() {
		System.out.println("");
		System.out.println("╔════════════════════════════════╗");
		System.out.println("║              v1.0              ║");
		System.out.println("║                                ║");
		System.out.println("║   https://github.com/tasugvo   ║");
		System.out.println("║                                ║");
		System.out.println("║       by Gustavo Ricci         ║");
		System.out.println("║       open source code         ║");
		System.out.println("╚════════════════════════════════╝");
		System.out.println("");
	}

}
