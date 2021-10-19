package main;

public class Fisica extends Pessoa{
	
	private String dataNascimento;
	private String cpf;
	

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + getCpf() + ";" + getDataNascimento() + ";";
	}

	
	
	
	
	
	
	
	
	
	
	

}
