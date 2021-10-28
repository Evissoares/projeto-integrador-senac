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
		if (anoDoIngresso < 1900 || anoDoIngresso > 2021) {
			throw new IllegalArgumentException("O Ano do Ingresso deve ser válido.");
		}
		this.anoDoIngresso = anoDoIngresso;
	}

	public void setTurma(String turma) {
		if (turma.trim().isEmpty()) {
			throw new IllegalArgumentException("A turma deve ser preenchida.");
		}
		this.turma = turma.trim();
	}

	public Integer getAnoIngresso() {
		return anoDoIngresso;
	}

	public void setMatricula(String matricula) {
		if (matricula.trim().isEmpty()) {
			throw new IllegalArgumentException("A matrícula deve ser preenchida.");
		} else if (!matricula.trim().matches("^[0-9]{3,9}$")) {
			throw new IllegalArgumentException("A matrícula deve ser um campo numérico e com pelo menos 3 posições e menos de 9.");
		}
		this.matricula = matricula.trim();
	}

	@Override
	public String toString() {
		return super.toString() + getMatricula() + ";" + getAnoIngresso().toString() + ";" + getTurma();
	}

}
