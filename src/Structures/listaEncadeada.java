package Structures;

public class listaEncadeada {
	//Essa classe é uma bandeira para as celulas
	//Funciona principalmente com apontadores
	//itr = interador
	
	private ListNode primeiro;// primeira celula da lista - atributo apontador
	private ListNode ultimo;// ultima celula da lista - atributo apontador
	private ListNode anterior;// celula anterior a uma celula qualquer - atributo apontador

	private int size;

	public listaEncadeada() {
		size=0;
		primeiro=ultimo=anterior=null;//inicia tudo em null
	}
	
	
	public int size() {
		return this.size;
	}
	
	public boolean capaciEmpty() {
		return (this.primeiro==null);//nesse caso poderia ser qualquer elemento, pq a lista so estaria vazia se n tivesse nada
	}
	
	public boolean add(Object elem) {
		ListNode newElement = new ListNode(elem, null);
		
		if(primeiro==null) {
			//primeiro=newElement;//define a nova primeira celula 
			primeiro=ultimo=newElement;//primeiro e ultimo apontam para o novo
		}else {
			ultimo.Proximo=newElement;//se a lista n estiver vazia a ultima celula sera apontada para a nova criada
		}
		ultimo=newElement;//atualiza a ultima celula criada
		this.size++;
		return true;
	}
	public void add (Object elem, int index) {
		
		if (index<0 || index>size) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.size);
		}else {
			
			if(index==0) {
				
				if(this.primeiro==null) {
					ListNode newElement = new ListNode(elem,null);
					this.primeiro=this.ultimo=newElement;
				}else {
					ListNode newElement = new ListNode(elem, primeiro);
					this.primeiro=newElement;
				}
				
			}else {
				
				checkAnt(index);
				ListNode newElement = new ListNode(elem, this.anterior.Proximo);
				this.anterior.Proximo = newElement;
				
				if(newElement.Proximo == null) {
					this.ultimo=newElement;
					}
				
				}
				
			}
		size++;
		}
	
	public void clear() {
		primeiro=ultimo=null;
		this.size=0;
	}
	
	public void print() {
		//basicamente uma celula que le outras celular, por ponteiros
		
		if(this.size==0) {
			System.out.println();
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║           Lista vazia          ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║          	 Inicio		         ║");
			System.out.println("╚════════════════════════════════╝");
			
			ListNode itr=primeiro;//inicia uma celula apontando para o primeiro no da lista
			while(itr!=null) {
				// Enquanto o nó atual não for nulo (ainda há nós na lista)
				
				System.out.println(itr.element);
				itr=itr.Proximo;//move para o proximo no da lista
			}
			
			System.out.println("╔════════════════════════════════╗");
			System.out.println("║        	   Fim               ║");
			System.out.println("╚════════════════════════════════╝");
			System.out.println();
		}
		
	}
	
	public Object get (int index) {
		if(index<0 || index > size-1) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.size);
		}else {
			
			//(anterior==null)
			if(index==0) {
				//se o indice for igual 0 a zero retorna a primeira celula
				return primeiro.element;
			}
			checkAnt(index);
			return anterior.Proximo.element;
			
		}
		
	}
	
	public void checkAnt(int index) {
		//N entendi ao certo
		
		ListNode itr=primeiro;
		anterior=null;
		
		for(int i=0; i<this.size; i++) {
			if(i==index) {
				return;
			}
			anterior=itr;
			itr=itr.Proximo;
		}
		return;
		
	}
	
	public int indexOf(Object elem) {
		//não entendi muito bem
		ListNode itr=primeiro;
		anterior=null;
		
		for(int i=0 ; i<this.size ; i++) {
			
			if(itr.element.equals(elem)) {
				return i;//retorna o indice que procurava por meio de apontador
			}else {
				anterior=itr;
				itr=itr.Proximo;
			}
		}
			
		anterior=null;
		return -1;
	}
	
	public Object remove (int index) {
		//N entendi nada
		//essa estrutura de checar indice n precisa do else
		if(index<0 || index >= size-1) {
			throw new IndexOutOfBoundsException("Index=" + index + " e Size=" + this.size);
		}else {
			
			if (index == 0) {
	            Object removedElement = primeiro.element;
	            primeiro = primeiro.Proximo;
	            size--;
	            return removedElement;
	        } else {
	            checkAnt(index);
	            Object removedElement = anterior.Proximo.element;
	            anterior.Proximo = anterior.Proximo.Proximo;
	            if (anterior.Proximo == null) {
	                // Caso especial: remoção do último elemento
	                ultimo = anterior;
	            }
	            size--;
	    		return removedElement;
	        }
	
		}
		
	}
	public boolean remove (Object elem) {	
		//N entendi nada
		// Caso especial: lista vazia
	    if (size == 0) {
	        return false;
	    }
	    
	    ListNode current = primeiro;
	    // Caso especial: remoção do primeiro elemento
	    if (elem.equals(primeiro.element)) {
	        primeiro = primeiro.Proximo;
	        size--;
	        // Caso especial: se a lista ficar vazia após a remoção
	        if (size == 0) {
	            ultimo = null;
	        }
	        return true;
	    }
	    
	    // Percorre a lista até encontrar o elemento ou chegar ao final
	    while (current.Proximo != null && !current.Proximo.element.equals(elem)) {
	        current = current.Proximo;
	    }
	    
	    // Se o elemento foi encontrado
	    if (current.Proximo != null) {
	        current.Proximo = current.Proximo.Proximo;
	        // Caso especial: se o elemento removido for o último da lista
	        if (current.Proximo == null) {
	            ultimo = current;
	        }
	        size--;
	        return true;
	    }
	    
	    // Se o elemento não foi encontrado
	    return false;
		
	}
	
private class ListNode {
//classe interna fica dentro do escopo da classe pai
//esta classe é a celula da lista
//filosoficamente essa classe é comandada pela classe pai (lisaEncadeada)

	private Object element;// tipo generico em Java, serve para representar/apontar oq sera armazenado dentro da celula, pode ser tanto um objeto quanto um tipo primitivo aponta para o proximo elemento
	private ListNode Proximo;

	private ListNode(Object e, ListNode n) {
			element = e;
			Proximo = n;
		}

	}


}
