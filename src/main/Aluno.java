package main;

public class Aluno extends Fisica{
	
	private String matricula;
	private Integer anoDoIngresso;
	private String turma;

	public Aluno() { /* construtor */ }
	
	public Aluno(String nome, String cpf, String sobrenome, String matricula, String turma, Integer anodeingresso) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setSobrenome(sobrenome);
		this.setMatricula(matricula);
		this.setTurma(turma);
		this.setAnoIngresso(anodeingresso);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getTurma() {
		return turma;
	}

	public void setAnoIngresso(Integer anoDoIngresso) {
		this.anoDoIngresso = anoDoIngresso;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Integer getAnoIngresso() {
		return anoDoIngresso;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + getMatricula() + ";" + getAnoIngresso().toString() + ";" + getTurma();
	}

}
