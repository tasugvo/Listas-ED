package entities;

public class Aluno {
	//sample object
	
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
	
	public String toString(){
		return name+"-"+matricula;
	}
	
	public boolean equals(Object o) {
		//N entendi nada
		Aluno a =(Aluno)o;
		return this.name.equals(a.name);
	}
}
