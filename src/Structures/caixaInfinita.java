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
		
		
		//DataStructure-NEW METHODS	
		
		 public static void Tests() {
		        System.out.println("Iniciando bateria de testes...");
		        
		        caixaInfinita caixa = new caixaInfinita(10);
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
			 
			 String code = "package Structures;\n\n" +
					 "import java.util.Random;\n\n" +
					 "public class caixaInfinita {\n" +
					 "    // Caixa de capacidade ilimitada\n\n" +
					 "    private int[] elementos;\n" +
					 "    private int tamanho; // tamanho lógico da caixa = quantidade de elementos\n" +
					 "    private int capacidade; // tamanho físico da caixa = quantidade de elementos que podem ser armazenados\n\n" +
					 "    public caixaInfinita() {\n" +
					 "        tamanho = 0;\n" +
					 "        capacidade = 5;\n" +
					 "        elementos = new int[capacidade];\n" +
					 "        // Caixa em estado default com capacidade para armazenar 5 números\n" +
					 "    }\n\n" +
					 "    public caixaInfinita(int capacidade) {\n" +
					 "        tamanho = 0;\n" +
					 "        this.capacidade = capacidade;\n" +
					 "        elementos = new int[capacidade];\n" +
					 "        // Caixa com construtor iniciando com valor setado pelo usuário\n" +
					 "    }\n\n" +
					 "    public boolean capaciEmpty() {\n" +
					 "        return (tamanho == 0);\n" +
					 "        // Retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa\n" +
					 "    }\n\n" +
					 "    public void guardeNumero(int numero) {\n" +
					 "        plusCapaci();\n" +
					 "        elementos[tamanho] = numero;\n" +
					 "        tamanho++;\n" +
					 "        // Guarda o número na última casa e aumenta o atributo tamanho\n" +
					 "    }\n\n" +
					 "    public int daNumero() {\n" +
					 "        Random random = new Random();\n" +
					 "        return elementos[random.nextInt(tamanho)];\n" +
					 "        // Retorna um número aleatório dentro da caixa\n" +
					 "    }\n\n" +
					 "    public void plusCapaci() {\n" +
					 "        /* Portanto, este método aumenta a capacidade do array quando necessário, duplicando sua capacidade\n" +
					 "         * atual e copiando todos os elementos antigos para o novo array. Isso permite que mais elementos\n" +
					 "         * sejam adicionados ao array sem exceder sua capacidade máxima. */\n" +
					 "        // E também, caso a caixa seja substituída, a antiga menor será apagada pelo compilador\n" +
					 "        if (tamanho == capacidade) {\n" +
					 "            int[] novoElementos = new int[capacidade *= 2];\n" +
					 "            for (int i = 0; i < tamanho; i++) {\n" +
					 "                novoElementos[i] = elementos[i];\n" +
					 "            }\n" +
					 "            elementos = novoElementos;\n" +
					 "        }\n" +
					 "    }\n\n" +
					 "    // DataStructure-NEW METHODS\n\n" +
					 "    public static void Tests() {\n" +
					 "        System.out.println(\"Iniciando bateria de testes...\");\n\n" +
					 "        caixaInfinita caixa = new caixaInfinita(10);\n" +
					 "        System.out.println(\"Caixa criada com capacidade para 10 elementos.\");\n\n" +
					 "        System.out.println(\"Adicionando números de 1 a 10 na caixa.\");\n" +
					 "        for (int i = 1; i <= 10; i++) {\n" +
					 "            caixa.guardeNumero(i);\n" +
					 "        }\n\n" +
					 "        System.out.println(\"Verificando se a caixa está vazia: \" + caixa.capaciEmpty());\n\n" +
					 "        System.out.println(\"Obtendo números aleatórios da caixa:\");\n" +
					 "        for (int i = 0; i < 5; i++) {\n" +
					 "            System.out.println(\"Número aleatório: \" + caixa.daNumero());\n" +
					 "        }\n\n" +
					 "        System.out.println(\"Testes concluídos.\");\n" +
					 "    }\n" +
					 "}";
			 
			 return code;
			 
		 }
		
	
}
