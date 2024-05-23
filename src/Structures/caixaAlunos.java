package Structures;

import java.util.Random;

public class caixaAlunos {
    private Aluno[] elementos;
    private int tamanho; // tamanho logico da caixa = quantidade de elementos
    private int capacidade; // tamanho fisico da caixa = quantidade de elementos que podem ser armazenados

    public caixaAlunos() {
        tamanho = 0;
        capacidade = 5;
        elementos = new Aluno[capacidade];
        // Caixa em estado default com capacidade para armazenar 5 numeros
    }

    public caixaAlunos(int capacidade) {
        tamanho = 0;
        this.capacidade = capacidade;
        elementos = new Aluno[capacidade];
        // Caixa com construtor iniciando com valor setado pelo usuario
    }

    public boolean capaciEmpty() {
        return (tamanho == 0);
        // retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa
    }

    public void guardeAluno(Aluno elemento) {
        plusCapaci();
        elementos[tamanho] = elemento;
        tamanho++;
        // guarda o numero na ultima casa e aumenta o atributo tamanho
    }

    public Aluno daAluno() {
        Random random = new Random();
        return elementos[random.nextInt(tamanho)];
        // Retorna um aluno aleatorio dentro da caixa
    }

    public void plusCapaci() {
        /*
         * Portanto, este método aumenta a capacidade do array quando necessário,
         * duplicando sua capacidade atual e copiando todos os elementos antigos para
         * o novo array. Isso permite que mais elementos sejam adicionados ao array sem
         * exceder sua capacidade máxima. e tambem caso quando a Caixa for substituida, a
         * antiga menor sera apagada pelo compilador
         */
        if (tamanho == capacidade) {
            Aluno[] novoElementos = new Aluno[capacidade *= 2];
            for (int i = 0; i < tamanho; i++) {
                novoElementos[i] = elementos[i];
            }
            elementos = novoElementos;
        }
    }

    // Classe interna Aluno
    private static class Aluno {
        // sample object

        private String name;
        private int idade;
        private int matricula;

        public Aluno(String name) {
            super();
            this.name = name;
            this.idade = idade;
            this.matricula = matricula;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public String toString() {
            return name + "-" + matricula;
        }

        public boolean equals(Object o) {
            // N entendi nada
            Aluno a = (Aluno) o;
            return this.name.equals(a.name);
        }
    }
    
    
    
    //DataStructure-NEW METHODS	
    
    public static void Tests() {
        System.out.println("Iniciando bateria de testes...");

        caixaAlunos caixa = new caixaAlunos(10);
        System.out.println("Caixa criada com capacidade para 10 elementos.");

        System.out.println("Adicionando alunos na caixa.");
        for (int i = 1; i <= 10; i++) {
            caixa.guardeAluno(new Aluno("Aluno " + i));
        }

        System.out.println("Verificando se a caixa está vazia: " + caixa.capaciEmpty());

        System.out.println("Obtendo alunos aleatórios da caixa:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno aleatório: " + caixa.daAluno().getName());
        }

        System.out.println("Testes concluídos.");
    }
    
    public String getCode() {
    		
    	//reduced
    	String code = "package Structures;\n" +
    	        "\n" +
    	        "import java.util.Random;\n" +
    	        "\n" +
    	        "public class caixaAlunos {\n" +
    	        "    private Aluno[] elementos;\n" +
    	        "    private int tamanho; // tamanho logico da caixa = quantidade de elementos\n" +
    	        "    private int capacidade; // tamanho fisico da caixa = quantidade de elementos que podem ser armazenados\n" +
    	        "\n" +
    	        "    public caixaAlunos() {\n" +
    	        "        tamanho = 0;\n" +
    	        "        capacidade = 5;\n" +
    	        "        elementos = new Aluno[capacidade];\n" +
    	        "        // Caixa em estado default com capacidade para armazenar 5 numeros\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    public caixaAlunos(int capacidade) {\n" +
    	        "        tamanho = 0;\n" +
    	        "        this.capacidade = capacidade;\n" +
    	        "        elementos = new Aluno[capacidade];\n" +
    	        "        // Caixa com construtor iniciando com valor setado pelo usuario\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    public boolean capaciEmpty() {\n" +
    	        "        return (tamanho == 0);\n" +
    	        "        // retorna um valor pela quantidade nula de elementos, checar se tem algo na caixa\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    public void guardeAluno(Aluno elemento) {\n" +
    	        "        plusCapaci();\n" +
    	        "        elementos[tamanho] = elemento;\n" +
    	        "        tamanho++;\n" +
    	        "        // guarda o numero na ultima casa e aumenta o atributo tamanho\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    public Aluno daAluno() {\n" +
    	        "        Random random = new Random();\n" +
    	        "        return elementos[random.nextInt(tamanho)];\n" +
    	        "        // Retorna um aluno aleatorio dentro da caixa\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    public void plusCapaci() {\n" +
    	        "        /*\n" +
    	        "         * Portanto, este método aumenta a capacidade do array quando necessário,\n" +
    	        "         * duplicando sua capacidade atual e copiando todos os elementos antigos para\n" +
    	        "         * o novo array. Isso permite que mais elementos sejam adicionados ao array sem\n" +
    	        "         * exceder sua capacidade máxima. e tambem caso quando a Caixa for substituida, a\n" +
    	        "         * antiga menor sera apagada pelo compilador\n" +
    	        "         */\n" +
    	        "        if (tamanho == capacidade) {\n" +
    	        "            Aluno[] novoElementos = new Aluno[capacidade *= 2];\n" +
    	        "            for (int i = 0; i < tamanho; i++) {\n" +
    	        "                novoElementos[i] = elementos[i];\n" +
    	        "            }\n" +
    	        "            elementos = novoElementos;\n" +
    	        "        }\n" +
    	        "    }\n" +
    	        "\n" +
    	        "    // Classe interna Aluno\n" +
    	        "    private static class Aluno {\n" +
    	        "        // sample object\n" +
    	        "\n" +
    	        "        private String name;\n" +
    	        "        private int idade;\n" +
    	        "        private int matricula;\n" +
    	        "\n" +
    	        "        public Aluno(String name) {\n" +
    	        "            super();\n" +
    	        "            this.name = name;\n" +
    	        "            this.idade = idade;\n" +
    	        "            this.matricula = matricula;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public String getName() {\n" +
    	        "            return name;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public void setName(String name) {\n" +
    	        "            this.name = name;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public int getIdade() {\n" +
    	        "            return idade;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public void setIdade(int idade) {\n" +
    	        "            this.idade = idade;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public int getMatricula() {\n" +
    	        "            return matricula;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public void setMatricula(int matricula) {\n" +
    	        "            this.matricula = matricula;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public String toString() {\n" +
    	        "            return name + \"-\" + matricula;\n" +
    	        "        }\n" +
    	        "\n" +
    	        "        public boolean equals(Object o) {\n" +
    	        "            // N entendi nada\n" +
    	        "            Aluno a = (Aluno) o;\n" +
    	        "            return this.name.equals(a.name);\n" +
    	        "        }\n" +
    	        "    }\n" +
    	        "}\n";
    	
    		return code;
    	
    	
    }
    
    
}
