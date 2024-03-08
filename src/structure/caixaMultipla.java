package structure;

import java.util.Random;

public class caixaMultipla {
	//Caixa de capacidade limitada
	
	private int[] elementos;
	private int tamanho;//tamanho logico da caixa = quantidade de elementos
	private int capacidade;//tamanho fisico da caixa = quantidade de elementos que podem ser armazenados
	
	public caixaMultipla() {
		tamanho = 0;
		capacidade = 5;
		elementos = new int[capacidade];
		//Caixa em estado default com capacidade para armazenar 5 numeros
	}
	public caixaMultipla(int capacidade) {
		tamanho = 0;
		this.capacidade = capacidade;
		elementos = new int[capacidade];
		//Caixa com construtor iniciando com valor setado pelo usuario
	}
	
	public boolean capaciEmpty() {
		return (tamanho==0);
		//retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa
	}
	public void guardeNumero(int numero) {
		elementos[tamanho]=numero;
		tamanho++;
		//guarda o numero na ultima casa e aumenta o atributo tamanho
	}
	public int daNumero() {
		Random random = new Random();
		return elementos[random.nextInt(tamanho)];
		//Retorna um numero um numero aleatorio dentro da caixa
	}
	
}
