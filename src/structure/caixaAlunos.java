package structure;

import java.util.Random;

import entities.Aluno;

public class caixaAlunos {
	private Aluno[] elementos;
	private int tamanho;//tamanho logico da caixa = quantidade de elementos
	private int capacidade;//tamanho fisico da caixa = quantidade de elementos que podem ser armazenados
	
	public caixaAlunos() {
		tamanho = 0;
		capacidade = 5;
		elementos = new Aluno[capacidade];
		//Caixa em estado default com capacidade para armazenar 5 numeros
	}
	public caixaAlunos(int capacidade) {
		tamanho = 0;
		this.capacidade = capacidade;
		elementos = new Aluno[capacidade];
		//Caixa com construtor iniciando com valor setado pelo usuario
	}
	
	public boolean capaciEmpty() {
		return (tamanho==0);
		//retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa
	}
	public void guardeAluno(Aluno elemento) {
		plusCapaci();
		elementos[tamanho]=elemento;
		tamanho++;
		//guarda o numero na ultima casa e aumenta o atributo tamanho
	}
	public Aluno daAluno() {
		Random random = new Random();
		return elementos[random.nextInt(tamanho)];
		//Retorna um numero um numero aleatorio dentro da caixa
	}
	public void plusCapaci() {
		/*Portanto, este método aumenta a capacidade do array quando necessário, duplicando sua capacidade 
		 * atual e copiando todos os elementos antigos para o novo array. Isso permite que mais elementos 
		 * sejam adicionados ao array sem exceder sua capacidade máxima.*/
		//e tambem caso quando a Caixa for substituida, a antiga menor sera apagada pelo compilador
		if(tamanho==capacidade) {
			Aluno[] novoElementos=new Aluno[capacidade*=2];
			for(int i=0 ; i<tamanho ; i++) {
				novoElementos[i]=elementos[i];
			}
			elementos = novoElementos;
		}
	}
	
}
