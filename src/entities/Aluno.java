package entities;

public class Aluno {
	
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
	///public String toString() {
		//return x;
}
