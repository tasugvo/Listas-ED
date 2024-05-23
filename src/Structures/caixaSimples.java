package Structures;
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
	
	//DataStructure-NEW METHODS	
	
	public static void Tests() {
		
        caixaSimples caixa = new caixaSimples();

        caixa.guardeNumero(10);

        int numero = caixa.daNumero();
        System.out.println("O número guardado na caixa é: " + numero);
		
	}
	
	public String getCode() {
		
		String code = "package Structures;\n" +
                "//Primeiro algoritmo de estrutura de dados\n" +
                "public class caixaSimples {\n" +
                "\n" +
                "\tprivate int elemento;\n" +
                "\n" +
                "\tpublic caixaSimples() {\n" +
                "\t\tthis.elemento = 0;\n" +
                "\t}\n" +
                "\tpublic caixaSimples(int elemento) {\n" +
                "\t\tthis.elemento = elemento;\n" +
                "\t}\n" +
                "\n" +
                "\tpublic int daNumero(){\n" +
                "\t\treturn this.elemento;\n" +
                "\t}\n" +
                "\tpublic void guardeNumero(int numero) {\n" +
                "\t\tthis.elemento = numero;\n" +
                "\t}\n" +
                "\n" +
                "\t//DataStructure-NEW METHODS\n" +
                "\n" +
                "\tpublic static void Tests() {\n" +
                "\t\t\n" +
                "\t\tcaixaSimples caixa = new caixaSimples();\n" +
                "\n" +
                "\t\tcaixa.guardeNumero(10);\n" +
                "\n" +
                "\t\tint numero = caixa.daNumero();\n" +
                "\t\tSystem.out.println(\"O número guardado na caixa é: \" + numero);\n" +
                "\t\t\n" +
                "\t}\n" +
                "\n" +
                "}";
		
		return code;
		
	}
}
