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
		if (codProfessor.trim().isEmpty()) {
			throw new IllegalArgumentException("O código do professor deve ser preenchido.");
		} else if (!codProfessor.trim().matches("[0-9]+")) {
			throw new IllegalArgumentException("O código do professor deve conter apenas números.");
		}this.codProfessor = codProfessor.trim();
	}

	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		if (disciplina.trim().isEmpty()) {
			throw new IllegalArgumentException("A disciplina do professor deve ser preenchida.");
		}
		this.disciplina = disciplina.trim();
	}

	public void setAnoAdmissao(Integer anoAdmissao) {
		if (anoAdmissao < 1900 || anoAdmissao > 2021) {
			throw new IllegalArgumentException("O Ano de Admissão deve ser válido.");
		}
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
