package structure;
//Primeiro algoritimo de estrutura de dados
public class caixaSimples {

	private int elemento;
	
	public caixaSimples() {
		this.elemento = 0;
	}
	public caixaSimples(int elemento) {
		this.elemento = elemento;
	}
	
	public int daNumero(){
		return this.elemento;
	}
	public void guardeNumero(int numero) {
		this.elemento = numero;
	}
	
}
