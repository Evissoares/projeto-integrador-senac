package main;

public class Aluno extends Fisica{
	
	private String matricula;
	
	public Aluno() {}
	
	public Aluno(String nome, String cpf, String dataNasc, String matricula) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setDataNascimento(dataNasc);
		this.matricula = matricula;
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + getMatricula();
	}
	
	
}
