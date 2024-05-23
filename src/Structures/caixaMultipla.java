package Structures;

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
	
	
	//DataStructure-NEW METHODS	
	
	public static void Tests() {
        System.out.println("Iniciando bateria de testes...");
        
        caixaMultipla caixa = new caixaMultipla(10);
        System.out.println("Caixa criada com capacidade para 10 elementos.");
        
        System.out.println("Adicionando números de 1 a 10 na caixa.");
        for (int i = 1; i <= 10; i++) {
            caixa.guardeNumero(i);
        }
        
        System.out.println("Verificando se a caixa está vazia: " + caixa.capaciEmpty());
        
        System.out.println("Obtendo números aleatórios da caixa:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número aleatório: " + caixa.daNumero());
        }
        
        System.out.println("Testes concluídos.");
    }
    
   
    public String getCode() {
    	
    	String code = "package Structures;\n" +
    			"\n" +
    			"import java.util.Random;\n" +
    			"\n" +
    			"public class caixaMultipla {\n" +
    			"    //Caixa de capacidade limitada\n" +
    			"\n" +
    			"    private int[] elementos;\n" +
    			"    private int tamanho; //tamanho logico da caixa = quantidade de elementos\n" +
    			"    private int capacidade; //tamanho fisico da caixa = quantidade de elementos que podem ser armazenados\n" +
    			"\n" +
    			"    public caixaMultipla() {\n" +
    			"        tamanho = 0;\n" +
    			"        capacidade = 5;\n" +
    			"        elementos = new int[capacidade];\n" +
    			"        //Caixa em estado default com capacidade para armazenar 5 numeros\n" +
    			"    }\n" +
    			"    public caixaMultipla(int capacidade) {\n" +
    			"        tamanho = 0;\n" +
    			"        this.capacidade = capacidade;\n" +
    			"        elementos = new int[capacidade];\n" +
    			"        //Caixa com construtor iniciando com valor setado pelo usuario\n" +
    			"    }\n" +
    			"\n" +
    			"    public boolean capaciEmpty() {\n" +
    			"        return (tamanho == 0);\n" +
    			"        //retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa\n" +
    			"    }\n" +
    			"    public void guardeNumero(int numero) {\n" +
    			"        elementos[tamanho] = numero;\n" +
    			"        tamanho++;\n" +
    			"        //guarda o numero na ultima casa e aumenta o atributo tamanho\n" +
    			"    }\n" +
    			"    public int daNumero() {\n" +
    			"        Random random = new Random();\n" +
    			"        return elementos[random.nextInt(tamanho)];\n" +
    			"        //Retorna um numero um numero aleatorio dentro da caixa\n" +
    			"    }\n" +
    			"\n" +
    			"\n" +
    			"    //DataStructure-NEW METHODS\n" +
    			"\n" +
    			"    public void Tests() {\n" +
    			"        System.out.println(\"Iniciando bateria de testes...\");\n" +
    			"        \n" +
    			"        caixaMultipla caixa = new caixaMultipla(10);\n" +
    			"        System.out.println(\"Caixa criada com capacidade para 10 elementos.\");\n" +
    			"        \n" +
    			"        System.out.println(\"Adicionando números de 1 a 10 na caixa.\");\n" +
    			"        for (int i = 1; i <= 10; i++) {\n" +
    			"            caixa.guardeNumero(i);\n" +
    			"        }\n" +
    			"        \n" +
    			"        System.out.println(\"Verificando se a caixa está vazia: \" + caixa.capaciEmpty());\n" +
    			"        \n" +
    			"        System.out.println(\"Obtendo números aleatórios da caixa:\");\n" +
    			"        for (int i = 0; i < 5; i++) {\n" +
    			"            System.out.println(\"Número aleatório: \" + caixa.daNumero());\n" +
    			"        }\n" +
    			"        \n" +
    			"        System.out.println(\"Testes concluídos.\");\n" +
    			"    }\n" +
    			"}\n";
    	
    	return code;
    	
    }
	
	
	
}
