package main;

public class Professor extends Fisica{
	
	private String disciplina;
	private String codProfessor;
	private Integer anoAdmissao;
	
	public Professor() { /* construtor */}
	
	public Professor(String codProfessor, String nome, String cpf, String sobrenome, String disciplina, Integer anoAdmissao) {
		super.setNome(nome);
		super.setCpf(cpf);
		super.setSobrenome(sobrenome);
		this.setCodProfessor(codProfessor);
		this.setAnoAdmissao(anoAdmissao);
		this.setDisciplina(disciplina);
	}

	public String getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public void setAnoAdmissao(Integer anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public Integer getAnoAdmissao() {
		return anoAdmissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + getDisciplina() + ";" + getAnoAdmissao().toString();
	}

}
