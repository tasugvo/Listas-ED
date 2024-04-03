package structure2;

import java.util.Random;


public class listaSimples {
	//Uma especie de CRUD simples
	
	private Object[] elementos;
	private int tamanho;
	private int capacidade;
	
	public listaSimples() {
		this.tamanho=0;
		this.capacidade=5;
		elementos = new Object[capacidade];
	}
	public listaSimples(int capacidade) {
		this.tamanho=0;
		this.capacidade=capacidade;
		elementos = new Object[capacidade];
	}
	
	
	public int getTamanho() {
		return tamanho;
	}
	public boolean capaciEmpty() {
		return (tamanho==0);
	}

	public boolean add(Object elemento) {
		plusCapaci();
		elementos[tamanho]=elemento;
		tamanho++;
		return true;
	}
	public void add(int index, Object elem) {
		/*diferente do boolean add, este adiciona um elemento no local index especificado pelo usuario,
		* caso a parte ja esteja com um elemento ele passara para a direita e trocara o elemento da 
		* posição*/
		if(index<0 || index>this.tamanho) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.tamanho);
		}
		
		plusCapaci();
		for(int i=this.tamanho; i > index ; i--) {
			elementos[i]=elementos[i-1];
		}//esse for move os itens para a direita apartir do indice index
		elementos[index]=elem;//aqui ele insere o elemento na posição
		this.tamanho++;
	}
	
	public void plusCapaci() {
		if(tamanho==capacidade) {
			Object[] novoElementos=new Object[capacidade*=2];
			for(int i=0 ; i<tamanho ; i++) {
				novoElementos[i]=elementos[i];
			}
			elementos = novoElementos;
		}
	}
	public int indexOf(Object elem) {
		for(int i=0;i<this.tamanho;i++) {
			if(elementos[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}
	public Object get(int index) {
		if(index<0 || index>this.tamanho-1) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.tamanho);
		}else {
			return elementos[index];
		}
	}
	
	public void clear() {	
		for(int i=0;i<this.tamanho;i++) {
			elementos[i]=null;
		}
		this.tamanho=0;
	}
	public Object remove(int index) {
		if(index<0 || index>this.tamanho) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.tamanho);
		}
		
		Object tempObj = elementos[index];
		elementos[index]=null;
		//elementos[index-1]=null;
		return tempObj;
	}
	public boolean remove(Object elem) {
		for(int i=0;i<this.tamanho;i++) {
			if(elementos[i].equals(elem)) {
				elementos[i]=null;
				return true;
			}
		}
		return false;	
	}

	
	
	
	public void print() {
		
		if(this.tamanho == 0) {
			System.out.println();
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║           Lista vazia          ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println();
			
		}else {
			System.out.println();
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║          	 Inicio		     	 ║");
			System.out.println("╚════════════════════════════════╝");
			
			for(int i=0 ; i<this.tamanho ; i++) {
				if (elementos[i] != null) {
			        System.out.println(elementos[i].toString());
			    } else {
			        System.out.println("Espaço: " + i + " Vazio");
			    }
			}
			
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║        	   Fim               ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println();
			
		}
		
	}

}
