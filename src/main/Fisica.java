package main;

public class Fisica {

	private String nome;
	private String sobrenome;
	private String cpf;

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return getCpf() + ";" + getNome() + ";" + getSobrenome() + ";";
	}

	
	
	
	
	
	
	
	
	
	
	

}
