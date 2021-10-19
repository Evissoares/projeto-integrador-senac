package main;

public class Professor extends Fisica{
	
	private String disciplina;
	
	public Professor() {}
	
	public Professor(String nome, String cpf, String dataNasc, String disciplina) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setDataNascimento(dataNasc);
		this.disciplina = disciplina;
		
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return super.toString() + getDisciplina();
	}

}
