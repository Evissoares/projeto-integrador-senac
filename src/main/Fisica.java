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
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("O Nome deve ser preenchido.");
		}
		this.nome = nome.trim();
	}

	public void setSobrenome(String sobrenome) {
		if (sobrenome.trim().isEmpty()) {
			throw new IllegalArgumentException("O Sobrenome deve ser preenchido.");
		}
		this.sobrenome = sobrenome.trim();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.trim().isEmpty()) {
			throw new IllegalArgumentException("O CPF deve ser preenchido.");
		} else if (!cpf.trim().matches("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}$")) {
			throw new IllegalArgumentException("O CPF deve ser válido.");
		}
		this.cpf = cpf.trim();
	}

	@Override
	public String toString() {
		return getCpf() + ";" + getNome() + ";" + getSobrenome() + ";";
	}

	
	
	
	
	
	
	
	
	
	
	

}
