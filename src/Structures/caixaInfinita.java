package Structures;

import java.util.Random;

public class caixaInfinita {
	//Caixa de capacidade ilimitada
	
		private int[] elementos;
		private int tamanho;//tamanho logico da caixa = quantidade de elementos
		private int capacidade;//tamanho fisico da caixa = quantidade de elementos que podem ser armazenados
		
		public caixaInfinita() {
			tamanho = 0;
			capacidade = 5;
			elementos = new int[capacidade];
			//Caixa em estado default com capacidade para armazenar 5 numeros
		}
		public caixaInfinita(int capacidade) {
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
			plusCapaci();
			elementos[tamanho]=numero;
			tamanho++;
			//guarda o numero na ultima casa e aumenta o atributo tamanho
		}
		public int daNumero() {
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
				int[] novoElementos=new int[capacidade*=2];
				for(int i=0 ; i<tamanho ; i++) {
					novoElementos[i]=elementos[i];
				}
			}
		}
	
}
